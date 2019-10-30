package com.company;
import java.util.*;

public class Main {

    public static void main(String[] args) {
        Scanner input = new Scanner(System.in);
        Vector<Integer> v = new Vector<>();
        int length;
        System.out.println("Enter the length of the vector");
        length = input.nextInt();
        System.out.println("Enter " + length + " numbers of the vector.");
        for(int i=0; i<length; i++)
        {
            v.add(input.nextInt());
        }
        input.close();
        System.out.println(v);
        MaxSequenceSum(v);
    }

    static void MaxSequenceSum(Vector<Integer> v)
    {
        int MaxSum = Integer.MIN_VALUE, EachSequenceSum = 0,StartIndex=0, EndIndex=0, TempStart = 0, i=0;

        for(Integer number:v)
        {
            EachSequenceSum = EachSequenceSum + number;
            if (MaxSum < EachSequenceSum)
            {
                EndIndex=i;
                StartIndex = TempStart;
                MaxSum = EachSequenceSum;
            }
            if (EachSequenceSum < 0)
            {
                TempStart=i+1;
                EachSequenceSum = 0;
            }
            i++;
        }
        System.out.println("start index is "+StartIndex+" end index "+EndIndex+" and the sum "+MaxSum);
    }
}