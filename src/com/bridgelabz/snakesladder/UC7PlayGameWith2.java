package com.bridgelabz.snakesladder;

import java.util.Random;

    public class UC7PlayGameWith2{
        public static void main(String[] args) {

            System.out.println("This is two player game");
            int player1Position = 0;
            int player2Position = 0;
            System.out.println("player 1 position is=" + player1Position);
            System.out.println("player 1 position is=" + player2Position);
            while (player1Position != 100 && player1Position != 100) {
                //player1
                System.out.println("player 1 roll");
                player1Position += playerRoll(player1Position);
                if (player1Position < 0) {
                    player1Position = 0;
                }
                System.out.println("player 1 position is=" + player1Position);
                if (player1Position == 100) {
                    System.out.println("player1 win the game");
                    break;
                }
                //player2
                System.out.println("player 2 roll");
                player2Position += playerRoll(player2Position);
                if (player2Position < 0) {
                    player2Position = 0;
                }
                System.out.println("player 2 position is=" + player2Position);
                if (player1Position == 100) {
                    System.out.println("player2 win the game");
                    break;
                }
            }
        }
        public static int playerRoll(int playerPosition){
            int position=0;
            int playTime=1;
            Random random=new Random();
            while (playTime!=0) {
                int diceRoll = random.nextInt(1, 7);
                int option = random.nextInt(0, 3);
                switch (option) {
                    case 0:
                        //no play
                        System.out.println("no play ,the player stays in the same position");
                        break;
                    case 1:
                        //ladder
                        playerPosition += diceRoll;
                        if (playerPosition > 100) {
                            playerPosition = playerPosition - diceRoll;
                        }
                        System.out.println("player move ahead:" + diceRoll);
                        System.out.println("player got ladder,player new position is:" + playerPosition);
                        break;
                    case 2:
                        //snake
                        playerPosition -= diceRoll;

                        System.out.println("player move behind:" + diceRoll);
                        System.out.println("player got snake ,player currunt position:" + playerPosition);
                        break;
                }

            }
            return position;

        }
    }

