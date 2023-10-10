import java.util.Scanner;

class Main { 
  public static void main(String[] args) {
    Scanner input = new Scanner(System.in);
    System.out.println("Enter YOUR Radius ");

    double radius = input.nextDouble();
    
    double pi = 3.1415;
    if (radius > 0) {
    double area = pi * radius * radius;
    System.out.println("Area of Circle = " + area);
    } 
    else {
    System.out.println("The Radius is greater than 0");
    }
   input.close();
  }
}
