

public class SnakeAndLadder {
    public static void main(String[] args){
        System.out.println("Welcome to snake ladder game");
        int IS_SNAKE=1;
        int IS_LADDER=2;
        int WINNING_POSITION = 100;
        int START_POSITION = 0;
        int currentPosition = START_POSITION;
        int  diceCount = 0;
            while ( currentPosition < WINNING_POSITION ) {
                int diceNumber = (int) (Math.floor(Math.random() * 10) % 6 + 1);

                int option = (int) (Math.floor(Math.random() * 10) % 3);
                if (option == IS_SNAKE) {
                    currentPosition = currentPosition - diceNumber;
                 //   System.out.println("Snake option ");
                    if(currentPosition<0){
                        currentPosition=START_POSITION;
                    }
                    System.out.println("Snake option ");


                } else if (option == IS_LADDER) {

                    currentPosition = currentPosition + diceNumber;
                    if(currentPosition > WINNING_POSITION){
                        currentPosition = currentPosition - diceNumber;
                    }
                    System.out.println("Ladder option ");


                } else {
                    System.out.println("No play option");
                }
                diceCount++;
            }
               System.out.println("current state " +currentPosition);
        System.out.println(+diceCount);

    }
}
