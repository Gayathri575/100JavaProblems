public class RemoveSpace {
    public static void main(String [] args){
        String book = " bagavat geeta is an holy Book";
        String result = "";
        for ( int i = 0 ; i < book.length() ; i++ ){
            char letter  = book.charAt(i);
            if (letter != ' '){
                result += letter ;
            }
        }
        System.out.println(result);
    }
}
