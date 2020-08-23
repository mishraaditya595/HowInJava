/*
Sample a chain of 50 integers with 6 numbers (1,2,3,4,5,6) according to a given seed. For any particular integer (say 1), consider only the next number in the sequence you obtained in Question 1 (call this as the sample space for integer 1). Find out the size of each neighbour list.


        For example, suppose you have the following sequence of six numbers.

        1,"2",3,3,2,3,1,"2",3,2,1,2,3,5,4,1,5,3,2,5,6,4,2,3,6,1,1,1,3,6………

        The set for each of the numbers is as follows:

        Number (x)      Set of Immediate Neighbours of x     Size

        1                      2,2,2,5,1,1,3                  7

        2                      3,3,3,1,3,5,3                  7

        3                      3,2,1,2,5,2,6,6                8

        4                      1,2                            2

        5                      4,3,6                          3

        6                      4,1                            2



        For set 1- 6 obtained in the previous question, calculate the probability of each element in each set respectively.

 */
package Probability;
import java.util.ArrayList;
import java.util.Scanner;

public class ProbabilityOfElementInSets {

    public ArrayList<Double> calculateProbability(ArrayList<Integer> list){
        int[] a = new int[6];
        for(int i: list){
            if(i==1)
                a[0]+=1;
            else if (i==2)
                a[1]+=1;
            else if(i==3)
                a[2]+=1;
            else if (i==4)
                a[3]+=1;
            else if (i==5)
                a[4]+=1;
            else if (i==6)
                a[5]+=1;
        }
        ArrayList<Double> probability = new ArrayList<>();
        probability.add((double) ((double)a[0]/list.size()));
        probability.add((double) ((double)a[1]/list.size()));
        probability.add((double) ((double)a[2]/list.size()));
        probability.add((double) ((double)a[3]/list.size()));
        probability.add((double) ((double)a[4]/list.size()));
        probability.add((double) ((double)a[5]/list.size()));


        return probability;
    }


    public static void main(String[] args) {
        Scanner in = new Scanner(System.in);

        System.out.print("Enter the seed value: ");
        SizeOfNeighbouringSet.seed = in.nextInt();

        SizeOfNeighbouringSet object = new SizeOfNeighbouringSet(1,6);

        object.generateLists(50);

        ProbabilityOfElementInSets obj = new ProbabilityOfElementInSets();

        ArrayList<Double> P1 = obj.calculateProbability(object.l1);
        ArrayList<Double> P2 = obj.calculateProbability(object.l2);
        ArrayList<Double> P3 = obj.calculateProbability(object.l3);
        ArrayList<Double> P4 = obj.calculateProbability(object.l4);
        ArrayList<Double> P5 = obj.calculateProbability(object.l5);
        ArrayList<Double> P6 = obj.calculateProbability(object.l6);

        for (int i=0; i<P1.size(); i++)
            System.out.println("Probability of "+i+" in L1: "+P1.get(i));
        System.out.println();
        for (int i=0; i<P2.size(); i++)
            System.out.println("Probability of "+i+" in L2: "+P2.get(i));
        System.out.println();
        for (int i=0; i<P3.size(); i++)
            System.out.println("Probability of "+i+" in L3: "+P3.get(i));
        System.out.println();
        for (int i=0; i<P4.size(); i++)
            System.out.println("Probability of "+i+" in L4: "+P4.get(i));
        System.out.println();
        for (int i=0; i<P5.size(); i++)
            System.out.println("Probability of "+i+" in L5: "+P5.get(i));
        System.out.println();
        for (int i=0; i<P6.size(); i++)
            System.out.println("Probability of "+i+" in L6: "+P6.get(i));

    }
}
