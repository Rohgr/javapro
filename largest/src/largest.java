import java.util.Scanner;

public class largest {
    public static void main(String[] args){
        System.out.println("Welcome to largest no program");
        System.out.println("enter 3 nos");
        Scanner a = new Scanner(System.in);
        int nos1 = a.nextInt();
        int nos2 = a.nextInt();
        int nos3 = a.nextInt();
        if (nos1 > nos2 && nos1 > nos3)
        {
            System.out.println("Largest no is" +nos1);

        }
        else if (nos2 > nos1 && nos2 > nos3)
        {
            System.out.println("Largest no is" +nos2);

        }
        else {
                System.out.println("Largest number is "+nos3);
        }
    }
}
