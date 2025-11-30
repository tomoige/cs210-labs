import java.util.*;

public class StraightFlush {
    public static String[] suits = {"H","D","C","S"};
    public static String[] ranks = {"A","2","3","4","5","6","7","8","9","10","J","Q","K"};
    public static HashMap<String, Integer> map = new HashMap<String, Integer>();
   
    public static void main(String[] args){
        ArrayList<String> deck = new ArrayList<>();
        
        for(String suit: suits) {
            for(String rank: ranks) {
                deck.add(rank + suit);
            }
        }

        int value = 1;

        for(String i:ranks){
            if(i.equals("10")){
                map.put("1", value);
            } else {
                map.put(i, value);
            }
            value++;
        }

        int flushes = 0;
        int n = 100;
        for(int i = 0; i < n; i++){
            if(shuffleAndPick(deck)){
                flushes++;
            }
        }
        
        System.out.println((double) flushes/n * 100);
    }

    public static boolean shuffleAndPick(ArrayList<String> deck){
        boolean flush = true;
        Collections.shuffle(deck, new Random());
        List<String> picked = deck.subList(0,5);
        picked.sort((a,b) -> {return map.get(""+a.charAt(0)) - map.get(""+b.charAt(0));});
        for(int i = 1; i < 6; i++){
            if(map.get(picked.get(i-1).charAt(0) + "") != i){
                flush = false;
            }
        }
        if(flush){   
            System.out.println(picked);
        }

        return flush;
    }
}
