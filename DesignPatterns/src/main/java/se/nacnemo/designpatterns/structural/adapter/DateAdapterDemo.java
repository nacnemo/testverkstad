package se.nacnemo.designpatterns.structural.adapter;

import java.util.Date;

public class DateAdapterDemo {

    public static void main(String[] args) {
        System.out.println("DateAdapterDemo");


        DateAdapter dateAdapter = new DateAdapter(new Date());

        Date date = dateAdapter.getDate();

        System.out.println("Date: " + date);
    }
}
