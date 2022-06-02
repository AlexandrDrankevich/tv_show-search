package com.tvmaze.api.test;

import org.testng.Assert;
import org.testng.annotations.Test;

public class TVShowCalendarTest extends AbstractTest {
    @Test(dataProvider = "calendarDateAndTVShowName", dataProviderClass = DataClass.class)
    public void testGetResponseContainsShowOnDate(String date, String tvShowName) {
        String url = "https://api.tvmaze.com/schedule?country=US&date=" + date;
        client.sendGet(url);
        Assert.assertTrue(client.isResponseContainsTVShow(tvShowName));
    }
}

