package com.resolutebuildingintelligence.ResoluteReadiness.impl;

import javax.baja.nre.annotations.NiagaraProperty;
import javax.baja.nre.annotations.NiagaraType;
import javax.baja.sys.Sys;
import javax.baja.sys.Type;
import javax.baja.sys.Flags;
import javax.baja.sys.Property;
import javax.baja.sys.BString;
import javax.baja.sys.BInteger;
import javax.baja.sys.BRelTime;
import javax.baja.sys.BComponent;

@NiagaraType
@NiagaraProperty(
    name = "score",
    type = "baja:Integer",
    defaultValue = "BInteger.make(0)",
    flags = Flags.READONLY
)
@NiagaraProperty(
    name = "score_label",
    type = "baja:String",
    defaultValue = "BString.make(\"\")",
    flags = Flags.READONLY
)
@NiagaraProperty(
    name = "score_desc",
    type = "baja:String",
    defaultValue = "BString.make(\"\")",
    flags = Flags.READONLY
)
@NiagaraProperty(
    name = "totalBadPts",
    type = "baja:Integer",
    defaultValue = "BInteger.make(0)",
    flags = Flags.READONLY
)
@NiagaraProperty(
    name = "time2Ready",
    type = "baja:RelTime",
    defaultValue = "BRelTime.makeMinutes(0)",
    flags = Flags.READONLY
)
//TODO - STATE PROPERTY...

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

public class BReadinessScore extends BComponent {
  /*+ ------------ BEGIN BAJA AUTO GENERATED CODE ------------ +*/
  /*@ $com.resolutebuildingintelligence.ResoluteReadiness.impl.BReadinessScore(3119599650)1.0$ @*/
  /* Generated Thu Jul 02 12:27:29 EDT 2020 by Slot-o-Matic (c) Tridium, Inc. 2012 */

////////////////////////////////////////////////////////////////
// Property "score"
////////////////////////////////////////////////////////////////

  /**
   * Slot for the {@code score} property.
   *
   * @see #getScore
   * @see #setScore
   */
  public static final Property score = newProperty(Flags.READONLY,
      BInteger.make(0).getInt(), null);
  /**
   * Slot for the {@code score_label} property.
   *
   * @see #getScore_label
   * @see #setScore_label
   */
  public static final Property score_label = newProperty(Flags.READONLY, BString.make(""), null);
  /**
   * Slot for the {@code score_desc} property.
   *
   * @see #getScore_desc
   * @see #setScore_desc
   */
  public static final Property score_desc = newProperty(Flags.READONLY, BString.make(""), null);

////////////////////////////////////////////////////////////////
// Property "score_label"
////////////////////////////////////////////////////////////////
  /**
   * Slot for the {@code totalBadPts} property.
   *
   * @see #getTotalBadPts
   * @see #setTotalBadPts
   */
  public static final Property totalBadPts = newProperty(Flags.READONLY,
      BInteger.make(0).getInt(), null);
  /**
   * Slot for the {@code time2Ready} property.
   *
   * @see #getTime2Ready
   * @see #setTime2Ready
   */
  public static final Property time2Ready = newProperty(Flags.READONLY, BRelTime.makeMinutes(0),
      null);
  /**
   * Slot for the {@code timePerPoint} property.
   *
   * @see #getTimePerPoint
   * @see #setTimePerPoint
   */
  public static final Property timePerPoint = newProperty(0, BRelTime.makeMinutes(10), null);

////////////////////////////////////////////////////////////////
// Property "score_desc"
////////////////////////////////////////////////////////////////
  /**
   * Slot for the {@code scaleMaxTime} property.
   *
   * @see #getScaleMaxTime
   * @see #setScaleMaxTime
   */
  public static final Property scaleMaxTime = newProperty(0, BRelTime.makeMinutes(500), null);
  public static final Type TYPE = Sys.loadType(BReadinessScore.class);

  /**
   * Get the {@code score} property.
   *
   * @see #score
   */
  public int getScore() {
    return getInt(score);
  }

////////////////////////////////////////////////////////////////
// Property "totalBadPts"
////////////////////////////////////////////////////////////////

  /**
   * Set the {@code score} property.
   *
   * @see #score
   */
  public void setScore(int v) {
    setInt(score, v, null);
  }

  /**
   * Get the {@code score_label} property.
   *
   * @see #score_label
   */
  public String getScore_label() {
    return getString(score_label);
  }

  /**
   * Set the {@code score_label} property.
   *
   * @see #score_label
   */
  public void setScore_label(String v) {
    setString(score_label, v, null);
  }

////////////////////////////////////////////////////////////////
// Property "time2Ready"
////////////////////////////////////////////////////////////////

  /**
   * Get the {@code score_desc} property.
   *
   * @see #score_desc
   */
  public String getScore_desc() {
    return getString(score_desc);
  }

  /**
   * Set the {@code score_desc} property.
   *
   * @see #score_desc
   */
  public void setScore_desc(String v) {
    setString(score_desc, v, null);
  }

  /**
   * Get the {@code totalBadPts} property.
   *
   * @see #totalBadPts
   */
  public int getTotalBadPts() {
    return getInt(totalBadPts);
  }

////////////////////////////////////////////////////////////////
// Property "timePerPoint"
////////////////////////////////////////////////////////////////

  /**
   * Set the {@code totalBadPts} property.
   *
   * @see #totalBadPts
   */
  public void setTotalBadPts(int v) {
    setInt(totalBadPts, v, null);
  }

  /**
   * Get the {@code time2Ready} property.
   *
   * @see #time2Ready
   */
  public BRelTime getTime2Ready() {
    return (BRelTime) get(time2Ready);
  }

  /**
   * Set the {@code time2Ready} property.
   *
   * @see #time2Ready
   */
  public void setTime2Ready(BRelTime v) {
    set(time2Ready, v, null);
  }

////////////////////////////////////////////////////////////////
// Property "scaleMaxTime"
////////////////////////////////////////////////////////////////

  /**
   * Get the {@code timePerPoint} property.
   *
   * @see #timePerPoint
   */
  public BRelTime getTimePerPoint() {
    return (BRelTime) get(timePerPoint);
  }

  /**
   * Set the {@code timePerPoint} property.
   *
   * @see #timePerPoint
   */
  public void setTimePerPoint(BRelTime v) {
    set(timePerPoint, v, null);
  }

  /**
   * Get the {@code scaleMaxTime} property.
   *
   * @see #scaleMaxTime
   */
  public BRelTime getScaleMaxTime() {
    return (BRelTime) get(scaleMaxTime);
  }

////////////////////////////////////////////////////////////////
// Type
////////////////////////////////////////////////////////////////

  /**
   * Set the {@code scaleMaxTime} property.
   *
   * @see #scaleMaxTime
   */
  public void setScaleMaxTime(BRelTime v) {
    set(scaleMaxTime, v, null);
  }

  @Override
  public Type getType() {
    return TYPE;
  }

  /*+ ------------ END BAJA AUTO GENERATED CODE -------------- +*/
}
