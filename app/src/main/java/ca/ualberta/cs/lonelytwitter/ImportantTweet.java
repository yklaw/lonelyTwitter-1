package ca.ualberta.cs.lonelytwitter;

import java.util.Date;
/**
 * Created by yklaw on 1/18/18.
 */

public class ImportantTweet extends Tweet {

    public ImportantTweet(String message) {
        super(message);
    }

    public ImportantTweet(String message, Date date) {
        super(message, date);
    }

    @Override
    public Boolean isImportant() {
        return Boolean.TRUE;
    }


}
