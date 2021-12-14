package ru.job4j.io;

import org.apache.log4j.BasicConfigurator;
import org.slf4j.Logger;
import org.slf4j.LoggerFactory;

public class UsageLog4j {

    private static final Logger LOG = LoggerFactory.getLogger(UsageLog4j.class.getName());

    public static void main(String[] args) {
        BasicConfigurator.configure();
        byte maxByte = 127;
        short maxShort = 32767;
        char charH = 72;
        int maxInt = 2147483647;
        long maxLong = 9223372036854775807L;
        float floatPiTwo = 3.14f;
        double doublePiThree = 3.141;
        boolean booleanTrue = true;


        LOG.debug("Primitive types of Java, byte: {}, short : {}, char : {}, int : {}, long : {}, float : {}, double : {},  boolean : {}",
                maxByte, maxShort, charH, maxInt, maxLong, floatPiTwo, doublePiThree, booleanTrue);
    }
}