import org.junit.jupiter.api.Test;

import java.util.ArrayList;

import static org.assertj.core.api.Assertions.assertThat;

public class StringTest {

    @Test
    void replace() {
        String actual = "abc".replace("b", "d");
        assertThat(actual).isEqualTo("adc");
    }

    @Test
    void contains() {
        String[] actual = "1,2".split(",");
        assertThat(actual).contains("1");
        assertThat(actual).contains("2");
        String[] actual2 = "1".split(",");
        assertThat(actual2).containsExactly("1");
    }

}
