public class ReverseString {
    public static void main(String [] args){
        String Name = "Gayathiri";
        String reverse = "";
        for (int i = Name.length() -1; i >= 0  ; i--){
            reverse = reverse+Name.charAt(i);
            System.out.println(reverse);
        }
        System.out.println(Name);
    }
}