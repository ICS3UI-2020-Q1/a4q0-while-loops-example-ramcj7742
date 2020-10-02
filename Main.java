/**
 * While loop example
 * @author Jaden Ramcharan
 */
public class Main {

  /**
   * The method that is executed when you hit the run button.
   * @param args the command line arguments
   */
  public static void main(String[] args) {
    //  create a variable to keep track of the number
    int count = 1;
    while(count <= 5){
      // print the number we are at
      System.out.println(count);
      //increase the value of count by 1
      count = count + 1;
    }
    System.out.println("All done");
  }
}
