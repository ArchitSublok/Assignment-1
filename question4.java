package assignment;

import java.util.Scanner;

public class question4 {
    public static void main(String[] arg){
        Scanner scanner= new Scanner(System.in);
        int n=27;
        int c=0;
        for(int i=0;i<5;i++){
            System.out.println("enter the number");
            int a=scanner.nextInt();
            if(a<n){
                System.out.println("Too Low Try Again");
                c++;
            }

            else if(a>n){
                System.out.println("Too High Try Again");
                c++;
            }

            else{
                System.out.println("Congratulations");
                break;
            }
        }
        if (c==5){
            System.out.println("Better luck next time");
        }
    }
}
