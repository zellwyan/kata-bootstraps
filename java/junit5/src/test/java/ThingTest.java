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

    @Test
    void testBuenasNoches() {
        Thing thing = new Thing(name, LocalTime.of(22, 0));
        String value = thing.greetNight();
        assertThat(value)
                .isEqualTo("¡Buenas noches "+name+"!");
    }
}