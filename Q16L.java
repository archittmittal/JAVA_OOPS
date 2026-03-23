import java.util.Scanner;

class MyCalculator {
    public int power(int n, int p) throws Exception {
        if (n < 0 || p < 0) {
            throw new Exception("java.lang.Exception: n or p should not be negative.");
        }
        if (n == 0 && p == 0) {
            throw new Exception("java.lang.Exception: n and p should not be zero.");
        }
        return (int)Math.pow(n, p);
    }
}

public class Q16L {
    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);
        MyCalculator calc = new MyCalculator();

        while (sc.hasNextInt()) {
            int n = sc.nextInt();
            int p = sc.nextInt();
            try {
                System.out.println(calc.power(n, p));
            } catch (Exception e) {
                System.out.println(e.getMessage());
            }
        }
        sc.close();
    }
}
