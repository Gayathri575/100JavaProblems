public class frequencyofcharacters {
    public static void main(String[] args) {
        String Book = "bagavatgita";
        Book = Book.toLowerCase();

        int[] freq = new int[256];  // ASCII frequency array

        // Count characters
        for (int i = 0; i < Book.length(); i++) {
            char ch = Book.charAt(i);
            if (ch != ' ') {
                freq[ch]++;
            }
        }

        // Print frequencies
        for (int i = 0; i < freq.length; i++) {
            if (freq[i] > 0) {
                System.out.println((char) i + " = " + freq[i]);
            }
        }
    }
}
