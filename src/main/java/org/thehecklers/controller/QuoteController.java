package org.thehecklers.controller;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.web.bind.annotation.*;
import org.thehecklers.entity.Quote;
import org.thehecklers.entity.QuoteSource;
import org.thehecklers.repository.QuoteRepo;

import java.util.Iterator;
import java.util.List;

/**
 * Created by markheckler on 11/24/15.
 */
@RestController
public class QuoteController {
    @Autowired
    private QuoteRepo quoteRepo;



    @RequestMapping("/sources/{sourceId}/quotes")
    public String getAllQuotesForSource(@PathVariable(value = "sourceId") Integer sourceId) {
        String quotesForSource = "";
        Iterator<Quote> iq = quoteRepo.findByQuoteSource(new QuoteSource(sourceId)).iterator();
        while (iq.hasNext()) {
            quotesForSource += iq.next().getQuoteText() + "<br>";
        }

        return "All quotes for source ID: " + sourceId + "<br><br>" + quotesForSource;
    }

    @RequestMapping(value = "/sources/{sourceId}/quote", method = RequestMethod.POST)
    public Quote addQuote(@PathVariable(value = "sourceId") Integer sourceId,
                          @RequestParam(name = "quoteText") String quoteText,
                          @RequestParam(name = "context", required = false) String context) {

        return quoteRepo.save(new Quote(quoteText, context, new QuoteSource(sourceId)));
    }

    @RequestMapping(value = "/random")
    public Quote randomQuote() {
        List<Quote> randomQuotes = quoteRepo.randomQuotes();
        return randomQuotes.get(0);
    }
}
