package org.thehecklers.controller;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.web.bind.annotation.PathVariable;
import org.springframework.web.bind.annotation.RequestMapping;
import org.springframework.web.bind.annotation.RestController;
import org.thehecklers.entity.Quote;
import org.thehecklers.entity.QuoteSource;
import org.thehecklers.repository.QuoteRepo;

import java.util.Iterator;

/**
 * Created by markheckler on 11/24/15.
 */
@RestController
public class QuoteController {
    @Autowired
    private QuoteRepo quoteRepo;

    @RequestMapping("/sources/{sourceId}/quotes")
    public String getAllSources(@PathVariable(value = "sourceId") Integer sourceId) {
        String quotesForSource = "";
        Iterator<Quote> iq = quoteRepo.findByQuoteSource(new QuoteSource(sourceId)).iterator();
        while (iq.hasNext()) {
            quotesForSource += iq.next().getQuoteText() + "<br>";
        }

        return "All quotes for source ID: " + sourceId + ": <br><br>" + quotesForSource;
    }
}
