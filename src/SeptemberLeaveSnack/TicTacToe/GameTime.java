package SeptemberLeaveSnack.TicTacToe;

import SeptemberLeaveSnack.TicTacToe.ErrorModule.IllegalEntryException;
import SeptemberLeaveSnack.TicTacToe.ErrorModule.IllegalValueException;

import java.util.InputMismatchException;
import java.util.Scanner;

public class GameTime {
    Player player = new Player();
    Scanner userInput = new Scanner(System.in);

    public int inputCell (int play){
        play = userInput.nextInt();
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
//        gameTime.playGame(gameTime.inputCell(play));


        while(!gameTime.decideWinner()){
            try {
                gameTime.playGame(gameTime.inputCell(play));
                displayResult();
            } catch (IllegalValueException | IllegalEntryException e){
                System.out.println(e.getMessage());
            }
            // if (!gameTime.decideWinner()) System.out.println("Game is a tie");
            gameTime.decideWinner();
        }


    }
}
