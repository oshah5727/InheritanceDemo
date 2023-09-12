import org.junit.jupiter.api.BeforeEach;
import org.junit.jupiter.api.Test;

import static org.junit.jupiter.api.Assertions.*;

class SalaryWorkerTest {

    SalaryWorker sw1, sw2, sw3;

    @BeforeEach
    void setUp() {
        sw1 = new SalaryWorker("FL3568", "David", "Brown", "Store Employee", 1773, 20.0, 41600.0);
        sw2 = new SalaryWorker("AB9870", "Mary", "Smith", "Waitress", 1874, 25.0, 52000.0);
        sw3 = new SalaryWorker("BH4867", "Lisa", "Black", " Teacher", 1890, 30.0, 62400.0);
    }

    @Test
    void setAnnualSalary() {
        sw1.setAnnualSalary(62400.0);
        sw2.setAnnualSalary(52000.0);
        sw3.setAnnualSalary(41600.0);
    }

    @Test
    void calculateWeeklyPay() {
        sw1.calculateWeeklyPay(70.0);
        sw2.calculateWeeklyPay(80.0);
        sw3.calculateWeeklyPay(90.0);
    }

    @Test
    void displayWeeklyPay() {
        sw1.displayWeeklyPay(70.0);
        sw2.displayWeeklyPay(80.0);
        sw3.displayWeeklyPay(90.0);
    }
}