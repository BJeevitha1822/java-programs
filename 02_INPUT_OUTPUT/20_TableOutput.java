import java.util.*;
public class Main{
    public static void main(String args[]){
        Scanner sc=new Scanner (System.in);
        
        int n=sc.nextInt();
      
        System.out.println("Multiplication table");
        
        for(int i=1;i<=10;i++){
            System.out.printf("%d x %d = %d%n",n,i,n*i);
        }
    }
}
