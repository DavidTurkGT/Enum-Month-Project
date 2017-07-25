package com.example.common;

import java.util.ArrayList;

/**
 * Created by David Turk on 7/25/17.
 */
public enum Month {
    JANUARY ("January", 1),
    FEBRUARY ("February", 2),
    MARCH ("March", 3),
    APRIL ("April", 4),
    MAY ("May", 5),
    JUNE ("June", 6),
    JULY ("July", 7),
    AUGUST ("August", 8),
    SEPTEMBER ("September", 9),
    OCTOBER ("October", 10),
    NOVEMBER ("November", 11),
    DECEMBER ("December", 12);

    private String englishName;
    private int monthNumber;

    Month(String enlishName, int monthNumber) {
        this.englishName = enlishName;
        this.monthNumber = monthNumber;
    }

    public String getEnglishName() {
        return englishName;
    }

    public static Month[] getAllMonths(){
        return new Month[] {Month.JANUARY, Month.FEBRUARY, Month.MARCH, Month.APRIL, Month.MAY, Month.JUNE, Month
                .JULY, Month.AUGUST, Month.SEPTEMBER, Month.OCTOBER, Month.NOVEMBER, Month.DECEMBER};
    }

    public Month[] getSuccessiveMonths(){
        ArrayList<Month> successiveMonths = new ArrayList<>();
        successiveMonths.add(this);
        for(int i = this.monthNumber; i < Month.getAllMonths().length; i++){
            successiveMonths.add(Month.getAllMonths()[i]);
        }
        return successiveMonths.toArray(new Month[0]);
    }

    public static boolean validMonth(String name){
        for(Month month: Month.getAllMonths() ){
            if(month.getEnglishName().toLowerCase().equals(name.toLowerCase())){
                return true;
            }
        }
        return false;
    }

}
