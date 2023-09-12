public class SalaryWorker extends Worker {
    private double annualSalary;

    public SalaryWorker(String ID, String firstName, String lastName, String title, int YOB, double hourlyPayRate, double annualSalary) {
        super(ID, firstName, lastName, title, YOB, hourlyPayRate);
        this.annualSalary = annualSalary;
    }

    public double getAnnualSalary() {
        return annualSalary;
    }

    public void setAnnualSalary(double annualSalary) {
        this.annualSalary = annualSalary;
    }

    public double calculateWeeklyPay(double hoursWorked) {
        double weeklyPay = annualSalary / 52;
        return weeklyPay;
    }

    public String displayWeeklyPay(double hoursWorked) {
        double weeklyPay = calculateWeeklyPay(annualSalary);
        String hourPayInfo = "";
        hourPayInfo = "Total weekly pay (1/52 of annual salary) - fraction of yearly salary: $" + weeklyPay;
        return hourPayInfo;
        }
}
