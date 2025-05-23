import org.junit.jupiter.api.Assertions;
import org.junit.jupiter.api.Test;

import static org.junit.jupiter.api.Assertions.*;

class MaxServiceTest {
    @Test
    public void shouldFindMax() {
        MaxService service = new MaxService();
        int a = 5;
        int b = 3;
        int expected = a;

        int actual = service.max(a, b);

        Assertions.assertEquals(expected, actual);
    }

}