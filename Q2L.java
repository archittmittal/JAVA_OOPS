class Bank{
    public static void main(String args[]){
        System.out.println("Enter your choice");
        System.out.println("1. Term Deposit");
        System.out.println("2. Recuuring Deposit");
        System.out.println("3. Exit");
        int c=Integer.parseInt(args[0]);
        int p=Integer.parseInt(args[1]);
        int r=Integer.parseInt(args[2]);
        int n=Integer.parseInt(args[3]);
        int a;

        switch(c){
            case 1:
                 {
                a = (int)(p * Math.pow((1+(r/100.0)),n));
                System.out.println("Maturity amount is "+a);
            }

            case 2:
            a = p*n+p*n*(n+1)/2*r/100*1/12;
            System.out.println("Maturity amount is "+a);
            break;

            default:
            System.out.println("Invalid choice");
            break;

        }

 
    }
}