/*
Question:
You have been given 3 integers - l, r and k.
Find how many numbers between l and r (both inclusive) are divisible by k.
You do not need to print these numbers, you just have to find their count.
 */

import java.io.BufferedReader;
import java.io.InputStreamReader;
import java.util.*;

class CountDivisors {

    int countDivisors() {
        Scanner s = new Scanner(System.in);
        int l = s.nextInt();
        int r = s.nextInt();
        int k = s.nextInt();
        int counter = 0;

        for (int incrementor = l; incrementor <= r; incrementor++)
            if (incrementor % k == 0)
                counter++;

        return counter;
    }
}