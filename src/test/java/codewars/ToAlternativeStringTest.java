package codewars;

import org.junit.Assert;
import ru.codewars.eightkyu.ToAlternativeString;
import org.junit.Test;

public class ToAlternativeStringTest {
    @Test
    public void fixedTests() {
        Assert.assertEquals("HELLO WORLD", ToAlternativeString.toAlternativeString("hello world"));
        Assert.assertEquals("hello world", ToAlternativeString.toAlternativeString("HELLO WORLD"));
        Assert.assertEquals("HELLO world", ToAlternativeString.toAlternativeString("hello WORLD"));
        Assert.assertEquals("hEllO wOrld", ToAlternativeString.toAlternativeString("HeLLo WoRLD"));
        Assert.assertEquals("Hello World", ToAlternativeString.
                toAlternativeString(ToAlternativeString.toAlternativeString("Hello World")));
        Assert.assertEquals("12345", ToAlternativeString.toAlternativeString("12345"));
        Assert.assertEquals("1A2B3C4D5E", ToAlternativeString.toAlternativeString("1a2b3c4d5e"));
        Assert.assertEquals("sTRINGuTILS.TOaLTERNATINGcASE", ToAlternativeString
                .toAlternativeString("StringUtils.toAlternatingCase"));
    }

    @Test
    public void kataTitleTests() {
        Assert.assertEquals("ALTerNAtiNG CaSe", ToAlternativeString.toAlternativeString("altERnaTIng cAsE"));
        Assert.assertEquals("altERnaTIng cAsE", ToAlternativeString.toAlternativeString("ALTerNAtiNG CaSe"));
        Assert.assertEquals("ALTerNAtiNG CaSe <=> altERnaTIng cAsE",
                ToAlternativeString.toAlternativeString("altERnaTIng cAsE <=> ALTerNAtiNG CaSe"));
        Assert.assertEquals("altERnaTIng cAsE <=> ALTerNAtiNG CaSe",
                ToAlternativeString.toAlternativeString("ALTerNAtiNG CaSe <=> altERnaTIng cAsE"));
    }

}