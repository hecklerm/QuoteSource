package org.thehecklers.entity;

import org.junit.Before;
import org.junit.Test;

import static org.junit.Assert.*;

/**
 * Created by markheckler on 12/3/15.
 */
public class QuoteSourceTest {
    QuoteSource quoteSource = new QuoteSource();

    @Before
    public void setUp() throws Exception {

    }

    @Test
    public void testGetId() throws Exception {
        quoteSource.setId(1);
        assertTrue(quoteSource.getId() == 1);
    }

    @Test
    public void testSetId() throws Exception {
        quoteSource.setId(2);
        assertTrue(quoteSource.getId() == 2);
    }

    @Test
    public void testGetName() throws Exception {
        quoteSource.setName("Bob's Your Uncle");
        assertTrue(quoteSource.getName().equalsIgnoreCase("Bob's Your Uncle"));
    }

    @Test
    public void testSetName() throws Exception {
        quoteSource.setName("Sam Etne");
        assertTrue(quoteSource.getName().equalsIgnoreCase("Sam Etne"));
    }

    @Test
    public void testGetDescription() throws Exception {
        quoteSource.setDescription("Get description.");
        assertTrue(quoteSource.getDescription().equalsIgnoreCase("Get description."));
    }

    @Test
    public void testSetDescription() throws Exception {
        quoteSource.setDescription("Set description.");
        assertTrue(quoteSource.getDescription().equalsIgnoreCase("Set description."));
    }
}