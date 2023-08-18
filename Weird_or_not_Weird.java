import java.util.Scanner;
public class weird{
    public static void main(String[] args){
        Scanner sc=new Scanner(System.in);
        int n=sc.nextInt();
        if(n%2!=0)
         System.out.println("weird");
        else if (n%2==0)
         System.out.println("not weird");
        
    }
}