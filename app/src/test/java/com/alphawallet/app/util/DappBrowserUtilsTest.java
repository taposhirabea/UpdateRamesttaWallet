package com.alphawallet.app.util;

import static org.hamcrest.MatcherAssert.assertThat;
import static org.hamcrest.core.IsEqual.equalTo;
import static org.junit.Assert.assertFalse;
import static org.junit.Assert.assertTrue;

import org.junit.Test;

public class DappBrowserUtilsTest
{
    @Test
    public void testDefaultDapp()
    {
        assertThat(DappBrowserUtils.defaultDapp(1L), equalTo("https://ramestta.com/"));
        assertThat(DappBrowserUtils.defaultDapp(137L), equalTo("https://ramestta.com/browser-item-category/polygon/"));
        assertThat(DappBrowserUtils.defaultDapp(80001L), equalTo("https://ramestta.com/browser-item-category/polygon/"));
    }

    @Test
    public void testIsDefaultDapp()
    {
        assertTrue(DappBrowserUtils.isDefaultDapp("https://ramestta.com/"));
        assertTrue(DappBrowserUtils.isDefaultDapp("https://ramestta.com/browser-item-category/polygon/"));
        assertFalse(DappBrowserUtils.isDefaultDapp("https://app.1inch.finance/"));
    }

    @Test
    public void testIsWithinHomePage()
    {
        assertTrue(DappBrowserUtils.isWithinHomePage("https://ramestta.com/"));
        assertTrue(DappBrowserUtils.isWithinHomePage("https://ramestta.com/"));
        assertTrue(DappBrowserUtils.isWithinHomePage("https://ramestta.com/browser/xxx"));
        assertFalse(DappBrowserUtils.isWithinHomePage("https://ramestta.com/"));
    }
}