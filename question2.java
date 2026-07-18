package assignment;
import java.util.Scanner;

public class question2 {
    public static void main(String[] args){

        Scanner scanner= new Scanner(System.in);
        System.out.print("Enter an integer: ");
        int n= scanner.nextInt();

        for(int i=1;i<=10;i++){
            System.out.println(i+"*"+n+"="+i*n);
        }

    }
    
}
