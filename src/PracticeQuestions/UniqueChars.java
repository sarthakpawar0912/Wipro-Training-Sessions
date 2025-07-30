package PracticeQuestions;

public class UniqueChars {

    public static void printUniqueChars(String str) {

        for (int i = 0; i < str.length(); i++) {

            boolean isUnique = true;

            for (int j = 0; j < str.length(); j++) {

                if (i != j && str.charAt(i) == str.charAt(j)) {

                    isUnique = false;

                    break;

                }
            }

            if (isUnique) {

                System.out.print(str.charAt(i) + " ");

            }
        }
    }

    public static void main(String[] args) {

        String input = "abcb";
        printUniqueChars(input);
    }
}