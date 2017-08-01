import scrabble.Scrabble;

import java.io.BufferedReader;
import java.io.IOException;
import java.io.InputStreamReader;

public class App {
    public static void main(String[] args) {
        BufferedReader bufferedReader = new BufferedReader(new InputStreamReader(System.in));

        System.out.println("I can validate your Scrabble score");
        System.out.println("Enter your word:");

        try {
            String inputtedWord = bufferedReader.readLine();
            Scrabble newScrabble = new Scrabble();
            int scrabbleResult = newScrabble.calculateScore(inputtedWord);
            System.out.println(scrabbleResult);

        }catch (IOException e){
            e.printStackTrace();
        }
    }
}
