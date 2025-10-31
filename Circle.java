import java.util.Scanner;

 public class Circle{
    public static void main(String[]args){

        Scanner sc = new Scanner(System.in);

        System.out.println("enter radius: ");
        double radius = sc.nextDouble();

        //area of circle
        double area = Math.PI * Math.pow(radius,2);
        System.out.println("The area is: "+area);

        //circumference of circle
        double circum = 2* Math.PI * radius;
        System.out.println("The Circumference is: "+circum);

        //vol of sphere
        double vol = (4.0)/(3.0)* Math.PI * Math.pow(radius,2);
        System.out.printf("The Volume is: %.2f  ",vol);
   
        sc.close();

    }
 }