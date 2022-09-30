package com.martin;

import jakarta.enterprise.context.ApplicationScoped;
import jakarta.inject.Named;

@Named("poll")
@ApplicationScoped
public class StrawPollBean {
    private PollItem[] pollItems = new PollItem[]{
            new PollItem("https://github.com/fanzeyi/pokemon.json/blob/master/thumbnails/001.png?raw=true", "Bulbasaur"),
            new PollItem("https://github.com/fanzeyi/pokemon.json/blob/master/thumbnails/002.png?raw=true", "Pokemon2"),
            new PollItem("https://github.com/fanzeyi/pokemon.json/blob/master/thumbnails/003.png?raw=true", "Pokemon3"),
            new PollItem("https://github.com/fanzeyi/pokemon.json/blob/master/thumbnails/004.png?raw=true", "Pokemon4"),
    };

    public PollItem[] getPollItems() {
        return pollItems;
    }
}
