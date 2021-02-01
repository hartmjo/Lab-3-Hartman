import java.util.Scanner;
class Main {
  public static void main(String[] args) {
    Scanner myObj = new Scanner(System.in);
    System.out.println("Enter a number to count down or up from:");
    int n;
     for (n=10; n>=0; n--) { //count BACKWARDS
      System.out.println(n);
    }//loop
     for (n=-10; n<=0; n++) { //count FORWARDS
      System.out.println(n);
    }//loop
    System.out.println("Blast off!");
  }
}