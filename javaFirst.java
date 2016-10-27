import java.io.Console;

public class TreeStory {

    public static void main(String[] args) {
        Console console = System.console();


    String ageAsString = console.readLine("How old are you?  ");
      int age = Integer.parseInt(ageAsString);
      if (age<18) {
      console.printf("You must be at least 18 years old to do this. Sorry, bye bye\n\n");
      System.exit(0);
      }

    String name;
    boolean notGoodName;
      do {
        name = console.readLine("Enter your name:  ");
        notGoodName = (name.equalsIgnoreCase("gints"));
      if (notGoodName) {
        console.printf("Haha. You cant enter this.Try again \n\n");
    }
      } while (notGoodName);

    String work;
      do {
        work = console.readLine("Do you work?  ");
      if (work.equalsIgnoreCase("no")) {
        console.printf("Sorry, not interested if you dont work\n");
        System.exit(0);
      }
      }while (work.equalsIgnoreCase("no"));

      String noun;
      do {
       noun = console.readLine("Enter a noun:   ");
      if (noun.equalsIgnoreCase("shit")) {
      console.printf("Dont talk like that. Try again.\n\n");

      }
      } while (noun.equalsIgnoreCase("shit"));




    }
}
