package ca.ualberta.cs.lonelytwitter;

import java.util.Date;

/**
 * Created by yklaw on 1/18/18.
 */

public class happyMood extends Mood {

    public happyMood (String mood) {
        super(mood);
    }

    public happyMood (String mood, Date date) {
        super(mood, date);
    }
    @Override
    public Boolean isHappy() {
        return Boolean.TRUE;
    }
}
