import java.util.*;

public class Sum{
    public static void main(String[] args){
        Scanner sc = new Scanner(System.in);
        int num = sc.nextInt();
        System.out.println(sumTo(num));
    }

    public static int sumTo(int x){
        if(x == 0){
            return 0;
        }
        if(x == 1){
            return 1;
        }

        return x + sumTo(x - 1);
    }
}