package assignment;
import java.util.Scanner;

public class question1 {
    public static void main(String[] args){

        Scanner scanner = new Scanner(System.in);
        System.out.print("Enter an integer: ");
        int n = scanner.nextInt();

        for(int i=1;i<=n;i++){
            if(i%2!=0){
                System.out.println("Odd");
            }
            else{
                System.out.println("Even");
            }
        }
    }
}
