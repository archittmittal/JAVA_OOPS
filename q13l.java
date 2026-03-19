import java.util.*;

interface Volume {
    void displayVolume();
    default void show() {
        System.out.println("The volume has been displayed.");
    }
}

class Cone implements Volume {
    double radius;
    double height;

    Cone(double r, double h) {
        this.radius = r;
        this.height = h;
    }

    public void displayVolume() {
        double vol = (1.0 / 3.0) * Math.PI * radius * radius * height;
        System.out.println("Volume of Cone: " + vol + " cm3");
    }
}

class Hemisphere implements Volume {
    double radius;

    Hemisphere(double r) {
        this.radius = r;
    }

    public void displayVolume() {
        double vol = (2.0 / 3.0) * Math.PI * Math.pow(radius, 3);
        System.out.println("Volume of Hemisphere: " + vol + " cm3");
    }
}

class Cylinder implements Volume {
    double radius;
    double height;

    Cylinder(double r, double h) {
        this.radius = r;
        this.height = h;
    }

    public void displayVolume() {
        double vol = Math.PI * radius * radius * height;
        System.out.println("Volume of Cylinder: " + vol + " cm3");
    }
}

public class q13l {
    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);
        Volume v;  // one reference many forms that whu created an object and calling again for differnet fxns.
        
        System.out.println("Enter dimensions for Cone:");
        System.out.print("Radius in cm: ");
        double r1 = sc.nextDouble();
        System.out.print("Height in cm: ");
        double h1 = sc.nextDouble();
        v = new Cone(r1, h1); 
        v.displayVolume();
        v.show();

        System.out.println("\nEnter dimensions for Hemisphere:");
        System.out.print("Radius in cm: ");
        double r2 = sc.nextDouble();
        v = new Hemisphere(r2); 
        v.displayVolume();
        v.show();

        System.out.println("\nEnter dimensions for Cylinder:");
        System.out.print("Radius in cm: ");
        double r3 = sc.nextDouble();
        System.out.print("Height in cm: ");
        double h3 = sc.nextDouble();
        v = new Cylinder(r3, h3); 
        v.displayVolume();
        v.show();
        
        sc.close();
    }
}
