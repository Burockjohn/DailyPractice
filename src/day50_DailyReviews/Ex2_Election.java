package day50_DailyReviews;

import java.util.HashMap;
import java.util.Map;
import java.util.function.Function;

public class Ex2_Election {

    public static void main(String[] args) {

        Function<Map<String, Integer>, String> whoIsWinner = a -> {
            Integer max = Integer.MIN_VALUE;
            String winner = "";
            for (Map.Entry<String, Integer> eachCandidate : a.entrySet()) {
                if (eachCandidate.getValue() > max) {
                    max = eachCandidate.getValue();
                    winner = eachCandidate.getKey();
                }
            }

            return winner;
        };

        Map<String, Integer> election = new HashMap<>();
        election.put("Burak", 8);
        election.put("Yunus", 64);
        election.put("Çağlar", 16);
        election.put("Ayşe", 32);
        election.put("Tuğba", 4);
        election.put("Nesrin", 2);

        System.out.println("Wınner is = " + whoIsWinner.apply(election));


    }
}

/*

Task: Build a voting system that tracks the number of votes for different candidates. Use a map to store candidate names as keys and the count of votes received as values. Implement functions to add votes, retrieve the vote count for a candidate, and determine the winner.

 */