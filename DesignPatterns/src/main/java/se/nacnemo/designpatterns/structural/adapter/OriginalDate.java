package se.nacnemo.designpatterns.structural.adapter;

public class OriginalDate {

    private String dateStr;

    public OriginalDate(String dateStr) {
        System.out.println("Created OriginalDate: " + dateStr);
        this.dateStr = dateStr;
    }

    public String getDateStr() {
        System.out.println("OriginalDate.getDateStr return: " + dateStr);
        return dateStr;
    }
}
