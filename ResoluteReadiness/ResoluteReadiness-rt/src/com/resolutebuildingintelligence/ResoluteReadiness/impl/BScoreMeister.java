package com.resolutebuildingintelligence.ResoluteReadiness.impl;

import javax.baja.driver.BDevice;
import javax.baja.driver.BDeviceNetwork;
import javax.baja.job.BSimpleJob;
import javax.baja.naming.BOrd;
import javax.baja.nre.annotations.NiagaraType;
import javax.baja.sys.Context;
import javax.baja.sys.Sys;

@NiagaraType

public class BScoreMeister extends BSimpleJob {

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
