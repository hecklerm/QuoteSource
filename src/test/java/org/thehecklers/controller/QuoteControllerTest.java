package org.thehecklers.controller;

import org.junit.Before;
import org.junit.Test;
import org.junit.runner.RunWith;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.boot.test.SpringApplicationConfiguration;
import org.springframework.boot.test.WebIntegrationTest;
import org.springframework.test.context.junit4.SpringJUnit4ClassRunner;
import org.thehecklers.QuoteServiceApplication;

import static org.junit.Assert.*;

/**
 * Created by markheckler on 12/3/15.
 */
@RunWith(SpringJUnit4ClassRunner.class)
@SpringApplicationConfiguration(classes = QuoteServiceApplication.class)
@WebIntegrationTest
public class QuoteControllerTest {
    @Autowired
    QuoteController quoteController;

    @Test
    public void testGetAllSources() throws Exception {
        String quotes = quoteController.getAllQuotesForSource(22);

        assertTrue(quotes.startsWith("All quotes for source ID: "));
    }

    @Test
    public void testAddQuote() throws Exception {
        assertTrue(true);
    }

}