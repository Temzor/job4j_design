package ru.job4j.codewars;

import org.junit.Test;

import static org.junit.Assert.*;

public class NoSpaceTest {
    @Test
    public void testSomething() {
        assertEquals("8j8mBliB8gimjB8B8jlB", NoSpace.noSpace("8 j 8   mBliB8g  imjB8B8  jl  B"));
        assertEquals("88Bifk8hB8BB8BBBB888chl8BhBfd", NoSpace.noSpace("8 8 Bi fk8h B 8 BB8B B B  B888 c hl8 BhB fd"));
        assertEquals("8aaaaaddddr", NoSpace.noSpace("8aaaaa dddd r     "));
        assertEquals("jfBmgklf8hg88lbe8", NoSpace.noSpace("jfBm  gk lf8hg  88lbe8 "));
        assertEquals("8jaam", NoSpace.noSpace("8j aam"));
    }

}