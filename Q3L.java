class FriendlyNumber {
    public static void main(String args[]) {

        int n1 = Integer.parseInt(args[0]);
        int n2 = Integer.parseInt(args[1]);

        int sum1 = 0, sum2 = 0;

        // Sum of proper divisors of n1
        for (int i = 1; i <= n1 / 2; i++) {
            if (n1 % i == 0) {
                sum1 += i;
            }
        }

        // Sum of proper divisors of n2
        for (int j = 1; j <= n2 / 2; j++) {
            if (n2 % j == 0) {
                sum2 += j;
            }
        }

        System.out.println("Sum of proper divisors of first number: " + sum1);
        System.out.println("Sum of proper divisors of second number: " + sum2);

        // Friendly number check
        if ((double) sum1 / n1 == (double) sum2 / n2) {
            System.out.println("Friendly Numbers");
        } else {
            System.out.println("Not Friendly");
        }

        // Abundant number check
        if (sum1 >=n1 && sum2 >= n2) {
            System.out.println("Both are Abundant Numbers");
        } else {
            System.out.println("Both are NOT Abundant Numbers");
        }
    }
}
