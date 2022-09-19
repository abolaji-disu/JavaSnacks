package SeptemberLeaveSnack.TicTacToe.ErrorModule;

public class IllegalEntryException extends RuntimeException {
    public IllegalEntryException(String msg) {
        super(msg);
    }
}
