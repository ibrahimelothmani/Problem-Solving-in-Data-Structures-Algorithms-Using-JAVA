

public class Main {
    public static void main(String[] args) {

        System.out.println(removeOccurrences("abbbcccddd", "abcd"));
    }


    public static String removeOccurrences(String s, String part) {

        StringBuilder newS = new StringBuilder(s);

        while (newS.indexOf(part) != -1) {
            int startIdx = newS.indexOf(part);
            newS.delete(startIdx, startIdx + part.length());
        }

        return newS.toString();
    }
}