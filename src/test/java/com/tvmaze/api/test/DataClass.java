package com.tvmaze.api.test;

import org.testng.annotations.DataProvider;

public class DataClass {
    @DataProvider(name = "calendarDateAndTVShowName")
    public static Object[][] provideDateAndName() {
        return new Object[][]{{"2022-05-25", "The Flash"}, {"2022-04-07", "Walker"}, {"2022-06-12", "Barry"}};
    }

    @DataProvider(name = "partOfName")
    public static Object[] providePartOfTVShowName() {
        return new Object[]{"Law", "Family", "Girls"};
    }

    @DataProvider(name = "tvShowName")
    public static Object[] provideTVShowName() {
        return new Object[]{"Flash", "Walker", "Barry"};
    }
}
