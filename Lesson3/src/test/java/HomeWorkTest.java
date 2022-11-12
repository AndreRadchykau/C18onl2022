import org.junit.jupiter.api.Test;

import static org.junit.jupiter.api.Assertions.assertEquals;

class HomeWorkTest {

    @Test
    void sum() {
        assertEquals(300, HomeWork.sum(100, 200));
    }

    @Test
    void max() {
        assertEquals(349, HomeWork.max(56, 349));
        assertEquals(2147483647, HomeWork.max(Integer.MAX_VALUE, 349));
        assertEquals(-2, HomeWork.max(Integer.MIN_VALUE, -2));
    }

    @Test
    void calculateHypotenuse() {
        assertEquals(5.0, HomeWork.calculateHypotenuse(3, 4));
        assertEquals(20.0, HomeWork.calculateHypotenuse(12, 16));
    }
}