package ru.job4j.codewars;

import codewars.ToAlternativeString;
import org.junit.Test;

import static org.junit.Assert.*;

public class ToAlternativeStringTest {
    @Test
    public void fixedTests() {
        assertEquals("HELLO WORLD", ToAlternativeString.toAlternativeString("hello world"));
        assertEquals("hello world", ToAlternativeString.toAlternativeString("HELLO WORLD"));
        assertEquals("HELLO world", ToAlternativeString.toAlternativeString("hello WORLD"));
        assertEquals("hEllO wOrld", ToAlternativeString.toAlternativeString("HeLLo WoRLD"));
        assertEquals("Hello World", ToAlternativeString.
                toAlternativeString(ToAlternativeString.toAlternativeString("Hello World")));
        assertEquals("12345", ToAlternativeString.toAlternativeString("12345"));
        assertEquals("1A2B3C4D5E", ToAlternativeString.toAlternativeString("1a2b3c4d5e"));
        assertEquals("sTRINGuTILS.TOaLTERNATINGcASE", ToAlternativeString
                .toAlternativeString("StringUtils.toAlternatingCase"));
    }

    @Test
    public void kataTitleTests() {
        assertEquals("ALTerNAtiNG CaSe", ToAlternativeString.toAlternativeString("altERnaTIng cAsE"));
        assertEquals("altERnaTIng cAsE", ToAlternativeString.toAlternativeString("ALTerNAtiNG CaSe"));
        assertEquals("ALTerNAtiNG CaSe <=> altERnaTIng cAsE",
                ToAlternativeString.toAlternativeString("altERnaTIng cAsE <=> ALTerNAtiNG CaSe"));
        assertEquals("altERnaTIng cAsE <=> ALTerNAtiNG CaSe",
                ToAlternativeString.toAlternativeString("ALTerNAtiNG CaSe <=> altERnaTIng cAsE"));
    }

}