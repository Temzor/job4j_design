package ru.job4j.tdd;

import static org.hamcrest.Matchers.is;
import static org.junit.Assert.assertNull;

import org.hamcrest.MatcherAssert;
import org.junit.Ignore;
import org.junit.Test;

import java.util.Arrays;
import java.util.Calendar;
import java.util.List;

public class CinemaTest {

    @Ignore
    @Test
    public void whenBuy() {
        Account account = new AccountCinema();
        Cinema cinema = new Cinema3D();
        Calendar date = Calendar.getInstance();
        date.set(2020, Calendar.NOVEMBER, 10, 23, 0);
        Ticket ticket = cinema.buy(account, 1, 1, date);
        MatcherAssert.assertThat(ticket, is(new Ticket3D()));
    }

    @Ignore
    @Test
    public void whenFind() {
        Cinema cinema = new Cinema3D();
        cinema.add(new Session3D());
        List<Session> sessions = cinema.find(session -> true);
        MatcherAssert.assertThat(sessions, is(List.of(new Session3D())));
    }

    @Ignore
    @Test
    public void whenAdd() {
        Cinema cinema = new Cinema3D();
        cinema.add(new Session3D());
        List<Session> sessions = cinema.find(session -> true);
        MatcherAssert.assertThat(sessions, is(List.of(new Session3D())));
    }

    @Ignore
    @Test (expected = NullPointerException.class)
    public void whenNotFind() {
        Cinema cinema = new Cinema3D();
        cinema.add(new Session3D());
        List<Session> sessions = cinema.find(session -> false);
        assertNull(sessions);
    }

    @Ignore
    @Test(expected = IllegalArgumentException.class)
    public void whenBuyException() {
        Account account = new AccountCinema();
        Cinema cinema = new Cinema3D();
        Calendar date = Calendar.getInstance();
        Ticket ticket = cinema.buy(account, 3, 3, date);
        Ticket anotherTicket = cinema.buy(account, 3, 3, date);
    }

    @Ignore
    @Test(expected = IllegalArgumentException.class)
    public void whenBuyTicketIsExpired() {
        Account account = new AccountCinema();
        Account anotherAccount = new AccountCinema();
        Cinema cinema = new Cinema3D();
        Calendar date = Calendar.getInstance();
        date.set(2021, Calendar.NOVEMBER, 10, 22, 0);
        Ticket ticket = cinema.buy(account, 1, 1, date);
        date.set(2020, Calendar.DECEMBER, 10, 22, 0);
        Ticket anotherTicket = cinema.buy(anotherAccount, 1, 1, date);
    }

}