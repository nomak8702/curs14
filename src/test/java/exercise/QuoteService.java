package exercise;

import java.util.ArrayList;
import java.util.List;
import java.util.Random;

/* getAllQuotes():List<String>

- getQuotesForAuthor(String author): List<Quote>

- getAuthors(): List<String>

- setFavourite(int id)

 - getFavourites():List<Quote>

- getRandomQuote():String : generati un numar random cu ajutorul
        obiectului java.util.Random si returnati quote-ul cu acel id*/

public class QuoteService {
    List<Quote> quotes = new ArrayList<>();

    public List<String> getAllQuotes() {
        List<String> result = new ArrayList<>();

        for (Quote quote : quotes) {
            result.add(quote.getQuote());
        }

        return result;
    }

    public List<String> getQuotesForAuthor(String author) {
        List<String> result = new ArrayList<>();

        for (Quote quote : quotes) {
            if (quote.getAuthor().equalsIgnoreCase(author))
                result.add(quote.getAuthor());
        }

        return result;
    }

    public List<String> getAuthors() {
        List<String> result = new ArrayList<>();

        for (Quote quote : quotes) {
            result.add(quote.getAuthor());
        }

        return result;
    }

    public void setFavourite(int id) {
        boolean favorit = true;
        for (Quote quote : quotes) {
            if (quote.getId() == id) {
                Quote quote1 = new Quote(quote.getId(), quote.getAuthor(), quote.getQuote(), favorit);
                quotes.add(quote);
            }
        }
    }

    public List<Quote> getFavourites() {
        List<Quote> result = new ArrayList<>();

        for (Quote quote : quotes) {
            if (quote.getFavourite() == true) {
                result.add(quote);
            }
        }

        return result;
    }

    public List<Quote> getRandomQuote() {
        List<Quote> result = new ArrayList<>();
        Random random = new Random();
        int rnd = random.nextInt(5422) + 1;
        for (Quote quote : quotes) {
            if (quote.getId() == rnd) {
                result.add(quote);
            }
        }

        return result;
    }

    public void addQuotes(Quote date) {
        quotes.add(date);
    }
}
