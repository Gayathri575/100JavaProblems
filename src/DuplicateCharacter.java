public class DuplicateCharacter {
        public static void main(String[] args) {
            String str = "programming";
            str = str.toLowerCase(); // optional (case-insensitive)

            System.out.println("Duplicate characters in \"" + str + "\":");

            for (int i = 0; i < str.length(); i++) {
                char ch = str.charAt(i);
                int count = 0;

                for (int j = 0; j < str.length(); j++) {
                    if (str.charAt(j) == ch) {
                        count++;
                    }
                }

                if (count > 1) {
                    System.out.println(ch);
                    str = str.replace(ch, ' '); // remove printed char to avoid repeats
                }
            }
        }
    }


