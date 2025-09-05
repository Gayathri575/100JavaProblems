public class LongestWord {
    public static void main(String[] args) {
        String sentence = "I am learning Java programming language";

        // Split the sentence into words
        String[] words = sentence.split(" ");

        String longestWord = "";

        // Loop through each word
        for (String word : words) {
            if (word.length() > longestWord.length()) {
                longestWord = word;
            }
        }

        System.out.println("Sentence: " + sentence);
        System.out.println("Longest Word: " + longestWord);
        System.out.println("Length: " + longestWord.length());
    }
}


