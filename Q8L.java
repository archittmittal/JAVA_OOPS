import java.util.*;

public class Q8L {
    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);
        System.out.println("Enter the number of elements in array");
        int n = sc.nextInt();
        int arr [] = new int[n];
        for(int i = 0 ; i<n;i++){
            arr[i]=sc.nextInt();
        }
        
        System.out.println("\nChoose method:");
        System.out.println("1. general");
        System.out.println("2. order way");
        System.out.println("3. sorted at both ends");
        System.out.println("0. exit");
        int choice = sc.nextInt();
        
       if(choice>0){
        if(choice == 1) {
            rearrangeUsingTwoPointer(arr);
        } else if(choice == 2) {
            rearrangeNegativesAtFront(arr);
        } else if (choice ==3){
            rearrangeSortedBothEnds(arr);
        }
    }
        
        System.out.println("The sorted array is:");
        for(int i = 0 ; i<n; i++){
            System.out.print(arr[i] + " ");
        }
        System.out.println();
    }
    
    public static void rearrangeUsingTwoPointer(int arr[]) {
        int left = 0;
        int right = arr.length - 1;
        
        while(left < right) {
            while(left < right && arr[left] < 0) {
                left++;
            }
            while(left < right && arr[right] >= 0) {
                right--;
            }
            if(left < right) {
                int temp = arr[left];
                arr[left] = arr[right];
                arr[right] = temp;
                left++;
                right--;
            }
        }
    }
    

    public static void rearrangeNegativesAtFront(int arr[]) {
        int n = arr.length;
        int insertPos = 0;

        for(int i = 0; i < n; i++) {
            if(arr[i] < 0) {
                int temp = arr[insertPos];
                arr[insertPos] = arr[i];
                arr[i] = temp;
                insertPos++;
            }
        }
    }
    
    public static void rearrangeSortedBothEnds(int arr[]) {
        int n = arr.length;
        
        List<Integer> negatives = new ArrayList<>();
        List<Integer> positives = new ArrayList<>();
        
        for(int i = 0; i < n; i++) {
            if(arr[i] < 0) {
                negatives.add(arr[i]);
            } else {
                positives.add(arr[i]);
            }
        }
        
        Collections.sort(negatives);
        Collections.sort(positives);
        
        int index = 0;
        for(int num : negatives) {
            arr[index++] = num;
        }
        for(int num : positives) {
            arr[index++] = num;
        }
    }}

