public class Worker extends Person {

    private double hourlyPayRate;

    public Worker(String ID, String firstName, String lastName, String title, int YOB, double hourlyPayRate) {
        super(ID, firstName, lastName, title, YOB);
        this.hourlyPayRate = hourlyPayRate;
    }

    public double getHourlyPayRate() {
        return hourlyPayRate;
    }

    public void setHourlyPayRate(double hourlyPayRate) {
        this.hourlyPayRate = hourlyPayRate;
    }

    public double calculateWeeklyPay(double hoursWorked) {
        double regularPay = 40 * hourlyPayRate;
        double overtimePay = (hoursWorked - 40) * 1.5 * hourlyPayRate;
        return regularPay + overtimePay;
    }
    public String displayWeeklyPay(double hoursWorked) {
        double regularPay = 40 * hourlyPayRate;
        double overtimePay = (hoursWorked - 40) * 1.5 * hourlyPayRate;
        double totalPay = regularPay + overtimePay;

        String hourPayInfo = "";
        hourPayInfo += "Hours of regular pay: 40\n";
        hourPayInfo += "Total regular pay: $" + regularPay + "\n";
        hourPayInfo += "Hours of overtime pay: " + (hoursWorked - 40) + "\n";
        hourPayInfo += "Total overtime pay: $" + overtimePay + "\n";
        hourPayInfo += "Total combined pay: $" + totalPay;

        return hourPayInfo;
    }
}
