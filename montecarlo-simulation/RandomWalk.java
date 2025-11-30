import java.util.*;

public class RandomWalk {
    public static void main(String[] args){
        System.out.println(simulateWalk(20));

        int n = 200;
        int count = 0;

        for(int i = 0; i < n; i++){
            if(simulateWalk(20) == 0){
                count++;
            }
        }

        System.out.println((double) count/n);
    }

    public static int simulateWalk(int numSteps){
        int start = 0;
        Random randGen = new Random();
        for(int i = 0; i < numSteps; i++){
            if(randGen.nextBoolean()){
                start++;
            } else {
                start--;
            }
        }
        
        return start;
    }
}
