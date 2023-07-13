import org.testng.annotations.Test;
import ru.netology.service.CashbackHackService;
import static org.testng.AssertJUnit.*;

public class CashbackHackServiceTest {

    @Test
    public void calculateCashbackTest1() {
        CashbackHackService service = new CashbackHackService();
        int amount = 400;

        int actual = service.remain(amount);
        int expected = 600;

        assertEquals(actual, expected);
    }

    @Test
    public void calculateCashbackTest2() {
        CashbackHackService service = new CashbackHackService();
        int amount = 0;

        int actual = service.remain(amount);
        int expected = 1000;

        assertEquals(actual, expected);
    }

    @Test
    public void calculateCashbackTest3() {
        CashbackHackService service = new CashbackHackService();
        int amount = 1000;

        int actual = service.remain(amount);
        int expected = 0;

        assertEquals(actual, expected);
    }
}
