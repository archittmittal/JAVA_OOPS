import java.util.Scanner;
public class Q7L {

    public static void zigzagArray(int[] arr) {
        for(int i=0; i<arr.length-1; i++){
            if(i % 2 == 0){
                if(arr[i] > arr[i+1]){
                   
                    int temp = arr[i];
                    arr[i] = arr[i+1];
                    arr[i+1] = temp;
                }
            }

            else {
                if(arr[i] < arr[i+1]){
                    int temp = arr[i];
                    arr[i] = arr[i+1];
                    arr[i+1] = temp;
                }
            }
        }
    }

    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);
        System.out.println("Enter number of elements in array: ");
        int n = sc.nextInt();
        System.out.println("Enter the elemnts of array: ");
        int[] arr = new int[n];
        for(int i=0;i<n;i++){
            arr[i]= sc.nextInt();
        }

        zigzagArray(arr);
        
        System.out.println("Zigzag array is ");
        for(int i=0; i<n; i++){
            System.out.print(arr[i] + " ");
        }
        System.out.println();
    }
    
    
    
}

/*

4 3 7
even index : agr i  index bda hua  to swap krdo i+1 ke saath ab array hai 3 4 7
i++ krdenge ab
odd index : agr i+1 bada hua to swap krdo with i then array is 3 7 4 

7 < 8 > 2 < 6 > 0 < 9 > 1 < 2

*/
