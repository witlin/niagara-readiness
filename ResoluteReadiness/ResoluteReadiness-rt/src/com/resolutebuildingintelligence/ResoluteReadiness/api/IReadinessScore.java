package com.resolutebuildingintelligence.ResoluteReadiness.api;

import com.resolutebuildingintelligence.ResoluteReadiness.api.enumerations.ReadinessState;

import java.util.Map;
import javax.baja.control.BControlPoint;
import java.util.List;

public interface IReadinessScore {

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
  Map<String, List<BControlPoint>> findBadPoints();

  /***
   * Compute the readiness score based on the following algorithm:
   * time-to-finish = num-of-bad-points * time-to-finish-per-point
   * score = 100 - (100 - 0)/(scale-max-time - scale-min-time) * time-to-finish
   * update the value in the score property of the implementation member.
   * @return null
   */
  void computeScore();

  /***
   * Compute and update the current state.
   * @return null
   */
  void computeState();
}
