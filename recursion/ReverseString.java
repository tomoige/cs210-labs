import java.util.*;

public class ReverseString{
    public static void main(String[] args){
        Scanner sc = new Scanner(System.in);
        String input = sc.nextLine();

        System.out.println(reverse(input));
    }

    public static String reverse(String x){
        if(x.length() == 1){
            return x.substring(0);
        }
        return x.substring(x.length()-1) + reverse(x.substring(0, x.length() - 1));        
    }
}