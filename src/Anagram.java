public class Anagram {
        public static void main(String[] args) {
            String str1 = "listen";
            String str2 = "silent";

            // Convert both strings to lowercase for fair comparison
            str1 = str1.toLowerCase();
            str2 = str2.toLowerCase();

            // If lengths are not same, not an anagram
            if (str1.length() != str2.length()) {
                System.out.println("Not Anagram");
                return;
            }

            // Create array to count characters
            int[] count = new int[26]; // for 'a' to 'z'

            // Count frequency for str1
            for (int i = 0; i < str1.length(); i++) {
                char ch = str1.charAt(i);
                count[ch - 'a']++;
            }

            // Subtract frequency for str2
            for (int i = 0; i < str2.length(); i++) {
                char ch = str2.charAt(i);
                count[ch - 'a']--;
            }

            // Check if all values are 0
            boolean isAnagram = true;
            for (int i = 0; i < 26; i++) {
                if (count[i] != 0) {
                    isAnagram = false;
                    break;
                }
            }

            if (isAnagram)
                System.out.println("Anagram");
            else
                System.out.println("Not Anagram");
        }
    }


