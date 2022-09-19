package SeptemberLeaveSnack.TicTacToe;

import SeptemberLeaveSnack.TicTacToe.ErrorModule.IllegalEntryException;
import SeptemberLeaveSnack.TicTacToe.ErrorModule.IllegalValueException;

import java.util.InputMismatchException;
import java.util.Scanner;

public class GameTime {
    Player player = new Player();
    Scanner userInput = new Scanner(System.in);

    public int inputCell (int play){
        try {
            play = userInput.nextInt();
        } catch (InputMismatchException e){
            System.out.println(e.getMessage());
        }
        return play;
    }

    public boolean decideWinner(){
    return player.checkWinner();
    }

    public void playGame(int play){
        player.checkPlayerTurns(play);
    }

    public static void displayResult(){
        GameBoard.displayBoard();
    }


    public static void main(String[] args) {

        GameTime gameTime = new GameTime();
        int play = 0;

        System.out.println("Choose a cell");
        System.out.println("Player One Playing");


        while(!gameTime.decideWinner()){
            try {
                gameTime.playGame(gameTime.inputCell(play));
                displayResult();
            } catch (IllegalValueException | IllegalEntryException | InputMismatchException e){
                System.out.println(e.getMessage());
            }
            gameTime.decideWinner();
        }



//        Player player = new Player();
//        Scanner userInput = new Scanner(System.in);
//
//        String keepPlaying = "y";
//
//        while(keepPlaying.equals("y")){
//
//            System.out.println("Player One Playing::: choose a cell");
//            System.out.println();
//            int play = 0;
//
//            try {
//                 play = userInput.nextInt();
//            }catch (InputMismatchException e){
//                System.out.println(e.getMessage());
//            }
//
//            try {
//                player.checkPlayerTurns(play);
//            } catch (IllegalValueException | IllegalEntryException e){
//                System.out.println(e.getMessage());
//            }
//
//            GameBoard.displayBoard();
//
//            Scanner checkUser = new Scanner(System.in);
//
//            System.out.println();
//            System.out.println("Keep Playing");
//            keepPlaying = checkUser.nextLine();
//        }


    }
}
