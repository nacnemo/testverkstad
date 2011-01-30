package se.nacnemo.designpatterns.structural.adapter;

import java.text.DateFormat;
import java.text.ParseException;
import java.text.SimpleDateFormat;
import java.util.Date;

public class DateAdapter {

    private final String datePattern = "yyyy-MM-dd";
    OriginalDate originalDate;

    public DateAdapter(Date date) {
        DateFormat formatter = new SimpleDateFormat(datePattern);

        String dateStr = formatter.format(date);
        originalDate = new OriginalDate(dateStr);
    }

    public Date getDate() {
        Date date = null;
        DateFormat formatter = new SimpleDateFormat(datePattern);
        try {
            date = formatter.parse(originalDate.getDateStr());
        } catch (ParseException e) {
        }
        return date;
    }
}
