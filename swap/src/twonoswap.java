import java.util.Scanner;

public class twonoswap {

    public static void main(String[] args){
    System.out.println("welcome to swapping program") ;
        System.out.println("Enter two nos to swap") ;
        Scanner sc = new Scanner(System.in);
        int nos1 = sc.nextInt();
        int nos2 = sc.nextInt();
        //System.out.println(nos1);
        //System.out.println(nos2) ;
        int temp =0;
        temp=nos1;
        nos1=nos2;
        nos2=temp;
        System.out.println(nos1);
        System.out.println(nos2) ;




    }

}
