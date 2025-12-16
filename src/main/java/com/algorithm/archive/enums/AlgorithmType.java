package com.algorithm.archive.enums;

public enum AlgorithmType {

    // 완전탐색 / 구현
    BRUTE_FORCE("완전 탐색"),
    IMPLEMENTATION("구현"),

    // 탐색
    DFS("깊이 우선 탐색"),
    BFS("너비 우선 탐색"),
    BINARY_SEARCH("이분 탐색"),

    // 자료구조
    STACK("스택"),
    QUEUE("큐"),
    HEAP("힙"),
    HASH("해시"),
    SET("집합"),
    MAP("맵"),

    // 그래프
    GRAPH("그래프"),
    SHORTEST_PATH("최단 경로"),
    DIJKSTRA("다익스트라"),
    BELLMAN_FORD("벨만-포드"),
    FLOYD_WARSHALL("플로이드-워셜"),
    MST("최소 신장 트리"),

    // 동적계획법
    DP("동적 계획법"),

    // 그리디
    GREEDY("그리디"),

    // 수학
    MATH("수학"),
    NUMBER_THEORY("정수론"),

    // 문자열
    STRING("문자열"),
    TRIE("트라이"),

    // 기타
    TWO_POINTER("투 포인터"),
    SLIDING_WINDOW("슬라이딩 윈도우"),
    BACKTRACKING("백트래킹");

    private final String displayName;

    AlgorithmType(String displayName) {
        this.displayName = displayName;
    }

    public String getCode() {
        return name();
    }

    public String getDisplayName() {
        return displayName;
    }
}


