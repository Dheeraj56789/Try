//give three points(x1,y1),(x2,y2) and (x3,y3),write a program to check if all the three points fall on one straight line.
/*import java.util.*;
public class threepointline {
    public static void main(String args[]) {
        Scanner sc=new Scanner(System.in);
       double x1=1, x2=2, x3=3,y1=1,y2=2,y3=3;
       double m1=(y2-y1)/(x2-x1);
       double m2=(y3-y2)/(x3-x2);
       if(m1==m2) {
        System.out.println("the three points lie on a single line");
       }else {
        System.out.println("they do not lie on a single line");
       }
    }
}
*/

//ques:give a point (x,y),write a program to find out if it lies on the x-axis,y-axis or at the origin,viz.(0,0).
/*import java.util.*;
public class threepointline {
    public static void main(String args[]) {
        Scanner sc=new Scanner(System.in);
        System.out.println("Enter the x axis: ");
        int x=sc.nextInt();
        System.out.println("Enter the y axis: ");
        int y=sc.nextInt();
        if(x==0 && y==0) {
            System.out.println("the point lies at origin(0,0)"); 
        }else if(x==0) {
            System.out.println("the point lies on x axis");
        }else if(y==0){
            System.out.println("the point lies on y axis");
        }else {
            System.out.println("the point does not lies x,y aixs and origin ");
        }
    }
}*/

/*//Ques given the coordinate(x,y) of a center of a circle and its radius,write a 
program which will determine whether a point lies inside the circle,
on the circle oroutside the circle*/
/*import java.util.*;
public class threepointline {
    public static void main(String args[]) {
        Scanner sc = new Scanner(System.in);
        System.out.println("Enter the x-coordinate of the circle's center:");
        int centerX = sc.nextInt();
        System.out.println("Enter the y-coordinate of the circle's center:");
        int centerY = sc.nextInt();
        System.out.println("Enter the radius of the circle:");
        int radius = sc.nextInt();
        System.out.println("Enter the x-coordinate of the point:");
        int pointX = sc.nextInt();
        System.out.println("Enter the y-coordinate of the point:");
        int pointY = sc.nextInt();
        double distance = Math.sqrt(Math.pow(pointX - centerX, 2) + Math.pow(pointY - centerY, 2));
        if (distance < radius) {
            System.out.println("The point lies inside the circle.");
        } else if (distance == radius) {
            System.out.println("The point lies on the circle.");
        } else {
            System.out.println("The point lies outside the circle.");
        }

        sc.close(); 
    }
}*/

