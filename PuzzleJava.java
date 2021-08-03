import java.util.ArrayList;
import java.util.Arrays;
import java.util.Random;


public class PuzzleJava{
    Random random = new Random();
    public ArrayList getTenRolls(){
        ArrayList<Integer> myArray = new ArrayList<Integer>();
        for(int i = 0; i <= 10; i++ ){
            myArray.add(random.nextInt(20)+1);
        }
    return myArray;
    }

    public char getRandomLetter(){
        char[] abc = {'a','b','c','d','e','f','g','h','i','j','k','l','m','n','o','p','q','r','s','t','u','v','w','x','y','z'};
        int randomnum = random.nextInt(26);
        char randomletter = abc[randomnum];
        return randomletter;
    }

    public String generatorPassword(){
        String word = "";
        for(int i=0; i < 8; i++ ){
            word += getRandomLetter();
        }
    return word;
    }

    public ArrayList getNewPasswordSet(int number){
    ArrayList<String> myArray = new ArrayList<String>();
    for(int i =0; i <= number; i++){
        myArray.add(generatorPassword());
    }
    return myArray;
    }
}