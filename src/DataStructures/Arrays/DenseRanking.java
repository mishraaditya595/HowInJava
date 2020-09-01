/*
Alice is playing an arcade game and wants to climb to the top of the leaderboard and wants to track her ranking.
The game uses Dense Ranking, so its leaderboard works like this:
(1) The player with the highest score is ranked number 1 on the leaderboard.
(2) Players who have equal scores receive the same ranking number, and the next player(s) receive the immediately following ranking number.

WAP to print rank of Alice for her scores.

Input:
scores in leaderboard = {100, 100, 50, 40, 40, 20, 10} <Always in decreasing order>
scores of Alice = {5, 25, 50, 120}

Output:
6
4
2
1
 */

package DataStructures.Arrays;

import java.util.*;

public class DenseRanking {

    private static int[] climbingLeaderboard(int[] scores, int[] alice) {
        ArrayList<Integer> scoreList = new ArrayList<Integer>();
        int[] aliceRanks = new int[alice.length];

        for (int value : scores) {
            if (!scoreList.contains(value))
                scoreList.add(value);
        }

        int rank;
        for (int i = 0; i < aliceRanks.length; i++){
            if (!scoreList.contains(alice[i]))
            {
                scoreList.add(alice[i]);
                Collections.sort(scoreList,Collections.reverseOrder());
                rank = scoreList.indexOf(alice[i]) + 1;
            }
            else
                rank = scoreList.indexOf(alice[i]) + 1;
            aliceRanks[i] = rank;
        }

        return aliceRanks;
    }

    public static void main(String[] args) {
        Scanner in = new Scanner(System.in);
        System.out.println("Enter the num of players in the leaderboard:");
        int n = in.nextInt();
        int[] scores = new int[n];
        System.out.println("Enter the scores of the players in the leaderboard:");
        for (int i = 0; i < n; i++)
            scores[i] = in.nextInt();
        System.out.println("Enter the num of games Alice played:");
        int m = in.nextInt();
        int[] alice = new int[m];
        System.out.println("Enter the scores of Alice:");
        for (int i = 0; i < m; i++)
            alice[i] = in.nextInt();

        int[] ranksOfAlice = climbingLeaderboard(scores, alice);

        System.out.println("Rank of Alice acc to her respective scores:");
        for (int rank : ranksOfAlice)
            System.out.println(rank);
    }
}
