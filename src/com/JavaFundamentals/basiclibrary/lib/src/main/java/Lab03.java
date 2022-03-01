package com.JavaFundamentals.basiclibrary.lib.src.main.java;

import java.util.*;

public class Lab03 {

    public String AnalyzingWeatherData(int [][] array) {

        int min = array[0][0];
        int max = 0;
        HashSet<Integer> set = new HashSet<>();
        HashSet<String> answer = new HashSet<>();

        for (int i = 0; i < array.length; i++) {
            for (int j = 0; j < array[i].length; j++) {
                set.add(array[i][j]);
                if (min > array[i][j]) {
                    min = array[i][j];
                }
                if (max < array[i][j]) {
                    max = array[i][j];
                }
            }
        }
        System.out.println("High: " + max);
        System.out.println("Low: " + min);
        String string = "";
        for (int i = min; i <= max; i++) {
            if (!set.contains(i)) {
                string = "Never saw temperature: " + i;
                answer.add(string);
            }
        }
        return answer.toString();
    }

    public String tally(ArrayList<String> list) {

        int MaxVotes = 0;
        String WinnerName = "";

        Map<String, Integer> votes = new HashMap<>();

        for (String s : list) {
            if (votes.containsKey(s)) {
                votes.put(s, votes.get(s) + 1);
                if (votes.get(s) > MaxVotes) {
                    MaxVotes = votes.get(s);
                    WinnerName = s;
                }
            } else {
                votes.put(s, 0);
            }
        }
        return WinnerName;

    }
}
// for test copy and paste this inside method
//    Lab03 test = new Lab03();
//    ArrayList<String> votes = new ArrayList<>();
//        votes.add("Bush");
//                votes.add("Bush");
//                votes.add("Bush");
//                votes.add("Shrub");
//                votes.add("Hedge");
//                votes.add("Shrub");
//                votes.add("Bush");
//                votes.add("Hedge");
//                votes.add("Bush");
//                votes.add("Shrub");
//                votes.add("Shrub");
//                votes.add("Shrub");
//                votes.add("Shrub");
//                votes.add("Shrub");
//                String s = test.tally(votes);
//                System.out.println(s);
