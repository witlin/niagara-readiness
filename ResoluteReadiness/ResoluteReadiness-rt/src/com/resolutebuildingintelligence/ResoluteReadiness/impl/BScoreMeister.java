package com.resolutebuildingintelligence.ResoluteReadiness.impl;

import com.tridium.fox.sys.BFoxClientConnection;
import com.tridium.nd.BNiagaraStation;
import java.util.logging.Logger;
import javax.baja.collection.BITable;
import javax.baja.collection.TableCursor;
import javax.baja.driver.BDevice;
import javax.baja.driver.BDeviceNetwork;
import javax.baja.job.BSimpleJob;
import javax.baja.naming.BHost;
import javax.baja.naming.BOrd;
import javax.baja.nre.annotations.NiagaraType;
import javax.baja.security.BPassword;
import javax.baja.sys.BObject;
import javax.baja.sys.Context;
import javax.baja.sys.Sys;
import javax.baja.sys.Type;

@NiagaraType

public class BScoreMeister extends BSimpleJob {
/*+ ------------ BEGIN BAJA AUTO GENERATED CODE ------------ +*/
/*@ $com.resolutebuildingintelligence.ResoluteReadiness.impl.BScoreMeister(2979906276)1.0$ @*/
/* Generated Tue Jul 07 02:12:21 EDT 2020 by Slot-o-Matic (c) Tridium, Inc. 2012 */

////////////////////////////////////////////////////////////////
// Type
////////////////////////////////////////////////////////////////
  
  @Override
  public Type getType() { return TYPE; }
  public static final Type TYPE = Sys.loadType(BScoreMeister.class);

/*+ ------------ END BAJA AUTO GENERATED CODE -------------- +*/

  private static Logger logger =
      Logger.getLogger("ResoluteReadiness");

  public static BScoreMeister make(){
      return new BScoreMeister();
    }

    @SuppressWarnings("unchecked")
    @Override
    public void run(Context cx) throws Exception {

      BReadinessScore score = null;

      // Find the remote Niagara hosts connected to this device
      BOrd networkOrd =
          BOrd.make("station:|slot:/Drivers/NiagaraNetwork");
      BDeviceNetwork niagaraNetwork =
          (BDeviceNetwork) networkOrd.get(Sys.getStation(), cx);

      // Check to see whether there are remote station clients connected
      // to the Supervisor.
      if(niagaraNetwork.getDevices().length > 0) {

        BOrd caller = BOrd.make("station:|slot:/|"
            + "bql:select name from baja:Component "
            + "where type = 'ResoluteReadiness:ReadinessScore'");
        BITable<BObject> t =
            (BITable<BObject>) caller.resolve(Sys.getStation()).get();
        TableCursor<BObject> c = t.cursor();
        while(c.next()) {
          try {
            score = (BReadinessScore) c.get();
          } catch(Exception e) {
            log().failed("ERROR", e);
            logger.severe("ERROR ".concat(e.getMessage()));
            e.printStackTrace();
          }
        }
        log().message("Readiness Score initialized");

        // Iterate the niagara devices
        for (BDevice device : niagaraNetwork.getDevices()) {

          //Gather fox client connection info
          BNiagaraStation station = (BNiagaraStation) device;
          BHost host = device.getHost();
          int port = station.getFoxPort();
          BOrd address = station.getAddress();
          BFoxClientConnection foxClientConnection =
              station.getClientConnection();
          boolean isFoxs = foxClientConnection.getUseFoxs();

          if(score != null) {
            String username = score.getRemoteUser();
            BPassword userpass = score.getRemotePass();
            logger.info("Connection Info: ");
            logger.info(device.getName());
            logger.info("host: ".concat(host.toString(cx)));
            logger.info("port: ".concat(String.valueOf(port)));
            logger.info("address: ".concat(address.encodeToString()));
            logger.info("FOXS? ".concat(isFoxs?"Yes":"No"));
            logger.info("User: ".concat(username));

            //TODO - called from the BReadinessScore component

          } else {
            Exception e = new RuntimeException("Could not initiate FOX connection, "
                + "while the score reference is null...!");
            logger.severe(e.getLocalizedMessage());
            log().endFailed(e);
            throw e;
          }
        }
      } else {
        //TODO - only need to check for bad points in the supervisor...
      }
    }
}
