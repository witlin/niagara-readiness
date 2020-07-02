package com.resolutebuildingintelligence.ResoluteReadiness.impl;

import javax.baja.nre.annotations.NiagaraAction;
import javax.baja.nre.annotations.NiagaraProperty;
import javax.baja.nre.annotations.NiagaraType;
import javax.baja.sys.*;

@NiagaraType
@NiagaraProperty(
        name = "timePerPoint",
        type = "baja:RelTime",
        defaultValue = "BRelTime.makeMinutes(10)"
)
@NiagaraProperty(
        name = "scaleMaxTime",
        type = "baja:RelTime",
        defaultValue = "BRelTime.makeMinutes(500)"
)
@NiagaraAction(
        name = "scoreIt",
        flags = Flags.ASYNC
)
public class BResoluteReady extends BComponent {
/*+ ------------ BEGIN BAJA AUTO GENERATED CODE ------------ +*/
/*@ $com.resolutebuildingintelligence.ResoluteReadiness.impl.BResoluteReady(527475642)1.0$ @*/
/* Generated Wed Jul 01 23:23:16 EDT 2020 by Slot-o-Matic (c) Tridium, Inc. 2012 */

////////////////////////////////////////////////////////////////
// Property "timePerPoint"
////////////////////////////////////////////////////////////////
  
  /**
   * Slot for the {@code timePerPoint} property.
   * @see #getTimePerPoint
   * @see #setTimePerPoint
   */
  public static final Property timePerPoint = newProperty(0, BRelTime.makeMinutes(10), null);
  
  /**
   * Get the {@code timePerPoint} property.
   * @see #timePerPoint
   */
  public BRelTime getTimePerPoint() { return (BRelTime)get(timePerPoint); }
  
  /**
   * Set the {@code timePerPoint} property.
   * @see #timePerPoint
   */
  public void setTimePerPoint(BRelTime v) { set(timePerPoint, v, null); }

////////////////////////////////////////////////////////////////
// Property "scaleMaxTime"
////////////////////////////////////////////////////////////////
  
  /**
   * Slot for the {@code scaleMaxTime} property.
   * @see #getScaleMaxTime
   * @see #setScaleMaxTime
   */
  public static final Property scaleMaxTime = newProperty(0, BRelTime.makeMinutes(500), null);
  
  /**
   * Get the {@code scaleMaxTime} property.
   * @see #scaleMaxTime
   */
  public BRelTime getScaleMaxTime() { return (BRelTime)get(scaleMaxTime); }
  
  /**
   * Set the {@code scaleMaxTime} property.
   * @see #scaleMaxTime
   */
  public void setScaleMaxTime(BRelTime v) { set(scaleMaxTime, v, null); }

////////////////////////////////////////////////////////////////
// Type
////////////////////////////////////////////////////////////////
  
  @Override
  public Type getType() { return TYPE; }
  public static final Type TYPE = Sys.loadType(BResoluteReady.class);

/*+ ------------ END BAJA AUTO GENERATED CODE -------------- +*/

}
