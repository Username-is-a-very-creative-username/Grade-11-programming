import java.util.Scanner; 

class Main {
  public static void main(String[] args) {
    Scanner reader = new Scanner(System.in);
    System.out.println("Enter YOUR Grade");
    
    int Grade = reader.nextInt();
    
    if (Grade>=80) {
    System.out.println("More than 80%");
    }
    else if (Grade>=60) {
     System.out.println("More than 60%"); 
    }
    else if (Grade>40) {
     System.out.println("Average");
    }
    else if (40>=Grade) {
      System.out.println("Failed");
    }
    
     reader.close();
  }
}
