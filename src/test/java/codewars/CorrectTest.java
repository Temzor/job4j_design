package codewars;

import org.junit.Assert;
import ru.codewars.eightkyu.Correct;
import org.junit.Test;

public class CorrectTest {
    @Test
    public void testSomething() {
        Assert.assertEquals("IF-RUDYARD KIPLING", Correct.correct(Correct.correct("1F-RUDYARD K1PL1NG")));
        Assert.assertEquals("ROBERT MERLE - THE DAY OF THE DOLPHIN",
                Correct.correct(Correct.correct("R0BERT MERLE - THE DAY 0F THE D0LPH1N")));
        Assert.assertEquals("RICHARD P. FEYNMAN - THE FEYNMAN LECTURES ON PHYSICS",
                Correct.correct(Correct.correct("R1CHARD P. FEYNMAN - THE FEYNMAN LECTURE5 0N PHY51C5")));
        Assert.assertEquals("RICHARD P. FEYNMAN - STATISTICAL MECHANICS",
                Correct.correct(Correct.correct("R1CHARD P. FEYNMAN - 5TAT15T1CAL MECHAN1C5")));
        Assert.assertEquals("STEPHEN HAWKING - A BRIEF HISTORY OF TIME",
                Correct.correct(Correct.correct("5TEPHEN HAWK1NG - A BR1EF H15T0RY 0F T1ME")));
        Assert.assertEquals("STEPHEN HAWKING - THE UNIVERSE IN A NUTSHELL",
                Correct.correct(Correct.correct("5TEPHEN HAWK1NG - THE UN1VER5E 1N A NUT5HELL")));
        Assert.assertEquals("ERNEST HEMINGWAY - A FARWELL TO ARMS",
                Correct.correct(Correct.correct("ERNE5T HEM1NGWAY - A FARWELL T0 ARM5")));
        Assert.assertEquals("ERNEST HEMINGWAY - FOR WHOM THE BELL TOLLS",
                Correct.correct(Correct.correct("ERNE5T HEM1NGWAY - F0R WH0M THE BELL T0LL5")));
        Assert.assertEquals("ERNEST HEMINGWAY - THE OLD MAN AND THE SEA",
                Correct.correct(Correct.correct("ERNE5T HEM1NGWAY - THE 0LD MAN AND THE 5EA")));
        Assert.assertEquals("J. R. R. TOLKIEN - THE LORD OF THE RINGS",
                Correct.correct(Correct.correct("J. R. R. T0LK1EN - THE L0RD 0F THE R1NG5")));
        Assert.assertEquals("J. D. SALINGER - THE CATCHER IN THE RYE",
                Correct.correct(Correct.correct("J. D. 5AL1NGER - THE CATCHER 1N THE RYE")));
        Assert.assertEquals("J. K. ROWLING - HARRY POTTER AND THE PHILOSOPHER'S STONE",
                Correct.correct(Correct.correct("J. K. R0WL1NG - HARRY P0TTER AND THE PH1L050PHER'5 5T0NE")));
        Assert.assertEquals("J. K. ROWLING - HARRY POTTER AND THE CHAMBER OF SECRETS",
                Correct.correct(Correct.correct("J. K. R0WL1NG - HARRY P0TTER AND THE CHAMBER 0F 5ECRET5")));
        Assert.assertEquals("J. K. ROWLING - HARRY POTTER AND THE PRISONER OF Azkaban",
                Correct.correct(Correct.correct("J. K. R0WL1NG - HARRY P0TTER AND THE PR150NER 0F Azkaban")));
        Assert.assertEquals("J. K. ROWLING - HARRY POTTER AND THE GOBLET OF FIRE",
                Correct.correct(Correct.correct("J. K. R0WL1NG - HARRY P0TTER AND THE G0BLET 0F F1RE")));
        Assert.assertEquals("J. K. ROWLING - HARRY POTTER AND THE ORDER OF PHOENIX",
                Correct.correct(Correct.correct("J. K. R0WL1NG - HARRY P0TTER AND THE 0RDER 0F PH0EN1X")));
        Assert.assertEquals("J. K. ROWLING - HARRY POTTER AND THE HALF-BLOOD PRINCE",
                Correct.correct(Correct.correct("J. K. R0WL1NG - HARRY P0TTER AND THE HALF-BL00D PR1NCE")));
        Assert.assertEquals("J. K. ROWLING - HARRY POTTER AND THE DEATHLY HALLOWS",
                Correct.correct(Correct.correct("J. K. R0WL1NG - HARRY P0TTER AND THE DEATHLY HALL0W5")));
        Assert.assertEquals("URSULA K. LE GUIN - A WIZARD OF EARTHSEA",
                Correct.correct(Correct.correct("UR5ULA K. LE GU1N - A W1ZARD 0F EARTH5EA")));
        Assert.assertEquals("URSULA K. LE GUIN - THE TOMBS OF ATUAN",
                Correct.correct(Correct.correct("UR5ULA K. LE GU1N - THE T0MB5 0F ATUAN")));
        Assert.assertEquals("URSULA K. LE GUIN - THE FARTHEST SHORE",
                Correct.correct(Correct.correct("UR5ULA K. LE GU1N - THE FARTHE5T 5H0RE")));
        Assert.assertEquals("URSULA K. LE GUIN - TALES FROM EARTHSEA",
                Correct.correct(Correct.correct("UR5ULA K. LE GU1N - TALE5 FR0M EARTH5EA")));
    }

}