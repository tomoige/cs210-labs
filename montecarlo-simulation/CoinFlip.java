import java.util.*;

public class CoinFlip {
    public static void main(String[] args){
        int heads = 0;
        int n = 50000000;
        for(int i = 0; i < n; i++){
            if(getHeads(10) == 7){
                heads++;
            }
        }
        System.out.println(heads + " " + n);
        
        System.out.println((double) heads/n);
    }

    public static int getHeads(int numChances){
        Random randgen = new Random();
        int heads = 0;
        for(int i = 0; i < numChances; i++){
            if(randgen.nextInt() > 0.5){
                heads++;
            }
        }
        return heads;
    }
}
