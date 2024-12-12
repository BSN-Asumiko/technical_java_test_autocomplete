package com.tech_test;

import static org.junit.jupiter.api.Assertions.assertEquals;

import java.util.List;

import org.junit.jupiter.api.Test;

public class MainTest {
    @Test
    public void testAutocompleteSuggestionsWithMatches() {
        
        String searchInput = "ap";
        List<String> storedValues = List.of("apex", "apple", "apricot", "banana", "grape", "pineapple", "apology");
        List<String> expected = List.of("apex", "apology", "apple", "apricot");

        List<String> actual = Main.autocompleteSuggestions(searchInput, storedValues);

        assertEquals(expected, actual, "The suggestions should be filtered, sorted, and limited to 4");
    }

    @Test
    public void testAutocompleteSuggestionsWithNoMatches() {

        String searchInput = "mi";
        List<String> storedValues = List.of("apple", "apricot", "banana", "grape", "pineapple", "apology");
        List<String> expected = List.of();

        List<String> actual = Main.autocompleteSuggestions(searchInput, storedValues);

        assertEquals(expected, actual, "The suggestions should be an empty list when no matches are found");
    }

    @Test
    public void testAutocompleteSuggestionsLimitToFour() {
        
        String searchInput = "a";
        List<String> storedValues = List.of("apple", "apricot", "apology", "ape", "ant", "anchor");
        List<String> expected = List.of("anchor", "ant", "ape", "apology");

        List<String> actual = Main.autocompleteSuggestions(searchInput, storedValues);

        assertEquals(expected, actual, "The suggestions should be limited to the first 4 results after sorting");
    }

    @Test
    public void testAutocompleteSuggestionsCaseInsensitiveSearch() {

        String searchInput = "Ap";
        List<String> storedValues = List.of("APPLE", "apricot", "grape", "Apology", "AncHor");
        List<String> expected = List.of("Apology", "APPLE", "apricot");

        List<String> actual = Main.autocompleteSuggestions(searchInput, storedValues);

        assertEquals(expected, actual, "The suggestions should be case-insensitive");

    }


}
