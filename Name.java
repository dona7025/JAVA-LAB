import java.util.Scanner;

class Name {
  public static void main(String[] args) {
    Scanner myObj = new Scanner(System.in);
    System.out.println("Enter Name");

    String n = myObj.nextLine();
    System.out.println("Name  is: " + n);
  }
}