package Test1;

import java.util.Scanner;

public class Main {
    public static void main(String[] args) {
        Trapezoid trapezoid = new Trapezoid( 5,4,8,10,14);
        System.out.println("trapezoid: " + trapezoid) ;
        double perimeter =trapezoid.getPerimeter();
        double area = trapezoid.getArea();

        Trapezoid trapezoid1 = new Trapezoid( 7,6,9,12,15);
        System.out.println("trapezoid1" + trapezoid1);
        double perimeter1 = trapezoid1.getPerimeter();
        double area1 = trapezoid1.getArea();

        System.out.println(checkPerimeter(perimeter,perimeter1));
        System.out.println(checkArea(area,area1));

    }
    public static String checkPerimeter(double perimeter, double perimeter1) {
        if (perimeter > perimeter1) {
            return ("perimeter > perimeter1");
        } else {
           return ("perimeter < perimeter1");
        }
    }
    public static String checkArea(double area,double area1){
        if(area > area1){
            return ("area > area1");
        }else {
            return ("area < area1");
        }
    }
}
