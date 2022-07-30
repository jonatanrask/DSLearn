package entities;

public class Rectangle {
    public double height;
    public double width;

    public double area(){
        return height * width;
    }
    public double perimeter(){
        return (2 * height) + (2 * width);
    }
    public double diagonal(){
        return Math.sqrt((height * height) + (width * width));
    }
    public String toString(){
        return "AREA = "
                + String.format("%.2f", area())
                + "\n"
                + "PERIMETRO = "
                + String.format("%.2f", perimeter())
                + "\n"
                + "DIAGONAL = "
                + String.format("%.2f", diagonal());
    }
}
