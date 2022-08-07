package application;

import entities.Enums.Circle;
import entities.Enums.Color;
import entities.Rectangle;
import entities.Shape;

import java.util.ArrayList;
import java.util.List;
import java.util.Locale;
import java.util.Scanner;

public class Program {
    public static void main(String[] args) {
        Locale.setDefault(Locale.US);
        Scanner sc = new Scanner(System.in);
        List<Shape> shapes = new ArrayList<>();

        System.out.print("Enter the number of shapes: ");
        int numberOfProducts = sc.nextInt();


        for(int i = 0; i < numberOfProducts; i++){
            System.out.println("Shape #" + (i + 1) + " data:");
            System.out.print("Rectangle or Circle (r/c)? ");
            char typeShape = sc.next().charAt(0);
            System.out.print("Color (BLACK/BLUE/RED): ");
            String color = sc.next();
            if(typeShape == 'r'){
                System.out.print("Width: ");
                double width = sc.nextDouble();
                System.out.print("Height: ");
                double height = sc.nextDouble();
                shapes.add(new Rectangle(Color.valueOf(color), width, height));
            }
            else if(typeShape == 'c'){
                System.out.print("Radius: ");
                double radius = sc.nextDouble();
                shapes.add(new Circle(Color.valueOf(color),radius));
            }
        }
        System.out.println("SHAPE AREAS:");
        for (Shape s : shapes){
            System.out.println(String.format("%.2f", s.area()));
        }

    }
}
