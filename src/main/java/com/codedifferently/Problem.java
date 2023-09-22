package com.codedifferently;

public class Problem {
    public String reverseAString(String input){
        StringBuilder builder = new StringBuilder(input).reverse();
        String reverseInput = builder.toString().toLowerCase();
        String[] words = reverseInput.split(" ");
        String response = "";
        for(String word:words){
            response += word.substring(0,1).toUpperCase() + word.substring(1) + " ";
        }
        return response.trim();
    }
}
