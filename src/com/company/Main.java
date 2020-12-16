package com.company;

import java.util.LinkedList;
import java.util.Scanner;

public class Main {

    public static void main(String[] args) {
	// write your code here
        LinkedList<Integer> numberList = new LinkedList<>(); // creates new list for us
        try ( Scanner input = new Scanner(System.in))
        {
            System.out.println(" Give me my numbers: ");
            while (input.hasNextInt())
            {
                int num = input.nextInt();
                int i =0;
                if (numberList.isEmpty())
                    numberList.add(num);

                else {
                    if (numberList.get(i) == num) {
                        numberList.remove(i);
                        numberList.addFirst(num);
                    }
                    else if (numberList.get(i) != num) {
                        numberList.addFirst(num);
                            i++;
                        }
                    }

            }
        }
        catch (Exception e)
        {
            System.out.println("got an exception  " + e);
        }
        System.out.println(numberList);
    }
}
