package ex_20072024;
import java.util.Scanner;

public class Lab088 {
    public static void main(String[] args) {
                //take two input numbers and result the max of two numbers
        Scanner sc= new Scanner(System.in);
        System.out.println("Enter num1");
        int num1 = sc.nextInt();
        System.out.println("Enter num2");
        int num2 = sc.nextInt();
        if(num1>num2)
        {
            System.out.println(num1);
        }
        else if(num2>num1) {
            System.out.println(num2);
        }
    else
        {
            System.out.println("Both are same");
       }
    }
}






