/*If cost price and selling price of an item is input through the keyboard, 
write a program to determine whether the seller has made profit orincurred loss. Also determine how much profit he
made or loss he incurred.*/
/*import java.util.*;
public class cp {
    public static void main(String args[]) {
        Scanner sc=new Scanner(System.in);
        System.out.println("Enter cost price:");
        int cp=sc.nextInt();
        System.out.println("Enter selling price:");
        int sp=sc.nextInt();
        if(sp>cp) {//profit
            System.out.println("your profit is");
            System.out.println(sp-cp);
        }else {//loss
            System.out.println("your loss is");
            System.out.println(cp-sp);

        }
    }
}*/


/*Given the length and breadth of a rectangle,write a program to find whether the area of the
rectangle is greater than its perimeter.*/
import java.util.*;
public class cp {
    public static void main(String args[]) {
        Scanner sc=new Scanner(System.in);
        System.out.println("Enter the length:");
        System.out.println("Enter the breadth:");
        int len=sc.nextInt();
        int bred=sc.nextInt();
        int area=len*bred;
        int perimeter=2*(len+bred);
        if(area>perimeter) {
            System.out.println("Area is greater than perimeter");
        }if(perimeter==area) {
            System.out.println("perimeter and area are equal");
        }
        else {//or if(perimeter>=area)
            System.out.println("Perimeter is greater than area");
        }
    }
}