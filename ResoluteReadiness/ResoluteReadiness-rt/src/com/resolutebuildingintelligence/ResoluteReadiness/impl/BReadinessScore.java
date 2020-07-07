package com.resolutebuildingintelligence.ResoluteReadiness.impl;

import com.resolutebuildingintelligence.ResoluteReadiness.api.IReadinessScore;
import java.util.ArrayList;
import java.util.List;
import java.util.Map;
import java.util.logging.Logger;
import javax.baja.collection.BITable;
import javax.baja.control.BControlPoint;
import javax.baja.naming.BOrd;
import javax.baja.nre.annotations.Facet;
import javax.baja.nre.annotations.NiagaraProperty;
import javax.baja.nre.annotations.NiagaraType;
import javax.baja.sys.BFacets;
import javax.baja.sys.BObject;
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
    flags = Flags.READONLY,
    facets = {
        @Facet(name = "BFacets.MIN", value = "BInteger.make(0)"),
        @Facet(name = "BFacets.MAX", value = "BInteger.make(100)")
    }
)
@NiagaraProperty(
    name = "scoreLabel",
    type = "baja:String",
    defaultValue = "BString.make(\"\")",
    flags = Flags.READONLY
)
@NiagaraProperty(
    name = "scoreDesc",
    type = "baja:String",
    defaultValue = "BString.make(\"\")",
    flags = Flags.READONLY,
    facets = { @Facet(name = "BFacets.MULTI_LINE", value = "true") }
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
    flags = Flags.READONLY,
    facets = {
        @Facet(name = "BFacets.MIN", value = "BRelTime.makeMinutes(0)"),
        @Facet(name = "BFacets.MAX", value = "BRelTime.makeMinutes(100000)")
    }
)
@NiagaraProperty(
    name = "stateColor",
    type = "baja:String",
    defaultValue = "BString.make(\"\")",
    flags = Flags.READONLY
)
@NiagaraProperty(
    name = "timePerPoint",
    type = "baja:RelTime",
    defaultValue = "BRelTime.makeMinutes(10)",
    flags = Flags.HIDDEN,
    facets = {
        @Facet(name = "BFacets.MIN", value = "BRelTime.makeMinutes(0)"),
        @Facet(name = "BFacets.MAX", value = "BRelTime.makeMinutes(120)")
    }
)
@NiagaraProperty(
    name = "scaleMaxTime",
    type = "baja:RelTime",
    defaultValue = "BRelTime.makeMinutes(500)",
    flags = Flags.HIDDEN,
    facets = {
        @Facet(name = "BFacets.MIN", value = "BRelTime.makeMinutes(0)"),
        @Facet(name = "BFacets.MAX", value = "BRelTime.makeMinutes(1000)")
    }
)

public class BReadinessScore extends BComponent implements IReadinessScore {
  
/*+ ------------ BEGIN BAJA AUTO GENERATED CODE ------------ +*/
/*@ $com.resolutebuildingintelligence.ResoluteReadiness.impl.BReadinessScore(1816705029)1.0$ @*/
/* Generated Thu Jul 02 15:39:33 EDT 2020 by Slot-o-Matic (c) Tridium, Inc. 2012 */

////////////////////////////////////////////////////////////////
// Property "score"
////////////////////////////////////////////////////////////////
  
  /**
   * Slot for the {@code score} property.
   * @see #getScore
   * @see #setScore
   */
  public static final Property score = newProperty(Flags.READONLY, ((BInteger)(BInteger.make(0))).getInt(), BFacets.make(BFacets.make(BFacets.MIN, BInteger.make(0)), BFacets.make(BFacets.MAX, BInteger.make(100))));
  
  /**
   * Get the {@code score} property.
   * @see #score
   */
  public int getScore() { return getInt(score); }
  
  /**
   * Set the {@code score} property.
   * @see #score
   */
  public void setScore(int v) { setInt(score, v, null); }

////////////////////////////////////////////////////////////////
// Property "scoreLabel"
////////////////////////////////////////////////////////////////
  
  /**
   * Slot for the {@code scoreLabel} property.
   * @see #getScoreLabel
   * @see #setScoreLabel
   */
  public static final Property scoreLabel = newProperty(Flags.READONLY, BString.make(""), null);
  
  /**
   * Get the {@code scoreLabel} property.
   * @see #scoreLabel
   */
  public String getScoreLabel() { return getString(scoreLabel); }
  
  /**
   * Set the {@code scoreLabel} property.
   * @see #scoreLabel
   */
  public void setScoreLabel(String v) { setString(scoreLabel, v, null); }

////////////////////////////////////////////////////////////////
// Property "scoreDesc"
////////////////////////////////////////////////////////////////
  
  /**
   * Slot for the {@code scoreDesc} property.
   * @see #getScoreDesc
   * @see #setScoreDesc
   */
  public static final Property scoreDesc = newProperty(Flags.READONLY, BString.make(""), BFacets.make(BFacets.MULTI_LINE, true));
  
