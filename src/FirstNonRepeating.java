public class FirstNonRepeating {
        public static void main(String[] args) {
            String str = "programming";
            str = str.toLowerCase(); // optional, to handle case-insensitive check
            boolean found = false;

            for (int i = 0; i < str.length(); i++) {
                char ch = str.charAt(i);
                int count = 0;

                for (int j = 0; j < str.length(); j++) {
                    if (str.charAt(j) == ch) {
                        count++;
                    }
                }

                if (count == 1) {
                    System.out.println("First non-repeating character: " + ch);
                    found = true;
                    break;
                }
            }

            if (!found) {
                System.out.println("No non-repeating character found.");
            }
        }
    }


