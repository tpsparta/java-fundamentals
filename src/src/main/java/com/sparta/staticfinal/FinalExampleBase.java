package com.sparta.staticfinal;

//  'final' blocks inheritance of this class.

public final class FinalExampleBase {

    //  Final blocks changes to variable.

    private final int score = 100;

    private int score2 = 100;

    //  'final' blocks @override usage.

    public final int getScore() {
        return score;
    }

    public void setScore(final int score2) {

        //  'final' prevents argument from being changed.
        //score2 += 1;
    }

}