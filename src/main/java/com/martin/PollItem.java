package com.martin;

public class PollItem {
    private String image;
    private String title;
    private int votes;

    public PollItem(String image, String title) {
        this.image = image;
        this.title = title;
        votes = 0;
    }

    public void addVote() {
        this.votes++;
    }

    public String getImage() {
        return image;
    }

    public String getTitle() {
        return title;
    }

    public int getVotes() {
        return votes;
    }
}
