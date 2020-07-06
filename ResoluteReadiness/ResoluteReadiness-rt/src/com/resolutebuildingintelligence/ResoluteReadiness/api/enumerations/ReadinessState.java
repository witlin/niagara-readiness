package com.resolutebuildingintelligence.ResoluteReadiness.api.enumerations;

public enum ReadinessState {
  READY,
  NEEDS_SOME_WORK,
  NEEDS_LOTS_OF_WORK;

  private final String[] labels = {
      "Ready",
      "Needs some work",
      "Needs a lot of work!"};
  private final String[] descriptions = {
      "a score of 100 to 75",
      "a score of 74 to 50",
      "a score lower than 50"};
  private final String[] colors_text = {
      "green",
      "yellow",
      "red"};
  private final String[] colors_hex = {
      "#008000",
      "#FFFF00",
      "#FF0000"};
}
