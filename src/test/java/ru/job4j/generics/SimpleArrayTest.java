package ru.job4j.generics;

import org.junit.Test;

import java.util.Iterator;

import static org.junit.Assert.*;
import static org.hamcrest.Matchers.is;


public class SimpleArrayTest {

    @Test
    public void whenAddValuesThenGet() {
        SimpleArray<Integer> result = new SimpleArray<>(3);
        result.add(1);
        result.add(2);
        result.add(3);
        assertThat(result.get(2), is(3));
    }

    @Test
    public void whenAddValuesThenSet() {
        SimpleArray<Integer> rsl = new SimpleArray<>(3);
        rsl.add(1);
        rsl.add(2);
        rsl.add(3);
        rsl.set(0, 0);
        assertThat(rsl.get(0), is(0));
    }

    @Test
    public void whenAddValuesThenRemove() {
        SimpleArray<Integer> result = new SimpleArray<>(3);
        result.add(1);
        result.add(2);
        result.add(3);
        result.remove(0);
        assertThat(result.get(0), is(2));
    }

    @Test
    public void whenRemoveThenAdd() {
        SimpleArray<String> result = new SimpleArray<>(3);
        result.add("one");
        result.add("two");
        result.add("three");
        result.remove(1);
        result.add("four");
        assertThat(result.get(2), is("four"));
    }

    @Test(expected = IndexOutOfBoundsException.class)
    public void whenRemoveThenGetOutOfIndex() {
        SimpleArray<Integer> result = new SimpleArray<>(3);
        result.add(1);
        result.add(2);
        result.add(3);
        result.remove(3);
        assertThat(result.get(33), is(33));
    }

    @Test
    public void whenCallIteratorThenReadSequence() {
        SimpleArray<Integer> result = new SimpleArray<>(3);
        result.add(1);
        result.add(2);
        result.add(3);
        Iterator<Integer> it = result.iterator();
        assertThat(it.next(), is(1));
        assertThat(it.next(), is(2));
        assertThat(it.next(), is(3));
    }

    @Test
    public void whenCallIteratorThenMultiCallNextAndHasNext() {
        SimpleArray<Integer> result = new SimpleArray<>(4);
        result.add(0);
        result.add(1);
        Iterator<Integer> it = result.iterator();
        assertThat(it.next(), is(0));
        assertThat(it.next(), is(1));
        assertThat(it.hasNext(), is(false));
        assertThat(it.hasNext(), is(false));
    }

}