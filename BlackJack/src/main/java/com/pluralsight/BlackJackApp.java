package com.pluralsight;

public class BlackJackApp {

    public static void main(String[] args) {

        //create the deck
        Deck deck = new Deck();
        //Shuffle deck
        deck.shuffle();
        //create the hand
        Hand hand1 = new Hand();

        // deal 2 cards from the deck and add them to the hand
        for (int i = 0; i < 2; i++) {
            // get a card from the deck
            Card card = deck.deal();
            //
            card.flip();
            // deal that card to the hand
            hand1.deal(card);
        }

        //print out the value of all the cards in the hand
        System.out.println("This hand is worth " + hand1.getValue());
    }

}