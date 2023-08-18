import java.util.Scanner;
public class grades{
    public static void main(String[] args){
        Scanner sc=new Scanner(System.in);
        int a=sc.nextInt();
        int b=sc.nextInt();
        int c=sc.nextInt();
        int d=sc.nextInt();
        int e=sc.nextInt();
        int t=a+b+c+d+e;
        float n=t*100/500;
        if(n>=90)
        System.out.println("Grade A");
        else if(n>=80)
        System.out.println("Grade B");
        else if(n>=70)
        System.out.println("Grade C");
        else if(n>=60)
         System.out.println("Grade D");
         else if(n>=40)
         System.out.println("Grade E");
         else if(n<40)
          System.out.println("Grade F");
         
        
    }
}