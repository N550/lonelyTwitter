package ca.ualberta.cs.lonelytwitter;

import java.util.Date;

public class HappyMood extends CurrentMood {
    private Date date;
    private String mood;

    HappyMood(){
        this.date = new Date();
        this.mood = "Happy";
    }
    public Date getDate() { return this.date; }

    public String getMood() {
        return this.mood;
    }
}