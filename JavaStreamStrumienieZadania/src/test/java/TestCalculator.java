import org.junit.Assert;
import org.junit.Test;

public class TestCalculator {
    @Test // napisanie ze to jest test,
    public void shouldSumToNumbers() {
        Calculator calculator = new Calculator(); // metoda
        int sum = calculator.sum(5, 4); // co ma policzyc
        Assert.assertTrue(sum == 9); // co ma zwrocic, spprawdza czy dziala, warunek koncowy bez zkaonczenia danej funkcji,jest true, zielony
    }
}