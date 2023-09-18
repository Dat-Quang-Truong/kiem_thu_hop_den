import org.junit.jupiter.api.Test;
import static org.junit.jupiter.api.Assertions.*;

public class GiamGiaTest {

    @Test
    void test1() {
        assertEquals(GiamGia.checkGiamGia(-1,2500000), "Input không hợp lệ");
    }

    @Test
    void test2() {
        assertEquals(GiamGia.checkGiamGia(6,-10000), "Input không hợp lệ");
    }

    @Test
    void test3() {
        assertEquals(GiamGia.checkGiamGia(5,1500000), "Miễn phí");
    }

    @Test
    void test4() {
        assertEquals(GiamGia.checkGiamGia(4,2500000), "Miễn phí");
    }

    @Test
    void test5() {
        assertEquals(GiamGia.checkGiamGia(6,3500000), "Miễn phí");
    }

    @Test
    void test6() {
        assertEquals(GiamGia.checkGiamGia(10,1500000), "Không được giảm");
    }

    @Test
    void test7() {
        assertEquals(GiamGia.checkGiamGia(20,2500000), "Giảm 10%");
    }

    @Test
    void test8() {
        assertEquals(GiamGia.checkGiamGia(25,3500000), "Giảm 20%");
    }
}
