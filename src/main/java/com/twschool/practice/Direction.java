package com.twschool.practice;

public enum Direction {
    N,W,S,E;

    public  Direction leftdirection() {
        if (this == N) {
            return W;
        }
        if (this == W) {
            return S;
        }
        if (this == S) {
            return E;
        }
        if (this == E) {
            return N;
        }
        return null;
    }
    public  Direction rightdirection() {
        if (this == N) {
            return E;
        }
        if (this == W) {
            return N;
        }
        if (this == S) {
            return W;
        }
        if (this == E) {
            return S;
        }
        return null;
    }

}
