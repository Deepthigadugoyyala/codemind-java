import java.util.Scanner;
public class Target{
   public static void main(String[] args){
       Scanner pr= new Scanner(System.in);
       int p1,p2,p3,p4;
       p1=pr.nextInt();
       p2=pr.nextInt();
       p3=pr.nextInt();
       p4=pr.nextInt();
       if(p1>=10 && p2>=10 && p3>=10 && p4>=10)
       System.out.println("YES");
       else
        System.out.println("NO");
       pr.close();
   }
}