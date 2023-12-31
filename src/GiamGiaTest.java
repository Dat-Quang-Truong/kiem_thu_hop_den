import org.junit.jupiter.api.Test;
import static org.junit.jupiter.api.Assertions.*;

public class GiamGiaTest {

    // Ki thuat Kiem thu theo bang quyet dinh
    @Test
    void test1() {
        assertEquals(GiamGia.checkGiamGia(-1,2500000), "Input không hợp lệ");
    }

    @Test
    void test2() {
        assertEquals(GiamGia.checkGiamGia(3,-10000), "Input không hợp lệ");
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

    // Ki thuat Kiem thu phan hoach tuong duong
    // Check nhung TH con thieu
    @Test
    void test9() {
        assertEquals(GiamGia.checkGiamGia(-1,-1000), "Input không hợp lệ");
    }
    @Test
    void test10() {
        assertEquals(GiamGia.checkGiamGia(-1,100000), "Input không hợp lệ");
    }
    @Test
    void test11() {
        assertEquals(GiamGia.checkGiamGia(-1,3500000), "Input không hợp lệ");
    }
    @Test
    void test12() {
        assertEquals(GiamGia.checkGiamGia(20,-100000), "Input không hợp lệ");
    }

    //Ki thuat kiem thu voi do phu C2
    @Test
    void test13() {
        assertEquals(GiamGia.checkGiamGia(-1,0), "Input không hợp lệ");
    }

    @Test
    void test14() {
        assertEquals(GiamGia.checkGiamGia(3,1000000), "Miễn phí");
    }

    @Test
    void test15() {
        assertEquals(GiamGia.checkGiamGia(10,1000000), "Không được giảm");
    }

    @Test
    void test16() {
        assertEquals(GiamGia.checkGiamGia(20,2500000), "Giảm 10%");
    }

    @Test
    void test17() {
        assertEquals(GiamGia.checkGiamGia(20,3500000), "Giảm 20%");
    }
}
