import java.io.IOException;
import java.util.Scanner;

public class Fibonacci {
    public static void main(String[] args) throws IOException{
        int n1=0,n2=0,n3=1,count,i;
        Scanner input = new Scanner(System.in);
        System.out.println("enter the count:");
        try{
        count = input.nextInt();
        System.out.println("Fibonacci series :");
        for(i=1;i<count;i++){
            n1=n2;
            n2=n3;
            n3=n1+n2;
            System.out.println(n1+"  ");
            
        }
        
        
    }finally{
        input.close();
    }
    
    }
}
