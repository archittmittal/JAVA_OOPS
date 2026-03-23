package exceptions;

public class CustomExceptions {
    public static class NameException extends Exception {
        public NameException(String msg) {
            super(msg);
        }
    }

    public static class EmployeeIdException extends Exception {
        public EmployeeIdException(String msg) {
            super(msg);
        }
    }

    public static class DeptIdException extends Exception {
        public DeptIdException(String msg) {
            super(msg);
        }
    }
}