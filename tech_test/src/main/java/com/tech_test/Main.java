package com.tech_test;

import java.util.List;
import java.util.Scanner;

public class Main {
    public static Scanner inputScanner = new Scanner(System.in);
    public static void main(String[] args) {
        
        List<String> givenValues = List.of("Pandora", "Pinterest", "Paypal", "Pg&e", "Project free tv", "Priceline",
                "Press democrat", "Progressive", "Project runway", "Proactive", "Programming", "Progeria",
                "Progesterone", "Progenex", "Procurable", "Processor", "Proud", "Print", "Prank", "Bowl", "Owl",
                "River", "Phone", "Kayak", "Stamps", "Reprobe");

        System.out.println("Welcome to autocompleted suggestions searcher!");
        

        boolean toContinue = true;

        while (toContinue) {
            System.out.print("Please, enter your search query: ");
        String searchQuery = inputScanner.nextLine();
        System.out.println();

        List<String> suggestions = autocompleteSuggestions(searchQuery, givenValues);
        if (suggestions.isEmpty()) {
            System.out.println();
            System.out.println("Sorry, there are no matches in our database.");
        }

        for (String suggestion : suggestions) {
            System.out.println(suggestion);
        }
        
        System.out.println();
        System.out.println("Would you like to perform another search? / Press Y to continue, any key to escape");
        String answer = inputScanner.nextLine();
        

        if (!answer.equalsIgnoreCase("y")) {
            toContinue = false;
        }

        }

    }

    /**
     * Function name: autocompleteSuggestions
     * 
     * @param searchInput (String)
     * @param storedValues (List<String>)
     * @return A new List<String> containing the first 4 filtered and sorted suggestions.
     * 
     * Inside the function:
     * 
     * 1. Converts the List<> to a Stream to perform functional-style operations on the sequence of elements.
     * 2. Filters the stored values in the List<> according to the received String input, ignoring case.
     * 3. Sorts the filtered result in alphabetical order.
     * 4. Takes only the first 4 values from the filtered and sorted result.
     * 5. Converts the Stream back to a List<>.
     * 
     */
    public static List<String> autocompleteSuggestions(String searchInput, List<String> storedValues) {
        List<String> suggestions = storedValues.stream()
                .filter(value -> value.toLowerCase().startsWith(searchInput.toLowerCase()))
                .sorted(String.CASE_INSENSITIVE_ORDER)
                .limit(4)
                .toList();

        return suggestions;
    }

}