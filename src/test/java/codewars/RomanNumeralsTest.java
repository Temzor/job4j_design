package codewars;

import org.hamcrest.MatcherAssert;
import ru.codewars.eightkyu.RomanNumerals;
import org.junit.Test;

import static org.hamcrest.CoreMatchers.is;
import static org.junit.Assert.assertThat;

public class RomanNumeralsTest {

    @Test
    public void testToRoman() {
        MatcherAssert.assertThat("1 converts to 'I'", RomanNumerals.toRoman(1), is("I"));
        MatcherAssert.assertThat("2 converts to 'II'", RomanNumerals.toRoman(2), is("II"));
    }

    @Test
    public void testFromRoman() {
        MatcherAssert.assertThat("'I' converts to 1", RomanNumerals.fromRoman("I"), is(1));
        MatcherAssert.assertThat("'II' converts to 2", RomanNumerals.fromRoman("II"), is(2));
    }
}