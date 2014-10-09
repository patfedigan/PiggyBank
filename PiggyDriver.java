import java.util.*;

class PiggyDriver {
  public static void main(String[] args) {
    PiggyBank pb = new PiggyBank();
    Scanner in = new Scanner(System.in);

    System.out.println("Welcome to PiggyBank v1.0! Enter a number amount to save: ");

    while(in.hasNextLine() && !pb.isBroken()) {


      if(in.hasNextInt()) {
        pb.deposit(in.nextInt());
        System.out.println("Amount added");
      } else {
        System.out.println("Oh no! The PiggyBanks is gone... ");
        System.out.println("You managed to save " + pb.smash());
        break;
      }
      System.out.println("Enter another number amount to save (anything else to smash!): ");
    }

  }
}
