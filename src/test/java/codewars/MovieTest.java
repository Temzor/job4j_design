package codewars;

import org.junit.Assert;
import ru.codewars.eightkyu.Movie;
import org.junit.Test;

import static org.junit.Assert.*;

public class MovieTest {
    private static void testing(long actual, long expected) {
        Assert.assertEquals(expected, actual);
    }
    @Test
    public void test1() {
        System.out.println("Fixed Tests: movie");
        testing(Movie.movie(500, 15, 0.9), 43);
        testing(Movie.movie(100, 10, 0.95), 24);
    }

}