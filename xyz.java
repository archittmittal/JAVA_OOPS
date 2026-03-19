import java.util.*;

abstract class Shape{
    abstract void rectangleArea(int m,int n);
    abstract void squareArea(int s);
    abstract void circleArea(int r);
}

class Area extends Shape{
    void rectangleArea(int m, int n){
    int area = m*n;
    System.out.println("The area is " + area);
    }

     void squareArea(int s)
    {
        int area = s * s;
        System.out.println("Area of Square = " + area);
    }

    void circleArea(int r)
    {
        double area = 3.14 * r * r;
        System.out.println("Area of Circle = " + area);
    }
}


public class xyz{
    public static void main(String args[]){
        Scanner sc = new Scanner(System.in);
        Shape obj = new Area();
        
        int m = sc.nextInt();
        int n = sc.nextInt();
        obj.rectangleArea(m,n);
        
        int s = sc.nextInt();
        obj.squareArea(s);
        
        int r = sc.nextInt();
        obj.circleArea(r);
        
    
        
        
        
        
    }
}