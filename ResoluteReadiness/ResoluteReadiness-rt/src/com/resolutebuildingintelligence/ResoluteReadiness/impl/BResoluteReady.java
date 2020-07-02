package com.resolutebuildingintelligence.ResoluteReadiness.impl;

import javax.baja.nre.annotations.NiagaraAction;
import javax.baja.nre.annotations.NiagaraType;
import javax.baja.sys.*;

@NiagaraType
@NiagaraAction(
    name = "scoreIt",
    flags = Flags.ASYNC
)
public class BResoluteReady extends BComponent {
  /*+ ------------ BEGIN BAJA AUTO GENERATED CODE ------------ +*/
  /*@ $com.resolutebuildingintelligence.ResoluteReadiness.impl.BResoluteReady(4088663898)1.0$ @*/
  /* Generated Thu Jul 02 12:27:29 EDT 2020 by Slot-o-Matic (c) Tridium, Inc. 2012 */

////////////////////////////////////////////////////////////////
// Action "scoreIt"
////////////////////////////////////////////////////////////////

  /**
   * Slot for the {@code scoreIt} action.
   *
   * @see #scoreIt()
   */
  public static final Action scoreIt = newAction(Flags.ASYNC, null);
  public static final Type TYPE = Sys.loadType(BResoluteReady.class);

////////////////////////////////////////////////////////////////
// Type
////////////////////////////////////////////////////////////////

  /**
   * Invoke the {@code scoreIt} action.
   *
   * @see #scoreIt
   */
  public void scoreIt() {
    invoke(scoreIt, null, null);
  }

  @Override
  public Type getType() {
    return TYPE;
  }

  /*+ ------------ END BAJA AUTO GENERATED CODE -------------- +*/

}
