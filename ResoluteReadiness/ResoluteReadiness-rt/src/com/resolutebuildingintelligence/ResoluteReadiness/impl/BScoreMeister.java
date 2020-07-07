package com.resolutebuildingintelligence.ResoluteReadiness.impl;

import javax.baja.driver.BDevice;
import javax.baja.driver.BDeviceNetwork;
import javax.baja.job.BSimpleJob;
import javax.baja.naming.BOrd;
import javax.baja.nre.annotations.NiagaraType;
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

    public static BScoreMeister make() {
        return new BScoreMeister();
    }

    @Override
    public void run(Context cx) throws Exception {

        /***
         * Find the remote Niagara hosts connected to this device
         */
        BOrd networkOrd =
            BOrd.make("station:|slot:/Drivers/NiagaraNetwork");
        BDeviceNetwork niagaraNetwork =
            (BDeviceNetwork) networkOrd.get(Sys.getStation(), cx);
        log().message(niagaraNetwork.getSlotPath()
                                    .toDisplayString());
        for (BDevice device : niagaraNetwork.getDevices()) {
            log().message(device.getName());
        }
    }
}
