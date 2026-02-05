import java.util.*;

public class Q9L {
    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);
        System.out.println("Enter number of rows and coloumns");
        int n = sc.nextInt();
        int m = sc.nextInt();
        int arr [][] = new int[n][m];

        System.out.println("Enter matrix elements:");
        for(int i = 0 ; i < n; i++){
            for (int j = 0; j < m ; j++){
                arr[i][j] = sc.nextInt();
            }
        }
        
        System.out.println("\nMatrix:");
        printMatrix(arr, n, m);
        
        System.out.println("\nThe saddle point is ");
        findSaddlePoint(arr, n, m);
    }
    
    public static void printMatrix(int arr[][], int n, int m) {
        for(int i = 0; i < n; i++) {
            for(int j = 0; j < m; j++) {
                System.out.print(arr[i][j] + " ");
            }
            System.out.println();
        }
    }
    
    public static void findSaddlePoint(int arr[][], int n, int m) {
        boolean found = false;
        
        for(int i = 0; i < n; i++) {
            for(int j = 0; j < m; j++) {
                int element = arr[i][j];
                
                boolean isMinInRow = true;
                for(int k = 0; k < m; k++) {
                    if(arr[i][k] < element) {
                        isMinInRow = false;
                        break;
                    }
                }
                
                boolean isMaxInCol = true;
                if(isMinInRow) {
                    for(int k = 0; k < n; k++) {
                        if(arr[k][j] > element) {
                            isMaxInCol = false;
                            break;
                        }
                    }
                }
                
                if(isMinInRow && isMaxInCol) {
                    System.out.println("Saddle Point position [" + i + "][" + j + "] with value: " + element);
                    found = true;
                }
            }
        }
        
        if(!found) {
            System.out.println("No saddle point found in the matrix.");
        }
    }
}
