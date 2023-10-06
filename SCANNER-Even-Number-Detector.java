import java.util.Scanner; 

class Main {
  public static void main(String[] args) {
    Scanner reader = new Scanner(System.in);
    System.out.println("Enter YOUR Number to see if it is EVEN or ODD!");
    
    int Number = reader.nextInt();
    
    if (Number%2==0)
    {
      System.out.println(Number + " is EVEN");
    }
    else 
     System.out.println(Number + " is ODD");
    
     reader.close();
  }
}
