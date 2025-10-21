import java.util.*;

public class Palindrome{
    public static void main(String[] args){
        Scanner sc = new Scanner(System.in);
        String input = sc.nextLine();
        System.out.println(checkPalindrome(input));
    }

    public static boolean checkPalindrome(String x){
        if(x.length() <= 1){
            return true;
        }

        if(x.charAt(0) == x.charAt(x.length() - 1)){
            return checkPalindrome(x.substring(1,x.length() - 1));
        } else {
            return false;
        }
    }
}