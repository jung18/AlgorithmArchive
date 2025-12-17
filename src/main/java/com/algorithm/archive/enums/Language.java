package com.algorithm.archive.enums;

public enum Language {

    PYTHON("Python"),
    JAVASCRIPT("Javascript"),
    JAVA("Java"),
    CPP("C++"),
    C("C");

    private final String displayName;

    Language(String displayName) {
        this.displayName = displayName;
    }

    public String getCode() {
        return name();
    }

    public String getDisplayName() {
        return displayName;
    }

}
