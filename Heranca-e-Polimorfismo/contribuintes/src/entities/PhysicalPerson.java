package entities;

public class PhysicalPerson extends People {
    private Double healthSpending;

    public PhysicalPerson(String name, Double annualIncome) {
        super(name, annualIncome);
    }

    public PhysicalPerson(String name, Double annualIncome, Double healthSpending) {
        super(name, annualIncome);
        this.healthSpending = healthSpending;
    }

    public Double getHealthSpending() {
        return healthSpending;
    }

    public void setHealthSpending(Double healthSpending) {
        this.healthSpending = healthSpending;
    }

    @Override
    public Double tax() {
        double tax = 0;
        double taxIncome = 0.15;
        if (super.getAnnualIncome() >= 2000) {
            taxIncome = 0.25;
        }
        return (super.getAnnualIncome() * taxIncome) - (healthSpending * 0.5);
    }
}
