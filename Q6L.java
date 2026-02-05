import java.util.Scanner;
public class Q6L {
    public static void main(String[] args) {
        double incomeTax=0;
        Scanner sc = new Scanner(System.in);
        System.out.println("Enter PAN Details of individual");
        String pan = sc.next();
        System.out.println("Enter Name of individual");
        sc.next();
        String name = sc.nextLine();
        System.out.println("Enter Income of individual");
        int income = sc.nextInt();

        if(income<250000){
            System.out.println("No Tax");
            System.out.println("The Total Tax is 0");
        }
        else if(income>250000 && income<300000){
            incomeTax = 0.10*(income-250000);
            System.out.println("The total tax paid by user of pan id " + pan + "is " + incomeTax);
        }
        else if(income>=300000 && income<400000){
            incomeTax = 0.10*(50000) + 0.20*(income-300000);
            System.out.println("The total tax paid by user of pan id " + pan + "is " + incomeTax);
        }
        else{
             incomeTax = 0.10*(50000) + 0.20*(100000) + 0.30*(income-400000);
            System.out.println("The total tax paid by user of pan id " + pan + "is " + incomeTax);
        }
    
     }




}
    
    
