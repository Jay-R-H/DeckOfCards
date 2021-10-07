package com.programming;

import java.util.Random;

public class DeckOfCards {

    String[][] cardCombo = new String[4][13];
    String[][] player = new String[4][9];

    String[] suits = {"Club", "Diamond", "Heart", "Spade"};
    String[] rank = {"2", "3", "4", "5", "6", "7", "8", "9", "10", "Jack", "Queen", "King", "Ace"};

    public void setDeck() {
        for (int i = 0; i < suits.length; i++) {
            for (int j = 0; j < rank.length; j++) {
                cardCombo[i][j] = suits[i] + rank[j];
            }
        }
    }

    public void distributeTheCards() {
        int a = 0, b = 0, c = 0, d = 0;
        int num = 1;
        while (num <= 36) {

            int randomSuit = (int) Math.floor(Math.random() * 10) % 4;
            int randomRank = (int) Math.floor(Math.random() * 100) % 13;

            int option = num % 4;

            switch (option) {

                case 0:
                    player[option][a] = cardCombo[randomSuit][randomRank];
                    a++;
                    break;

                case 1:
                    player[option][b] = cardCombo[randomSuit][randomRank];
                    b++;
                    break;

                case 2:
                    player[option][c] = cardCombo[randomSuit][randomRank];
                    c++;
                    break;

                case 3:
                    player[option][d] = cardCombo[randomSuit][randomRank];
                    d++;
                    break;

            }
            num++;
        }

    }

    public void showCards() {
        for (int i = 0; i < 4; i++) {
            System.out.print("player " + (i + 1) + " ");
            for (int j = 0; j < 9; j++) {
                System.out.print(player[i][j] + " ");
            }
            System.out.println();
        }
    }


    public static void main(String[] args) {
        DeckOfCards deckOfCards = new DeckOfCards();
        deckOfCards.setDeck();
        deckOfCards.distributeTheCards();
        deckOfCards.showCards();
    }
}
