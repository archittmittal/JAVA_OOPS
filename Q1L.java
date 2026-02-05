class student{
    public static void main(String args[]){
        String name=args[0];
        int rollno=Integer.parseInt(args[1]);
        String course=args[2];
        int semester=Integer.parseInt(args[3]);
        System.out.println("Name is: "+name+"\n"+"Roll No is: "+rollno+"\n"+"Course is: "+course+"\n"+"Semester is: "+semester+"\n");


        
    }
}

// command line input interpreter ke sath dena hai after compiling
// javac Q2.java
// java student ArchitMittal 11 Java 4