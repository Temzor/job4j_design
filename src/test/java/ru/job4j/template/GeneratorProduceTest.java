package ru.job4j.template;

import org.junit.Ignore;
import org.junit.Test;
import java.util.Map;
import static org.hamcrest.MatcherAssert.assertThat;
import static org.hamcrest.Matchers.is;

@Ignore
class GeneratorProduceTest {
    @Test
    public void whenProduceYou() {
        GeneratorProduce generatorProduce = new GeneratorProduce();
        String template = "I am a ${name}, Who are ${subject}? ";
        Map<String, String> args = Map.of("name", "Petr", "subject", "you");
        String expected = "I am a Petr, Who are you?";
        assertThat(expected, is(generatorProduce.produce(template, args)));
    }

    @Test(expected = IllegalArgumentException.class)
    public void whenKeyNotMap() {
        GeneratorProduce generatorProduce = new GeneratorProduce();
        String template = "I am a ${name}, Who are ${subject}? ";
        Map<String, String> args = Map.of("name", "Petr");
        generatorProduce.produce(template, args);
    }

    @Test(expected = IllegalArgumentException.class)
    public void whenManyKeys() {
        GeneratorProduce generatorProduce = new GeneratorProduce();
        String template = "I am a ${name}, Who are ${subject}? ";
        Map<String, String> args = Map.of("name", "Petr", "subject", "you", "profession", "Programmer");
        generatorProduce.produce(template, args);
    }
}