package com.pluralsight;

import java.util.Scanner;

public class FamousQuotes {
    static Scanner input = new Scanner(System.in);

    public static void main(String[] args) {
        String[] robinQuotes = {
                "Fools who don't respect the past are doomed to repeat it.",
                "I want to live! Take me out to sea with you!",
                "When you have a hard time, just laugh. Like this: Dereshishishi!",
                "There is no such thing as being born into the world to be alone.",
                "History may repeat itself, but humans cannot return to the past.",
                "Sometimes the only thing you have to doubt is your own common sense.",
                "The things you cannot see are the ones that can destroy you.",
                "Knowledge is not something you can just get... it is something you must earn.",
                "My dream was just to find the Poneglyphs. But now, I have a new dream: to see my friends' dreams come true.",
                "Even if I'm small, I'll protect them with everything I have."
        };

        System.out.println("Enter quote number: (1-10)");
        int quoteSelection = input.nextInt();

        try{
        System.out.print(robinQuotes[quoteSelection-1]);
        } catch (Exception e) {
            System.out.println("Invalid Number, please select a number 1-10");
            int quoteReselection = input.nextInt();
            System.out.print(robinQuotes[quoteReselection-1]);
        }



    }

}
