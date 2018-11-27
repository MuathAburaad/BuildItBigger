package com.example.android.givemejoke;

import java.util.ArrayList;
import java.util.List;
import java.util.Random;

public class Joke {

    private static ArrayList<String> jokes;
    public List<String> listOfJokes(){
        initJokesList();
        return jokes;
    }
    public String randomJoke(){
        initJokesList();
        Random random = new Random();
        return jokes.get(random.nextInt(9));
    }
    private void initJokesList(){
        if(jokes == null){
            jokes = new ArrayList<>();
            jokes.add("Q. Why do Dasher and Dancer love coffee?\nA. Because they’re Santa’s star bucks!");
            jokes.add("Q. What’s a banana peel’s favorite type of shoe?\nA. Slippers!");
            jokes.add("Q. What does the Gingerbread Man use to make his bed?\nA. Cookie sheets!");
            jokes.add("Q. What do you call an outlaw who steals gift wrapping from the rich to give to the poor?\nA. Ribbon Hood.");
            jokes.add("Q. What do you get if you cross a Christmas tree with an iPad?\nA. A pineapple! By Zoey Y., Flower Mound, Tex.");
            jokes.add("Q. What did the big flower say to the little flower?\nA. Hi, bud!");
            jokes.add("Q. If pilgrims traveled on the Mayflower, what do college students travel on?\nA. Scholar ships.");
            jokes.add("Q. What did sick people do on the Mayflower?\nA. They went to the dock!");
            jokes.add("Q. How is the alphabet different on Christmas from every other day?\nA. There’s Noel!");
        }
    }
}
