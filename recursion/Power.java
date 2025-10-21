import java.util.*;

public class Power{
    public static void main(String[] args){
        Scanner sc = new Scanner(System.in);
        int input = sc.nextInt();
        int power = sc.nextInt();
        // recursively
        long start = System.nanoTime();
        System.out.println(raiseToPower(input, power));
        long end = System.nanoTime();
        System.out.println("Recursive time: " + (end - start) + " ns");

        // iteratively
        start = System.nanoTime();
        System.out.println(raiseToPowerIteratively(input, power));
        end = System.nanoTime();
        System.out.println("Iterative time: " + (end - start) + " ns");
    }

    public static int raiseToPower(int x, int power){
        if(power == 1){
            return x;
        }

        return x * raiseToPower(x, power - 1);
    }

    public static int raiseToPowerIteratively(int x, int power){
        int result = x;
        for(int i = 1; i < power; i++){
            result *= x;
        }
        return result;
    }
}