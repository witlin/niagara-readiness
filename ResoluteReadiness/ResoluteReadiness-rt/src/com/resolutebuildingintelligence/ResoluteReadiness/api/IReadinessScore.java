package com.resolutebuildingintelligence.ResoluteReadiness.api;

import com.resolutebuildingintelligence.ResoluteReadiness.api.enumerations.ReadinessState;

import javax.baja.control.BControlPoint;
import java.util.List;

public interface IReadinessScore {

  /***
   * 1. Query the niagara station for all points without history.
   * 2. Test the non-time-series points for history id viability.
   * @return The list of bad points.
   */
  List<BControlPoint> getBadPoints();

  /***
   * The last computed score should be a persistent property of the implementation member.
   * @return Integer value stored in the score property
   */
  Integer getScore();

  /***
   * Compute the readiness score based on the following algorithm:
   * time-to-finish = num-of-bad-points * time-to-finish-per-point
   * score = 100 - (100 - 0)/(scale-max-time - scale-min-time) * time-to-finish
   * update the value in the score property of the implementation member.
   * @return null
   */
  void setScore();

  /***
   * Gets the enumerated value representing current state from the implementation member's
   * state property.
   * @return ReadinessState current state.
   */
  ReadinessState getState();

  /***
   * Sets the current state.
   * @return null
   */
  void setState();
}
