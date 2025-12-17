package com.algorithm.archive.enums;

public enum ProblemLevel {

    LEVEL_1("Lv.1"),
    LEVEL_2("Lv.2"),
    LEVEL_3("Lv.3"),
    LEVEL_4("Lv.4"),
    LEVEL_5("Lv.5");

    private final String displayName;

    ProblemLevel(String displayName) {
        this.displayName = displayName;
    }

    public String getCode() {
        return name();
    }

    public String getDisplayName() {
        return displayName;
    }

}
