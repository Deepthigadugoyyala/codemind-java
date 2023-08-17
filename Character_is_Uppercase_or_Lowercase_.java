import java.util.Scanner;
public class Chara{
public static void main(String[] args){
    Scanner ch=new Scanner(System.in);
    char C;
    C=ch.next().charAt(0);
    if(C>='A' && C<='Z')
    System.out.println("uppercase alphabet");
    else if(C>='a' && C<='z')
    System.out.println("lowercase alphabet");
    else
    System.out.println("not an alphabet");
    ch.close();
 }
}