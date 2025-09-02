public class ToggleCase{
    public static void main(String [] args){
        String Name = "Peter parker";
        String result = "";
        for ( int i = 0 ; i < Name.length(); i ++ ){
            char  ch = Name.charAt(i);

            if (ch >= 'a' && ch <= 'z' ){
                result += (char)(ch - 32);
            }
            else if ( ch >= 'A' && ch <= 'Z'){
                result += (char) (ch +32);
            }
            else {
                result += ch ;
            }
        }
        System.out.println("Original String =" + Name);
        System.out.println("After toggle =" + result);

    }
}