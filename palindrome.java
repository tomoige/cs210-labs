import java.util.Scanner;

public class palindrome{
    public static void main(String[] args){
        Scanner sc = new Scanner(System.in);
        String str = sc.nextLine();
        System.out.println(isPalindrome(str));
    }

    public static boolean isPalindrome(String x){
        if(x.length() <= 1){
            return true;
        }
        if(x.charAt(0) == x.charAt(x.length() - 1)){
            return isPalindrome(x.substring(1,x.length()-1) );
        } else {
            return false;
        }
    }
}