package assignment;
import java.util.Scanner;

public class question5 {

    public static int factorial(int y){  
        int r=1;
        for(int i=1;i<=y;i++){
            r=r*i;
        }
        return r;
    }

    public static int factorialsum(int x){
        if(x==0){
            return 1;
        }
        
        int s=0;
        while(x>0){
            int d=x%10;
            s=s+factorial(d);
            x=x/10;
        }      
        return s;
    }

    public static void main(String[] args){
        Scanner scanner= new Scanner(System.in);
        int start=scanner.nextInt();
        int last=scanner.nextInt();

        for(int i=start;i<=last;i++){
            if(i==factorialsum(i)){
                System.out.println(i);
            }
        }
    }
}