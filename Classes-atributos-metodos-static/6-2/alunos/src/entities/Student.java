package entities;

public class Student {
    public String name;
    public double firstQuarter;
    public double secondQuarter;
    public double thirdQuarter;

    public double finalNote(){
        return firstQuarter + secondQuarter + thirdQuarter;
    }
    public String toString(){
        if (finalNote() < 60){
            return "NOTA FINAL = "
                + String.format("%.2f\n", finalNote())
                + "FAILED\n"
                + "FALTARAM "
                + String.format("%.2f", 60 - finalNote())
                + " PONTOS";


        }
        else {
            return "NOTA FINAL = "
                    + String.format("%.2f\n", finalNote())
                    + "PASS\n"
                    ;
        }
    }

}
