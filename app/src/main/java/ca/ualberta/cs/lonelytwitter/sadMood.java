package ca.ualberta.cs.lonelytwitter;

import java.util.Date;

/**
 * Created by yklaw on 1/18/18.
 */

public class sadMood extends Mood {

    public sadMood (String mood) {
        super(mood);
    }

    public sadMood (String mood, Date date) {
        super(mood, date);
    }

    @Override
    public Boolean isHappy() {
        return Boolean.FALSE;
    }
}
