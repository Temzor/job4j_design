package ru.job4j.io;

import ru.job4j.io.zip.ArgsName;
import org.junit.Test;

import static org.hamcrest.Matchers.is;
import static org.hamcrest.MatcherAssert.assertThat;

public class ArgsNameTest {

    @Test
    public void whenGetFirst() {
        ArgsName jvm = ArgsName.of(new String[] {"-Xmx=512", "-encoding=UTF-8"});
        assertThat(jvm.get("Xmx"), is("512"));
    }

    @Test
    public void whenGetFirstReorder() {
        ArgsName jvm = ArgsName.of(new String[] {"-encoding=UTF-8", "-Xmx=512"});
        assertThat(jvm.get("Xmx"), is("512"));
    }



    @Test(expected = IllegalArgumentException.class)
    public void whenWrongSomeArgument() {
        ArgsName jvm = ArgsName.of(new String[] {"encoding=UTF-8", "=Xmx=512"});

    }

    @Test(expected = IllegalArgumentException.class)
    public void whenWrongKey() {
        ArgsName jvm = ArgsName.of(new String[] {"=UTF-8"});
    }

    @Test(expected = IllegalArgumentException.class)
    public void whenStartWrongKey() {
        ArgsName jvm = ArgsName.of(new String[] {"-=encoding", "=Xmx=512"});
    }

    @Test(expected = IllegalArgumentException.class)
    public void whenEndWrongKey() {
        ArgsName jvm = ArgsName.of(new String[] {"encoding=UTF-8", "="});
    }
}