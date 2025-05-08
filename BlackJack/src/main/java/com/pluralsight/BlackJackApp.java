package com.pluralsight;

import java.util.Scanner;

public class BlackJackApp {

    public static void main(String[] args) {
        //Scanner to enter players name
        Scanner playerName = new Scanner(System.in);

        //create the deck
        Deck deck = new Deck();
        //Shuffle deck
        deck.shuffle();

        //Ask for players name
        System.out.println("Enter name of Player 1: ");
        String name1 = playerName.nextLine();
        Player p1 = new Player(name1);

        System.out.println("Enter name of Player 2: ");
        String name2 = playerName.nextLine();
        Player p2 = new Player(name2);

        //Spacing
        System.out.println();

        // deal 2 cards from the deck to each player and add them to the hand
        for (int i = 0; i < 2; i++) {
            // get a card from the deck
            Card card1 = deck.deal();
            //shows value of cards
            card1.flip();
            // deal that card to the hand
            p1.getHand().deal(card1);

            // get a card from the deck
            Card card2 = deck.deal();
            //shows value of cards
            card2.flip();
            // deal that card to the hand
            p2.getHand().deal(card2);
        }

        //print and shows the value of all the cards in the hand
        System.out.println(p1.getName() + "'s hand:");
        p1.getHand().showCards();
        System.out.println("This hand is worth " + p1.getHand().getValue());

        //Spacing
        System.out.println();

        System.out.println(p2.getName() + "'s hand:");
        p2.getHand().showCards();
        System.out.println("This hand is worth " + p2.getHand().getValue());


    }

}