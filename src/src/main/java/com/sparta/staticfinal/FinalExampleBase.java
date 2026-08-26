package com.sparta.staticfinal;

//  'final' blocks inheritance of this class.

public final class FinalExampleBase {

    //  Final blocks changes to variable.

    private final int score = 100;

    //  'final' blocks @override usage.

    public final int getScore() {
        return score;
    }

}