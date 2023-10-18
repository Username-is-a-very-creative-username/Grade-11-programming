import java.util.Scanner;
class Main {
  public static void main(String[] args) {
    Scanner input = new Scanner(System.in);
    String N = input.nextLine(); 
    
    
    switch (N)
    {
      case "y":
        System.out.println("Y is the height axis of graphing");
        break;

      case "x":
        System.out.println("X is the Length axis of graphing");
        break; 

      default:
        System.out.println("1");
    }
  }
}
