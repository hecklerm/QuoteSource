package org.thehecklers.entity;

import org.junit.Before;
import org.junit.Test;

import static org.junit.Assert.*;

/**
 * Created by markheckler on 12/3/15.
 */
public class QuoteTest {
    Quote quote = new Quote();

    @Before
    public void setUp() throws Exception {

    }

    @Test
    public void testGetId() throws Exception {
        quote.setId(1);
        assertTrue(quote.getId() == 1);
    }

    @Test
    public void testSetId() throws Exception {
        quote.setId(2);
        assertTrue(quote.getId() == 2);
    }

    @Test
    public void testGetQuoteText() throws Exception {
        quote.setQuoteText("Get quote.");
        assertTrue(quote.getQuoteText().equalsIgnoreCase("Get quote."));
    }

    @Test
    public void testSetQuoteText() throws Exception {
        quote.setQuoteText("Set quote.");
        assertTrue(quote.getQuoteText().equalsIgnoreCase("Set quote."));
    }

    @Test
    public void testGetContext() throws Exception {
        quote.setContext("Get context.");
        assertTrue(quote.getContext().equalsIgnoreCase("Get context."));
    }

    @Test
    public void testSetContext() throws Exception {
        quote.setContext("Set context.");
        assertTrue(quote.getContext().equalsIgnoreCase("Set context."));
    }

    @Test
    public void testGetQuoteSource() throws Exception {
        quote.setQuoteSource(new QuoteSource(7));
        assertTrue(quote.getQuoteSource().getId() == 7);
    }

    @Test
    public void testSetQuoteSource() throws Exception {
        quote.setQuoteSource(new QuoteSource(8));
        assertTrue(quote.getQuoteSource().getId() == 8);
    }
}