import java.util.Scanner;

public class Q15L {

    // Custom Exception for Name
    static class NameException extends Exception {
        NameException(String msg) {
            super(msg);
        }
    }

    // Custom Exception for Employee ID
    static class EmployeeIdException extends Exception {
        EmployeeIdException(String msg) {
            super(msg);
        }
    }

    // Custom Exception for Department ID
    static class DeptIdException extends Exception {
        DeptIdException(String msg) {
            super(msg);
        }
    }

    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);

        try {
            System.out.print("Enter Employee ID: ");
            int empId = sc.nextInt();
            sc.nextLine();

            if (empId < 2001 || empId > 5001) {
                throw new EmployeeIdException("Employee ID must be between 2001 and 5001.");
            }

            System.out.print("Enter Employee Name: ");
            String name = sc.nextLine();

            if (name.isEmpty() || !Character.isUpperCase(name.charAt(0))) {
                throw new NameException("First letter of name must be capital.");
            }

            System.out.print("Enter Department ID: ");
            int deptId = sc.nextInt();

            if (deptId < 1 || deptId > 5) {
                throw new DeptIdException("Department ID must be between 1 and 5.");
            }

            System.out.println("\nEmployee Details:");
            System.out.println("ID: " + empId);
            System.out.println("Name: " + name);
            System.out.println("Department ID: " + deptId);

        } catch (EmployeeIdException | NameException | DeptIdException e) {
            System.out.println("Error: " + e.getMessage());
        } catch (Exception e) {
            System.out.println("Invalid input. Please enter correct data.");
        }
        sc.close();
    }
}