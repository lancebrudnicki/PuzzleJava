import java.util.ArrayList;
import java.util.Random;
public class TestPuzzleJava {
    
    public static void main(String[] args) {
        int number = 4;
        PuzzleJava generator = new PuzzleJava();
        ArrayList<Integer> randomRolls = generator.getTenRolls();
        System.out.println(randomRolls);
        char randomLetter = generator.getRandomLetter();
        System.out.println(randomLetter);
        String randomword = generator.generatorPassword();
        System.out.println(randomword);
        ArrayList<String> randomPasswords = generator.getNewPasswordSet(number);
        System.out.println(randomPasswords);

    }
}
