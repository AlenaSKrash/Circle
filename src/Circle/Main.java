package Circle;

import java.util.Scanner;

public class Main {
    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);
        System.out.println("What is the radius of the circle?");
        float radius = sc.nextFloat();
        double area = (radius*radius)*Math.PI;
        double perimeter = (radius*2)*Math.PI;
        System.out.println("The area of the circle ="+area);
        System.out.println("The perimeter of the circle ="+perimeter);


    }

}
