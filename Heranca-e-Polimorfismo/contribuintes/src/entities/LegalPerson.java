package entities;

public class LegalPerson extends People{
    private Integer numberOfEmployees;

    public LegalPerson(String name, Double annualIncome, Integer numberOfEmployees) {
        super(name, annualIncome);
        this.numberOfEmployees = numberOfEmployees;
    }

    public Integer getNumberOfEmployees() {
        return numberOfEmployees;
    }

    public void setNumberOfEmployees(Integer numberOfEmployees) {
        this.numberOfEmployees = numberOfEmployees;
    }

    @Override
    public Double tax() {
        double taxEmployees = 0.16;

        if (numberOfEmployees > 10){
            taxEmployees = 0.14;
        }
        return super.getAnnualIncome() * taxEmployees;
    }
}
