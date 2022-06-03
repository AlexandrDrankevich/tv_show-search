package com.tvmaze.api.test;

import org.testng.Assert;
import org.testng.annotations.Test;

public class TVShowSingleSearchTest extends AbstractTest {
    @Test(description = "API SingleSearch test ",dataProvider = "tvShowName",dataProviderClass = DataClass.class)
    public void testGetSingleSearchResponseContainsShow(String tvShowName) {
        String url = "https://api.tvmaze.com/singlesearch/shows?q=" + tvShowName;
        client.sendGet(url);
        Assert.assertTrue(client.isResponseContainsTVShow(tvShowName));
    }
}

