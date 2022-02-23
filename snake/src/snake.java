public class snake {
    private static final int IS_SNAKE = 1;
    private static final int IS_LADDER = 2;
    private static final int START_POSITION = 0;
    private static final int WINNING_POSITION = 100;
    private static int diceCount = 0;
    private static String turn = "player1";

    public static void main(String[] args) {

        int currentPositionOfPlayer1 = START_POSITION;
        int currentPositionOfPlayer2 = START_POSITION;
        while (currentPositionOfPlayer1 < WINNING_POSITION &&
                currentPositionOfPlayer2 < WINNING_POSITION) {
            diceCount++;
            if (turn.equals("player1")) {
                turn = "player2";
                currentPositionOfPlayer1 = getPosition(currentPositionOfPlayer1);
            } else {
                turn = "player1";
                currentPositionOfPlayer2 = getPosition(currentPositionOfPlayer2);
            }
        }
        System.out.println("currentPositionOfPlayer1 " + currentPositionOfPlayer1);
        System.out.println("currentPositionOfPlayer2 " + currentPositionOfPlayer2);
        if (currentPositionOfPlayer1 == WINNING_POSITION) {
            System.out.println("Player 1 win the game");
        } else {
            System.out.println("Player 2 win the game");
        }
    }

    private static int getPosition(int currentPosition) {
        int diceNumber = (int) Math.floor(Math.random() * 10) % 6 + 1;
        int option = (int) Math.floor(Math.random() * 10) % 3;
        if (option == IS_SNAKE) {
            if (currentPosition - diceNumber > 0) {
                currentPosition -= diceNumber;
            }
        } else if (option == IS_LADDER) {
            if (currentPosition + diceNumber <= 100) {
                currentPosition += diceNumber;
            }
            if (turn.equals("player2")) {
                turn = "player2";
// turn = p1 p2 p1 p2 p2
            } else if (turn.equals("player1")) {
                turn = "player1";
            }
        }
        return currentPosition;
    }
}