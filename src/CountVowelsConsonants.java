public class CountVowelsConsonants {
    public static void main(String[] args) {
        String Name = " BagavadGita";
        Name = Name.toLowerCase();

        int vowels = 0, consonants = 0;
        for (int i = 0; i < Name.length(); i++) {
            char ch = Name.charAt(i);

            if (ch == 'a' || ch == 'e' || ch == 'i' || ch == 'o' || ch == 'u') {
                vowels++;
            } else {
                consonants++;
            }
        }
            System.out.println("Actual NAme = " +Name);
            System.out.println("Vowels ="+vowels);
            System.out.println("Consonats ="+consonants);

    }
}