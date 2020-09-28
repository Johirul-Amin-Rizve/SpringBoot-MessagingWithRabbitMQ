package com.example.messagingrabbitmq;

import java.util.ArrayList;
import java.util.Arrays;
import java.util.List;
import java.util.stream.Stream;

public class CountSpecificWord {
    public static void count(String message, String findWord){

        //Creating Arraylist from String
        String str[] = message.split(" ");
        List<String> wordList = new ArrayList<String>();
        wordList = Arrays.asList(str);

        //Creating the stream of all wordList
        Stream<String> allWords = wordList.stream();

        //file a specific word and found how many times it occurs
        long matchWord = allWords.filter(st -> st.equalsIgnoreCase(findWord)).count();

        System.out.println("No of "+ findWord + " has "+ matchWord + " times");

    }
}
