package org.example.java8;

import java.util.ArrayList;
import java.util.Arrays;
import java.util.Comparator;
import java.util.List;
import java.util.stream.Stream;

public class UseTrasaction {

    public static void main(String[] args) {
        Trader raoul   = new Trader("Raoul", "Cambridge");
        Trader mario = new Trader("Mario", "Cambridge");
        Trader alan = new Trader("Alan", "Cambridge");
        Trader brian = new Trader("Brian", "Milan");

        List<Transaction> transactions = Arrays.asList(
            new Transaction(brian,2011,300),
            new Transaction(raoul,2012,1000),
            new Transaction(raoul,2011,400),
            new Transaction(mario,2012,710),
            new Transaction(mario,2012,700),
            new Transaction(alan,2012,950)

        );

        //Find all transaction in the year 2011 and sort them by value (small to high);
        var list = transactions.stream().filter(t -> t.getYear() == 2011).sorted(Comparator.comparing(Transaction::getValue)).toList();
        System.out.println("list:"+list);

        //what are all the uniq cities that trader work
        var distinct = transactions.stream().map(t -> t.getTrader().getCity()).distinct().toList();
        System.out.println("distinct:"+distinct);
        //find all traders from Cambridge and sort by name
       var traders =  transactions.stream().filter(t -> t.getTrader().getCity().equals("Cambridge"))
               .map(t -> t.getTrader())
               .sorted(Comparator.comparing(Trader::getName))
               .distinct().toList();
        System.out.println("traders:"+traders);
        //Return a string of all traders names sorted alphabetically
        List<String> names = transactions.stream().map(t -> t.getTrader().getName()).sorted().toList();
        System.out.println("names:"+names);

        //are any traders in Milan
        boolean areTradersFromMilan = transactions.stream().anyMatch(t -> t.getTrader().getCity().equals("Milan"));
        System.out.println("areTradersFromMilan:"+areTradersFromMilan);

        //transaction values from the traders living in Cambridge
        var cambridgeValues = transactions.stream().filter(t -> t.getTrader().getCity().equals("Cambridge")).map(t -> t.getValue()).toList();
        System.out.println("cambridgeValues:"+cambridgeValues);

       //highest value of all transactions
        var maxValue =  transactions.stream().max(Comparator.comparing(Transaction::getValue)).get().getValue();
        System.out.println("maxValue:"+maxValue);

        //transaction with the smallest value
        var minTransaction = transactions.stream().min(Comparator.comparing(Transaction::getValue)).get();
        System.out.println("minTransaction:"+minTransaction);
    }

    private static List<Transaction> getYear2011TransBySort(List<Transaction> transactions) {
      return null;
    }


}
