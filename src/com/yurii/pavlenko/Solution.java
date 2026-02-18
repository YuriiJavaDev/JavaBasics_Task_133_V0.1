package com.yurii.pavlenko;

/**
 * Performs surgical extraction using calculated indices.
 */
public class Solution {
    public static void main(String[] args) {
        String word = "programming";
        String target = "gram";

        // Programmatically find the start index
        int startIndex = word.indexOf(target);

        // Calculate the end index (start + length of target)
        // g(3) + 4 letters = 7
        int endIndex = startIndex + target.length();

        // Perform the extraction
        String result = word.substring(startIndex, endIndex);

        // Display results for verification
        System.out.println("Start index: " + startIndex);
        System.out.println("End index: " + endIndex);
        System.out.println("Extracted: " + result);
    }
}