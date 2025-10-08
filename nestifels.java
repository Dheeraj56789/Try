//WAP to find if a number is divisble by both 3 and 5;
/*import java.util.*;
public class nestifels {
    public static void main(String args[]) {
        Scanner sc=new Scanner(System.in);
        System.out.println("Enter a number");
        int n=sc.nextInt();
        if(n%5==0) {
            if(n%3==0) {
            System.out.println("the nuber is divisble by 3 and 5");
            }else {
                System.out.println("not divisble");
            }
        }else {
            System.out.println("not divisble");
        }
    }
}
*/


/*Ques : Take positive integer input and tell if it is divisible by 5 or 3 but not divisible by 15.*/
/* 
import java.util.*;
class nestifels {
    public static void main(String args[]) {
        Scanner sc=new Scanner(System.in);
        System.out.println("Enter the number");
        int n=sc.nextInt();
        if(n%5==0 && n%3==0) {    //  (n%515!==0 && n%5==0 || n%3==0)
            if(n%15!=0) {
                System.out.println("the nuber is divisble by 3 and 5");
            }
        else {
            System.out.println("not match the required number");
        }
    } else {
        System.out.println("not match the required number");
    }
    }
}
*/


//Take 3 positive integer input and print the greatest of them.
import java.util.*;
class nsetifels {
    public static void main(String args[]) {
        Scanner sc=new Scanner(System.in);
        System.out.println("Enter the first number:");
        int a=sc.nextInt();
        System.out.println("Enter the second number:");
        int b=sc.nextInt();
        System.out.println("Enter the third number:");
        int c=sc.nextInt();
        if(a>b) {
            if(a>c) {
            System.out.println(a+"A is largest number");
        }else {
            System.out.println(c+"C is the largest number");
        }
    }
    else {
        if(b>c) {
            System.out.println(b+"B is the largest number");
        }else {
            System.out.println(c+"C is the largest number");
        }
    }
    }
}