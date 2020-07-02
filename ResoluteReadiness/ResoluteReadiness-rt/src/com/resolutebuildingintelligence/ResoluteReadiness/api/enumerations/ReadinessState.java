package com.resolutebuildingintelligence.ResoluteReadiness.api.enumerations;

public enum ReadinessState {
    READY,
    NEEDS_SOME_WORK,
    NEEDS_LOTS_OF_WORK;

    private String[] labels = {
                                "Ready",
                                "Needs some work",
                                "Needs a lot of work!"};
    private String[] descriptions = {
        "a score of 100 to 75",
        "a score of 74 to 50",
        "a score lower than 50"
    };

    private String[] colors_text = { "green", "yellow", "red" };
    private String[] colors_hex = {"", "", ""};
}
