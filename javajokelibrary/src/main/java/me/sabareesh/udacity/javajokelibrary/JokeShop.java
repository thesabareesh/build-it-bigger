package me.sabareesh.udacity.javajokelibrary;

import java.util.Random;

public class JokeShop {

    private static final String[] JOKES={
            "If at first you don't succeed; call it version 1.0.",
            "My software never has bugs. It just develops random features.",
            "I would love to change the world, but they won't give me the source code.",
            "The code that is the hardest to debug is the code that you know cannot possibly be wrong.",
            "Beware of programmers that carry screwdrivers.",
            "Programming today is a race between software engineers striving to build bigger and better idiot-proof programs, and the Universe trying to produce bigger and better idiots. So far, the Universe is winning.",
            "The beginning of the programmer's wisdom is understanding the difference between getting program to run and having a runnable program.",
            "I'm not anti-social; I'm just not user friendly.",
            "Hey! It compiles! Ship it!",
            "If Ruby is not and Perl is the answer, you don't understand the question.",
            "The more I C, the less I see.",
            "If you give someone a program, you will frustrate them for a day; if you teach them how to program, you will frustrate them for a lifetime.",
            "Programmers are tools for converting caffeine into code.",
            "My attitude isn't bad. It's in beta"
    };

    public static String getAJoke(){
        Random random  = new Random();
        int randomIndex  = random.nextInt(JOKES.length);
        return JOKES[randomIndex];
    }
}
