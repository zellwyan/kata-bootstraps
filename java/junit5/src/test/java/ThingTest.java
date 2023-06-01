import org.assertj.core.api.Assert;
import org.junit.jupiter.api.Test;

import static org.assertj.core.api.Assertions.assertThat;

import java.time.LocalTime;


class ThingTest {

    @Test
    void fail() {
        Thing thing = new Thing();
        String value = thing.callForAction();
        assertThat(value)
                .isEqualTo("Food");
    }

    @Test
    void it_should_not_fail() {
        assertThat(42)
                .isEqualTo(42);
    }
    
}

class FizzBuzzConverter {

    @Test
    public void fizzBuzzConverter1() {
        FizzBuzzConverter fizzBuzz = new FizzBuzzConverter();
        Assert.assertEquals("1", (fizzBuzz). convert(1));
    }

    @Test
    public void fizzBuzzConvertor2() {
        FizzBuzzConverter fizzBuzz = new FizzBuzzConverter();
        Assert. assertEquals("2", fizzBuzz. convert(2));
    }

}