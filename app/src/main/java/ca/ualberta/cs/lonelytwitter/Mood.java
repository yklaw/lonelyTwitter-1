package ca.ualberta.cs.lonelytwitter;

import java.util.Date;

/**
 * Created by yklaw on 1/18/18.
 */

public abstract class Mood {

    private String mood;
    private Date date;


    public Mood(String mood) {
        this.mood = mood;
        this.date = new Date();
    }

    public Mood(String mood, Date date) {
        this.mood = mood;
        this.date = date;
    }

    public Date getDate() {
        return date;
    }

    public void setDate(Date date) {
        this.date = date;
    }

    public String getMood() {
        return this.mood;
    }

    public abstract Boolean isHappy();
}
