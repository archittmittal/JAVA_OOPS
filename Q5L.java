import java.util.*;
public class Q5L {
    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);
        System.out.println("Enter the number of units");
        int units =sc.nextInt();
        double bill = 0;

        if(units<=100){
            bill=units*0.60;
        }
        else if(units<=300){
            bill=(100*0.60)+((units-100)*0.80);
        }
        else{
             bill=(100*0.60)+(200*0.80)+((units-300)*0.90);
        }

        bill=bill+50;

        if(bill>300){
            bill = bill + (bill * 0.15);

        }

        System.out.println("the bill is "+ bill);

    }
    

}
