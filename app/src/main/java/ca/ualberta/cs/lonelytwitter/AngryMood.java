package ca.ualberta.cs.lonelytwitter;

import java.util.Date;

public class AngryMood extends CurrentMood {
    private Date date;
    private String mood;

    AngryMood(){
        this.date = new Date();
        this.mood = "Angry";
    }
    public Date getDate() { return this.date; }

    public String getMood() {
        return this.mood;
    }
}
