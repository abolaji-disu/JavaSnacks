package SeptemberLeaveSnack.TicTacToe.ErrorModule;

public class IllegalValueException extends RuntimeException {
    public IllegalValueException(String message){
       super(message);
    }
}
