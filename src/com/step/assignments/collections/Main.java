package com.step.assignments.collections;

import java.util.HashSet;
import java.util.Set;

public class Main {


    public static<T> Set<T> intersection(Set<T> firstSet, Set<T> secondSet) {
        firstSet.retainAll(secondSet);
        return firstSet;
    }

    public static<T> Set<T> union(Set<T> firstSet, Set<T> secondSet){
        firstSet.addAll(secondSet);
        return firstSet;
    }

    public static void main(String[] args) {

        Set<Integer> oddNumbers = new HashSet<>();

        oddNumbers.add(1);
        oddNumbers.add(3);
        oddNumbers.add(5);
        oddNumbers.add(7);
        oddNumbers.add(9);
        oddNumbers.add(11);
        oddNumbers.add(13);
        oddNumbers.add(15);


        Set<Integer> primeNumbers = new HashSet<>();

        primeNumbers.add(2);
        primeNumbers.add(3);
        primeNumbers.add(5);
        primeNumbers.add(7);
        primeNumbers.add(11);
        primeNumbers.add(13);
        primeNumbers.add(17);

        System.out.print(oddNumbers);
        System.out.println("-odd-----");
        System.out.print(primeNumbers);
        System.out.println("-prime------");

        System.out.println(intersection(oddNumbers,primeNumbers));

        System.out.print(oddNumbers);
        System.out.println("-odd-----");
        System.out.print(primeNumbers);
        System.out.println("-prime------");

        System.out.println(union(oddNumbers,primeNumbers));
    }


}
