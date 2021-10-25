package ru.job4j.io;

import org.hamcrest.Matchers;
import org.junit.Test;

import static org.hamcrest.Matchers.is;
import static org.junit.Assert.assertThat;

public class ConfigTest {

    @Test
    public void whenPairWithoutComment() {
        String path = "./data/pair_without_comment.properties";
        Config config = new Config(path);
        config.load();
        assertThat(config.value("login"), is("tc"));
        assertThat(config.value("password"), is(Matchers.nullValue()));
    }

    @Test
    public void whenPairWithCommentAndEmptyLines() {
        String path = "./data/pair_with_comment.properties";
        Config config = new Config(path);
        config.load();
        assertThat(config.value("login"), is("tc"));
        assertThat(config.value("password"), is("324012"));
    }

    @Test(expected = IllegalArgumentException.class)
    public void whenInvalidFileFormat() {
        String path = "./data/invalid.properties";
        Config config = new Config(path);
        config.load();
    }

    @Test(expected = IllegalArgumentException.class)
    public void whenPairWithoutUTF8() {
        String path = "./data/pair_without_UTF8.properties";
        Config config = new Config(path);
        config.load();
    }

    @Test
    public void whenPairWithUTF8() {
        String path = "./data/pair_with_UTF8.properties";
        Config config = new Config(path);
        config.load();
        assertThat(config.value("encoding"), is("UTF-8"));
    }

    @Test(expected = IllegalArgumentException.class)
    public void whenPairDoubleSignWithUTF8() {
        String path = "./data/pair_with_double_signUTF8.properties";
        Config config = new Config(path);
        config.load();
        assertThat(config.value("encoding"), is("UTF-8"));
    }
}