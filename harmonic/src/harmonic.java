import java.util.Scanner;

public class harmonic {
    public static void main(String[] args){
        System.out.println("Welcome to harmonic program");
        System.out.println("Enter a number harmonic program");

        Scanner sc = new Scanner(System.in);
        int a = sc.nextInt();
        double b=0,c=0;
        for(double i=1;i<=a;i++){
             b =(double) 1/i;
             c=c+b;
            System.out.println(+c);


        }
        System.out.println("Harmonic series" +c);
    }
}
