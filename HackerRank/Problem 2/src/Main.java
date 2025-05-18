import java.io.*;
import java.math.*;
import java.security.*;
import java.text.*;
import java.util.*;
import java.util.concurrent.*;
import java.util.regex.*;



class Result {

    /*
     * Complete the 'typeCounter' function below.
     *
     * The function accepts STRING sentence as parameter.
     */

    public static void typeCounter(String sentence) {

        int string = 0;
        int itr = 0;
        int doub = 0;
        String[] tokens = sentence.trim().split("\\s");

        for(String token : tokens){
            try {
                Integer.parseInt(token);
                itr++;

            } catch (Exception e) {
                try {
                    Double.parseDouble(token);
                    doub++;
                } catch (Exception e1) {
                    string++;
                }
            }
        }
    }

}

public class Main {
    public static void main(String[] args) throws IOException {
        BufferedReader bufferedReader = new BufferedReader(new InputStreamReader(System.in));

        String sentence = bufferedReader.readLine();

        Result.typeCounter(sentence);

        bufferedReader.close();
    }
}