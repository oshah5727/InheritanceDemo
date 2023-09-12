import java.util.ArrayList;

public class InheritanceDemo {
    public static void main(String[] args) {

        ArrayList<Worker> workerRecords = new ArrayList<>();

        Worker w1 = new Worker("002367", "John", "Doe", "Lawyer", 1975, 43.71);
        Worker w2 = new Worker("005963", "Jane", "White", "Doctor", 1985, 89.0);
        Worker w3 = new Worker("002458", "Mike", "Robinson", "Software Developer", 1876, 54.0);


        SalaryWorker sw1 = new SalaryWorker("FL3568", "David", "Brown", "Store Employee", 1773, 20.0, 41600.0);
        SalaryWorker sw2 = new SalaryWorker("AB9870", "Mary", "Smith", "Waitress", 1874, 25.0, 52000.0);
        SalaryWorker sw3 = new SalaryWorker("BH4867", "Lisa", "Black", " Teacher", 1890, 30.0, 62400.0);

        workerRecords.add(w1);
        workerRecords.add(w2);
        workerRecords.add(w3);
        workerRecords.add(sw1);
        workerRecords.add(sw2);
        workerRecords.add(sw3);

        for (int weeklyPayPeriod = 1; weeklyPayPeriod <= 3; weeklyPayPeriod++) {
            double hoursWorked = 40.0;
            if (weeklyPayPeriod == 2) {
                hoursWorked = 50.0;
            }

            System.out.println("Week " + weeklyPayPeriod);
            System.out.printf("%-25s  %15s  %15s\n", "Name", "Hourly Pay", "Weekly Pay");
            for (Worker worker : workerRecords) {
                double weeklyPay = worker.calculateWeeklyPay(hoursWorked);
                System.out.printf("%-25s  %15s  %15s\n", worker.fullName(), "$" + worker.getHourlyPayRate(), "$" + weeklyPay);
            }
            System.out.println();
        }
    }
}