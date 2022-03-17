package codewars;

import org.hamcrest.MatcherAssert;
import ru.codewars.eightkyu.MorseCodeDecoder;
import org.junit.Test;
import static org.hamcrest.core.Is.is;

public class MorseCodeDecoderTest {
    @Test
    public void testExampleFromDescription() {
        MatcherAssert.assertThat(MorseCodeDecoder.decode(".... . -.--   .--- ..- -.. ."), is("HEY JUDE"));
    }

}