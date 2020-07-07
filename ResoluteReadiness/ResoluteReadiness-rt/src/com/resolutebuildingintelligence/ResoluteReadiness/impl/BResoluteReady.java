package com.resolutebuildingintelligence.ResoluteReadiness.impl;

import java.util.logging.Logger;
import javax.baja.job.BJobService;
import javax.baja.nre.annotations.NiagaraAction;
import javax.baja.nre.annotations.NiagaraProperty;
import javax.baja.nre.annotations.NiagaraType;
import javax.baja.sys.*;

@NiagaraType
@NiagaraProperty(
    name = "score",
    type = "ResoluteReadiness:ReadinessScore",
    defaultValue = "BReadinessScore.make()"
)
@NiagaraAction(
    name = "scoreIt",
    flags = Flags.ASYNC
)
public class BResoluteReady extends BComponent {
  
/*+ ------------ BEGIN BAJA AUTO GENERATED CODE ------------ +*/
/*@ $com.resolutebuildingintelligence.ResoluteReadiness.impl.BResoluteReady(3228593720)1.0$ @*/
/* Generated Tue Jul 07 00:10:23 EDT 2020 by Slot-o-Matic (c) Tridium, Inc. 2012 */

////////////////////////////////////////////////////////////////
// Property "score"
////////////////////////////////////////////////////////////////
  
  /**
   * Slot for the {@code score} property.
   * @see #getScore
   * @see #setScore
   */
  public static final Property score = newProperty(0, BReadinessScore.make(), null);
  
  /**
   * Get the {@code score} property.
   * @see #score
   */
  public BReadinessScore getScore() { return (BReadinessScore)get(score); }
  
  /**
   * Set the {@code score} property.
   * @see #score
   */
  public void setScore(BReadinessScore v) { set(score, v, null); }

////////////////////////////////////////////////////////////////
// Action "scoreIt"
////////////////////////////////////////////////////////////////
  
  /**
   * Slot for the {@code scoreIt} action.
   * @see #scoreIt()
   */
  public static final Action scoreIt = newAction(Flags.ASYNC, null);
  
  /**
   * Invoke the {@code scoreIt} action.
   * @see #scoreIt
   */
  public void scoreIt() { invoke(scoreIt, null, null); }

////////////////////////////////////////////////////////////////
// Type
////////////////////////////////////////////////////////////////
  
  @Override
  public Type getType() { return TYPE; }
  public static final Type TYPE = Sys.loadType(BResoluteReady.class);

/*+ ------------ END BAJA AUTO GENERATED CODE -------------- +*/

  private static Logger logger =
      Logger.getLogger("ResoluteReadiness.ResoluteReady");

  /***
   * static factory method
   * @return new instance of BResoluteReady
   */
  public static BResoluteReady make() {
    return new BResoluteReady();
  }

  /***
   * Run the scoring job.
   * @param cx
   */
  public void doScoreIt(Context cx) {
    BJobService.getService()
               .submit(BScoreMeister.make(), cx);
  }
}
