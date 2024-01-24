import java.util.Scanner;
public class Calculator {
    public static void main(String[] args){
        Scanner input = new Scanner(System.in);
        int a;
        System.out.println("enter your value for a: ");
        a = input.nextInt();
        int b;
        System.out.println("enter your value for b: ");
        b = input.nextInt();
        int add = a+b;
        int sub = a-b;
        int div = a/b;
        int multi = a*b;
        System.out.println("The addition of a and b is:" + add);
        System.out.println("The subtraction of a and b is:" +sub);
        System.out.println("The division of a and  b is:" + div);
        System.out.println("The multiplication of a and b is:" + multi);
    }
    

    
}