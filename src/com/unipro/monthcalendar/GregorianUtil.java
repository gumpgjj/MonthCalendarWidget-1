package com.unipro.monthcalendar;

import java.util.Calendar;

public class GregorianUtil {
    private final static String[][] GRE_FESTVIAL = {
            {"元旦", "", "", "", "", "", "", "", "", "", "", "","", "", "", "", "", "", "", "", "", "", "", "", "", "", "", "", "", "",""},
            {"", "", "", "", "", "", "", "", "", "", "", "", "", "情人", "", "", "", "", "","", "", "", "", "", "", "", "", "", "", ""},
            {"", "", "", "", "", "", "", "妇女", "", "", "", "植树", "", "", "", "", "", "", "","", "", "", "", "", "", "", "", "", "", "", ""},
            {"愚人", "", "", "", "", "", "", "", "", "", "", "", "", "", "", "", "", "", "","", "", "", "", "", "", "", "", "", "", "", ""},
            {"劳动", "", "", "青年", "", "", "", "", "", "", "", "", "", "", "", "", "", "", "","", "", "", "", "", "", "", "", "", "", "", ""},
            {"儿童", "", "", "", "", "", "", "", "", "", "", "", "", "", "", "", "", "", "","", "", "", "", "", "", "", "", "", "", "", ""},
            {"建党", "", "", "", "", "", "", "", "", "", "", "", "", "", "", "", "", "", "","", "", "", "", "", "", "", "", "", "", "", ""},
            {"建军", "", "", "", "", "", "", "", "", "", "", "", "", "", "", "", "", "", "","", "", "", "", "", "", "", "", "", "", "", ""},
            {"", "", "", "", "", "", "", "", "", "教师", "", "", "", "", "", "", "", "", "","", "", "", "", "", "", "", "", "", "", "", ""},
            {"国庆", "", "", "", "", "", "", "", "", "", "", "", "", "", "", "", "", "", "","", "", "", "", "", "", "", "", "", "", "", ""},
            {"", "", "", "", "", "", "", "", "", "", "光棍", "", "", "", "", "", "", "", "","", "", "", "", "", "", "", "", "", "", "", ""},
            {"艾滋", "", "", "", "", "", "", "", "", "", "", "", "", "", "", "", "", "", "","", "", "", "", "", "圣诞", "", "", "", "", "", ""},
    };
    private int mMonth;
    private int mDay;

    public GregorianUtil(Calendar calendar) {
        mMonth = calendar.get(Calendar.MONTH);
        mDay = calendar.get(Calendar.DATE);
    }

    public String getGremessage() {
        return GRE_FESTVIAL[mMonth][mDay - 1];
    }

}
