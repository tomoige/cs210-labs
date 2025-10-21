public class Sorting{
    public static void main(String[] args){
        // bubbleSort
        int[] x = {5, 42, 144, 1, 8000, 12};
        bubbleSort(x);      
        printArray(x);

        // selectionSort
        int[] x2 = {6, 8, 9, 2, 3, 5};
        selectionSort(x2);
        printArray(x2);

        // bubbleSort with String
        String[] x3 = {"Galway", "Dublin", "Kerry", "Kildare", "Cork", "Mayo"};
        bubbleSortString(x3);
        printStringArray(x3);
    }

    public static void bubbleSort(int[] x){
        int swaps = 0;
        for(int i = 0; i < x.length; i++){
            for(int j = 0; j < x.length - 1 - i; j++){
                if(x[j] > x[j+1]){
                    int temp = x[j+1];
                    x[j+1] = x[j];
                    x[j] = temp;
                    swaps++;
                }                
            }
        }
        System.out.println("Number of swaps performed: " + swaps);        
    }

    public static void selectionSort(int[] x){
        int swaps = 0;
        for(int i = 0; i < x.length; i++){
            int min = Integer.MAX_VALUE;
            int minIdx = i;
            for(int j = i; j < x.length; j++){
                if(x[j] < min) {
                    min = x[j];
                    minIdx = j;
                }
            }
            if(minIdx != i){
                int temp = x[i];
                x[i] = min;
                x[minIdx] = temp;
                swaps++;
            }
            
        }
        System.out.println("Number of swaps performed: " + swaps);
    }

    public static void bubbleSortString(String[] x){
        int swaps = 0;
        for(int i = 0; i < x.length; i++){
            for(int j = 0; j < x.length - 1 - i; j++){
                if(x[j].compareToIgnoreCase(x[j+1]) > 0){
                    String temp = x[j+1];
                    x[j+1] = x[j];
                    x[j] = temp;
                    swaps++;
                }                
            }
        }
        System.out.println("Number of swaps performed: " + swaps);        
    }

    public static void printArray(int[] x){
        for(int i = 0; i < x.length; i++){
            System.out.print(x[i] + " ");
        }
        System.out.println();
    }

    public static void printStringArray(String[] x){
        for(int i = 0; i < x.length; i++){
            System.out.print(x[i] + " ");
        }
        System.out.println();
    }
}