import java.util.Scanner;

public class MagicSquare{
    public static void main(String[] args){
        Scanner sc = new Scanner(System.in);
        System.out.print("Enter the matrix dimension: ");
        int dimension = sc.nextInt();
        int[][] matrix = new int[dimension][dimension];

        //fill array
        for(int row = 0; row < dimension; row++){
            for(int col = 0; col < dimension; col++){
                matrix[row][col] = sc.nextInt();
            }
        }

        //display array
        System.out.println("You Entered:");
        for(int row = 0; row < dimension; row++){
            for(int col = 0; col < dimension; col++){
                System.out.print(matrix[row][col] + " ");      
            }
            System.out.println();
        }

        //get magic number (first row)
        int magicNumber = 0;
        for(int row = 0; row < 1; row++){
            for(int col = 0; col < dimension; col++){
                magicNumber += matrix[row][col];
            }
        }

        //call the magic number function
        boolean result = checkMagicNumber(matrix, magicNumber);
        if(result){
            System.out.println("The square is a magic square!");
        } else {
            System.out.println("The square is NOT a magic square!");
        }
    }

    public static boolean checkMagicNumber(int[][] x, int mn){
        //check rows
        for(int row = 0; row < x.length; row++){
            int total = 0;
            for(int col = 0; col < x.length; col++){
                total += x[row][col];
            }
            if(total != mn){
                return false;
            }
        }

        //check cols
        for(int col = 0; col < x.length; col++){
            int total = 0;
            for(int row = 0; row < x.length; row++){
                total += x[row][col];
            }
            if(total != mn){
                return false;
            }
        }

        //check left diag
        int total = 0;
        for(int i = 0; i < x.length; i++){
            total += x[i][i];
        }
        if(total != mn){
            return false;
        }

        //check right diag
        total = 0;
        for(int i = x.length - 1; i >= 0; i--){
            total += x[i][i];
        }
        if(total != mn){
            return false;
        }

        return true;
    }
}