/*
        Lab01.2: Sample a chain of 5000 integers with 6 numbers (1,2,3,4,5,6) according to a given seed.
        For any particular integer (say 1), consider only the next number in the sequence you obtained in Question 1
        (call this as the sample space for integer 1). Find out the size of each neighbour list.
        For example, suppose you have the following sequence of six numbers.

        1,"2",3,3,2,3,1,"2",3,2,1,2,3,5,4,1,5,3,2,5,6,4,2,3,6,1,1,1,3,6………

        The set for each of the numbers is as follows:

        Number (x)      Set of Immediate Neighbours of x     Size

        1                      2,2,2,5,1,1,3                   7

        2                      3,3,3,1,3,5,3                   7

        3                      3,2,1,2,5,2,6,6                 8

        4                      1,2                             2

        5                      4,3,6                           3

        6                      4,1                             2

        */

package Probability;

import java.util.ArrayList;
import java.util.Random;
import java.util.Scanner;

public class SizeOfNeighbouringSet {

    static int seed, lowerbound, upperbound;
    ArrayList<Integer>
            list = new ArrayList<Integer>()
            , l0 = new ArrayList<Integer>()
            , l1 = new ArrayList<Integer>()
            , l2 = new ArrayList<Integer>()
            , l3 = new ArrayList<Integer>()
            , l4 = new ArrayList<Integer>()
            , l5 = new ArrayList<Integer>()
            , l6 = new ArrayList<Integer>();

    public SizeOfNeighbouringSet(int lowerbound, int upperbound) {
        SizeOfNeighbouringSet.lowerbound = lowerbound;
        SizeOfNeighbouringSet.upperbound = upperbound+1;
    }

    public void generateLists(int limit) {

        Random random = new Random();
        random.setSeed(seed);

        int c = -1;

        for (int i = 1; i <= limit; i++)
        {
            int n = random.nextInt(upperbound - lowerbound) + lowerbound;
            list.add(n);

            if (c==0)
                l0.add(n);
            else if (c==1)
                l1.add(n);
            else if (c==2)
                l2.add(n);
            else if (c==3)
                l3.add(n);
            else if (c==4)
                l4.add(n);
            else if (c==5)
                l5.add(n);
            else if (c==6)
                l6.add(n);

            c = n;
        }
    }

    public void print(SizeOfNeighbouringSet object){
        System.out.println("Sample space: "+object.list);
        System.out.println("List 0: "+object.l0);
        System.out.println("List 1: "+object.l1);
        System.out.println("List 2: "+object.l2);
        System.out.println("List 3: "+object.l3);
        System.out.println("List 4: "+object.l4);
        System.out.println("List 5: "+object.l5);
        System.out.println("List 6: "+object.l6);
        System.out.println(object.l1.size()+" "+object.l2.size()+" "+object.l3.size()+" "+object.l4.size()+" "+
                object.l5.size()+" "+object.l6.size()+" "+object.l0.size());
    }

    public static void main(String[] args) {
        Scanner in = new Scanner(System.in);

        System.out.print("Enter a seed value: ");
        seed = in.nextInt();

        System.out.println("Specify the range in which random numbers are to be generated");
        System.out.print("Lower: ");
        int lowerbound = in.nextInt();
        System.out.print("Upper: ");
        int upperbound = in.nextInt();

        SizeOfNeighbouringSet object = new SizeOfNeighbouringSet(lowerbound,upperbound);

        object.generateLists(20);

        object.print(object);
    }
}
