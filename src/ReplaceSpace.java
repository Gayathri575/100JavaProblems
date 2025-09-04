public class ReplaceSpace {
        public static void main(String[] args) {
            String str = "I love programming";

            // Replace space with -
            String result1 = str.replace(" ", "-");

            // Replace space with %20
            String result2 = str.replace(" ", "%20");

            System.out.println("Original: " + str);
            System.out.println("With - : " + result1);
            System.out.println("With %20 : " + result2);
        }
    }


