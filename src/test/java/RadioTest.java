import org.junit.jupiter.api.Assertions;
import org.junit.jupiter.api.Test;

public class RadioTest {
    @Test
    public void test() {
        Radio radio = new Radio();

        radio.setCurrentStation(5);
        radio.next();

        int expected = 1;
        int actual = radio.getCurrentStation();
        Assertions.assertEquals(expected,actual);
    }
    @Test
    public void test1() {
        Radio radio = new Radio();

        radio.setCurrentStation(6);
        radio.prev();

        int expected = 9;
        int actual = radio.getCurrentStation();
        Assertions.assertEquals(expected,actual);
    }
    @Test
    public void test2(){
        Radio radio = new Radio();

        radio.setCurrentVolume(5);

        int expected = 4;
        int actual = radio.getCurrentVolume();
        Assertions.assertEquals(expected,actual);
    }
    @Test
    public void test3(){
        Radio radio = new Radio();


        radio.increaseVolume();

        int expected = 59;
        int actual = radio.getCurrentVolume();
        Assertions.assertEquals(expected,actual);
    }
    @Test
    public void test4(){
        Radio radio = new Radio();

        radio.decreaseVolume();

        int expected = 0;
        int actual = radio.getCurrentVolume();
        Assertions.assertEquals(expected,actual);
    }
}
