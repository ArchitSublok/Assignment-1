package assignment;
import java.util.Scanner;
public class question3 {
    public static void main(String[] args){
        Scanner scanner= new Scanner(System.in);
        System.out.println("Enter the starting number");
        int s=scanner.nextInt();
        System.out.println("Enter the last number");
        int l=scanner.nextInt();
        for(int i=s;i<=l;i++){
            int c=1;
            for(int j=2;j<i;j++){
                if(i%j==0){
                    c=0;
                    break;
                }
            }
            if(c==1){
                System.out.println(i);
            }
        }
    }
}
