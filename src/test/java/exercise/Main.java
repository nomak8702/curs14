package exercise;

import java.io.BufferedReader;
import java.io.FileReader;
import java.util.ArrayList;
import java.util.List;

public class Main {
    public static void main(String[] args) throws Exception {
        BufferedReader read = new BufferedReader(new FileReader("src/file/quotes.txt"));
        List<Quote> listText = new ArrayList<Quote>();
        String baza;
        int count=0;
        while ((baza = read.readLine()) != null) {
            String[] line = baza.split("[~]");
            count++;
            for (int i = 0; i < line.length; i++) {
                String a = line[0];
                String q = line[1];
                boolean f = false;
                listText.add(new Quote(count, a, q, f));
            }
        }
       QuoteService quoteService=new QuoteService();
        for(Quote quote:listText){
            quoteService.addQuotes(quote);
        }


    }
}