  /**
   * Get the {@code scoreDesc} property.
   * @see #scoreDesc
   */
  public String getScoreDesc() { return getString(scoreDesc); }
  
  /**
   * Set the {@code scoreDesc} property.
   * @see #scoreDesc
   */
  public void setScoreDesc(String v) { setString(scoreDesc, v, null); }

////////////////////////////////////////////////////////////////
// Property "totalBadPts"
////////////////////////////////////////////////////////////////
  
  /**
   * Slot for the {@code totalBadPts} property.
   * @see #getTotalBadPts
   * @see #setTotalBadPts
   */
  public static final Property totalBadPts = newProperty(Flags.READONLY, ((BInteger)(BInteger.make(0))).getInt(), null);
  
  /**
   * Get the {@code totalBadPts} property.
   * @see #totalBadPts
   */
  public int getTotalBadPts() { return getInt(totalBadPts); }
  
  /**
   * Set the {@code totalBadPts} property.
   * @see #totalBadPts
   */
  public void setTotalBadPts(int v) { setInt(totalBadPts, v, null); }

////////////////////////////////////////////////////////////////
// Property "time2Ready"
////////////////////////////////////////////////////////////////
  
  /**
   * Slot for the {@code time2Ready} property.
   * @see #getTime2Ready
   * @see #setTime2Ready
   */
  public static final Property time2Ready = newProperty(Flags.READONLY, BRelTime.makeMinutes(0), BFacets.make(BFacets.make(BFacets.MIN, BRelTime.makeMinutes(0)), BFacets.make(BFacets.MAX, BRelTime.makeMinutes(100000))));
  
  /**
   * Get the {@code time2Ready} property.
   * @see #time2Ready
   */
  public BRelTime getTime2Ready() { return (BRelTime)get(time2Ready); }
  
  /**
   * Set the {@code time2Ready} property.
   * @see #time2Ready
   */
  public void setTime2Ready(BRelTime v) { set(time2Ready, v, null); }

////////////////////////////////////////////////////////////////
// Property "stateColor"
////////////////////////////////////////////////////////////////
  
  /**
   * Slot for the {@code stateColor} property.
   * @see #getStateColor
   * @see #setStateColor
   */
  public static final Property stateColor = newProperty(Flags.READONLY, BString.make(""), null);
  
  /**
   * Get the {@code stateColor} property.
   * @see #stateColor
   */
  public String getStateColor() { return getString(stateColor); }
  
  /**
   * Set the {@code stateColor} property.
   * @see #stateColor
   */
  public void setStateColor(String v) { setString(stateColor, v, null); }

////////////////////////////////////////////////////////////////
// Property "timePerPoint"
////////////////////////////////////////////////////////////////
  
  /**
   * Slot for the {@code timePerPoint} property.
   * @see #getTimePerPoint
   * @see #setTimePerPoint
   */
  public static final Property timePerPoint = newProperty(Flags.HIDDEN, BRelTime.makeMinutes(10), BFacets.make(BFacets.make(BFacets.MIN, BRelTime.makeMinutes(0)), BFacets.make(BFacets.MAX, BRelTime.makeMinutes(120))));
  
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
  public static final Property scaleMaxTime = newProperty(Flags.HIDDEN, BRelTime.makeMinutes(500), BFacets.make(BFacets.make(BFacets.MIN, BRelTime.makeMinutes(0)), BFacets.make(BFacets.MAX, BRelTime.makeMinutes(1000))));
  
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
  public static final Type TYPE = Sys.loadType(BReadinessScore.class);

  /*+ ------------ END BAJA AUTO GENERATED CODE -------------- +*/


  private static Logger logger =
      Logger.getLogger("ResoluteReadiness.BReadinessScore");

  public static BReadinessScore make() {
    return new BReadinessScore();
  }

  /***
   * 1. Check for remote Niagara hosts, if there aren't any go to 1a, otherwise go to 1b.
   * 1a. Query the niagara station for all points without history.
   * 2a. Test the non-time-series points for history id viability.
   * 1b. Query all hosts excluding the localhost for all points without history.
   * 2b. Test the non-time-series points for history id viability and collect a list of bad
   *     points for each host (localhost NOT included)
   * @return The list of lists of bad points. with only one map entry if there aren't any
   *         remote hosts.
   */
  @Override
  public Map<String, List<BControlPoint>> findBadPoints() {



    //TODO
    return null;
  }

  /***
   * Compute the readiness score based on the following algorithm:
   * time-to-finish = num-of-bad-points * time-to-finish-per-point
   * score = 100 - (100 - 0)/(scale-max-time - scale-min-time) * time-to-finish
   * update the value in the score property of the implementation member.
   * @return null
   */
  @Override
  public void computeScore() {
    //TODO
  }

  /***
   * Compute and update the current state.
   * @return null
   */
  @Override
  public void computeState() {
    //TODO
  }
}
