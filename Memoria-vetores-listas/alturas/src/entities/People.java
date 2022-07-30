package entities;

public class People {
    private String name;
    private int age;
    private double height;

    public People() {
    }

    public People(String name, int age, double height) {
        this.name = name;
        this.age = age;
        this.height = height;
    }

    public String getName() {
        return name;
    }

    public void setName(String name) {
        this.name = name;
    }

    public int getAge() {
        return age;
    }

    public void setAge(int age) {
        this.age = age;
    }

    public double getHeight() {
        return height;
    }

    public void setHeight(double height) {
        this.height = height;
    }

    public String toString(int i, String name, int age, double height){
        return "Dados da "
                + i
                +"a pessoa:"
                + "\n"
                + "Nome:"
                + name
                + "\n"
                + "Idade: "
                + age
                + "\n"
                + "Altura: "
                + height;
    }
}
