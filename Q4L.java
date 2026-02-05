public class Q4L {
    public static void main(String args[]){
        int n = Integer.parseInt(args[0]);
        int result = 0;
        int place=1;


        if(n==0){
            System.out.println("1");
            return;
        }
        while(n>0){
            int num = n%10;
            if(num==0){
                num=1;
            }
            result = num*place + result;
            place*=10;
            n=n/10;

        }

        System.out.println("The number after replacing all 0 with 1 is "+ result);


    }
    
}
