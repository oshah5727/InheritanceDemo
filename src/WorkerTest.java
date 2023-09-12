import org.junit.jupiter.api.BeforeEach;
import org.junit.jupiter.api.Test;

import static org.junit.jupiter.api.Assertions.*;

class WorkerTest {

    Worker w1, w2, w3;

    @BeforeEach
    void setUp() {
         w1 = new Worker("002367", "John", "Doe", "Lawyer", 1975, 43.71);
         w2 = new Worker("005963", "Jane", "White", "Doctor", 1985, 89.0);
         w3 = new Worker("002458", "Mike", "Robinson", "Software Developer", 1876, 54.0);
    }

    @Test
    void setHourlyPayRate() {
        w1.setHourlyPayRate(54.0);
        w2.setHourlyPayRate(89.0);
        w3.setHourlyPayRate(43.71);

    }

    @Test
    void calculateWeeklyPay() {
        w1.calculateWeeklyPay(60.0);
        w2.calculateWeeklyPay(70.0);
        w3.calculateWeeklyPay(80.0);
    }

    @Test
    void displayWeeklyPay() {
        w1.displayWeeklyPay(60.0);
        w2.displayWeeklyPay(70.0);
        w3.displayWeeklyPay(80.0);
    }
}