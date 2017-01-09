package pl.semiadvanced;

import java.util.*;

/**
 * Hello world!
 */
public class App {


    public static List<Integer> remainder(int x) {
        if (x < 0) {
            throw new IllegalArgumentException();
        }

        int[] nominals = new int[]{
                200, 100, 50, 20, 10, 5, 2, 1
        };
        List<Integer> resultList = new ArrayList<Integer>();

        int temp = x;

        for (int i = 0; i < nominals.length && temp != 0; i++) {
            while (temp >= nominals[i]) {
                resultList.add(nominals[i]);
                temp = temp - nominals[i];
            }
        }


        //alternatywne rozwiązanie prowadzącego
        /*
        int nominalIndex = 0;
        while (x > 0) {
            int nominal = nominals[nominalIndex];
            if(nominal <= x){
                x = x - nominal;
                resultList.add(nominal);
            } else {
                nominalIndex++;
            }
        }
        */
        return resultList;

    }
}
