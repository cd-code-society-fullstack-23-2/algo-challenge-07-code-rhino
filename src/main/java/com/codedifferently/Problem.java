package com.codedifferently;

public class Problem {
    public String reverseAString(String input){
        String reverseInput = "";
        for(int x = input.length()-1; x >= 0; x--){
            reverseInput +=  input.charAt(x);
        }
        // reversed String

        String[] words = reverseInput.split(" ");
        String response = "";
        for(String word:words){
            word = word.toLowerCase();
            String firstLetter = word.substring(0,1).toUpperCase();
            String restOfLetters = word.substring(1);
            String fixedWord = firstLetter + restOfLetters;
            response += fixedWord + " ";
        }
        return response.trim();
    }
}
