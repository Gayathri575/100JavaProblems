public class CountWords{
    public static void main(String [] args){
        String Home = "Home Sweet Home";
        int Count = 0;

        Home = Home.trim();
        for (int i = 0; i < Home.length() ; i++){
            if ( Home.charAt(i) == ' '){
                Count ++;
            }
        }
        Count = Count + 1;
        System.out.println(Count);
    }
}