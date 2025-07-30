package PracticeQuestions;

public class RemoveChar {

    public static String removeChar(String str, char ch) {

        return str.replaceAll(String.valueOf(ch), "");

    }

    public static void main(String[] args) {

        String input = "Sarthak Pawar";

        char toRemove = 'a';

        String result = removeChar(input, toRemove);

        System.out.println(result);

    }
}