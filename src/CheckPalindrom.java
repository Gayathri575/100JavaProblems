public class CheckPalindrom {
    public static void main(String[] args) {
        String word = "RaceCar";
        String reverse = "";

        for (int i = word.length() - 1; i >= 0; i--) {
            reverse = reverse + word.charAt(i);
        }

        if (word.equalsIgnoreCase(reverse)) {
            System.out.println(word + " is a Palindrome");
        } else {
            System.out.println(word + " is NOT a Palindrome");
        }
    }
}
