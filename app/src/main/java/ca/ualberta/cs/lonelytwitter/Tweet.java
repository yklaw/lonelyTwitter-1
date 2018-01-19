package ca.ualberta.cs.lonelytwitter;

import java.util.*;

/**
 * Created by yklaw on 1/18/18.
 */

public abstract class Tweet implements Tweetable {

    private String message;
    private Date date;
    private List<Mood> moodList = new ArrayList<Mood>();

    public Tweet(String message) {
        this.message = message;
        this.date = new Date();
    }

    public Tweet(String message, Date date) {
        this.message = message;
        this.date = date;
    }

    public Date getDate() {
        return date;
    }

    public void setDate(Date date) {
        this.date = date;
    }

    public String getMessage() {
        return this.message;
    }

    public void setMessage(String message) throws TweetTooLongException {
        if (message.length() > 140) {
            throw new TweetTooLongException();
        } else {
            this.message = message;
        }
    }

    public void addMood(Mood mood) {

        moodList.add(mood);
    }

    public abstract Boolean isImportant();

}
