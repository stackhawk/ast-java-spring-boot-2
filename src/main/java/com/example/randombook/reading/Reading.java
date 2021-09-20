package com.example.randombook.reading;

import java.sql.Date;

public class Reading {
    private final int user;

    private final int book;
    private final Date date;
    private final String state;

    public Reading(int user, int book, Date date, String state) {
        this.user = user;
        this.book = book;
        this.date = date;
        this.state = state;
    }

    public int getUser() {
        return user;
    }

    public int getBook() {
        return book;
    }

    public Date getDate() {
        return date;
    }

    public String getState() {
        return state;
    }

    @Override
    public String toString() {
        return "Reading{" +
                "user=" + user +
                ", book=" + book +
                ", date=" + date +
                ", state='" + state + '\'' +
                '}';
    }
}