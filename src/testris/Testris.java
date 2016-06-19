package testris;

/**
 *
 * @author Austin
 */
public class Testris implements TestrisInterface {
    
    public Testris() {
    }
    
    /**
     * This method is used for creating a String that will make a lot of new lines
     * @param max The amount of new blank lines to make
     * @return A string with the blank lines
     */
    @Override
    public String clearScreen(int max) {
        String output = "";
        for (int i=0; i<max; i++) output += "\n";
        return output;
    }
    
    /**
     * A method for displaying the main menu of the game
     * @return a string which can be used to display the main menu
     */
    @Override
    public String displayMenu() {
        return  "----------TESTRIS EARLY ALPHA----------\n" + 
                "\n"                                        +
                "          1. New Game                  \n" +
                "          2. High Scores               \n" +
                "          3. Exit Game                 \n" +
                "\n"                                        +
                "\n"                                        +
                "\n"                                        +
                "A game by Austin Foley\n";
    }
    
    /**
     * @param args the command line arguments
     */
    public static void main(String[] args) {
        Testris game = new Testris();
        System.out.println(game.clearScreen(1000));
        System.out.println(game.displayMenu());
    }
    
    
}
