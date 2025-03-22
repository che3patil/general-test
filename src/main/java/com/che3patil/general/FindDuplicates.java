package com.che3patil.general;

import java.util.HashSet;
import java.util.Set;

public class FindDuplicates {
    public static void findDuplicates(int[] nums) {
        Set<Integer> seen = new HashSet<>();
        Set<Integer> duplicates = new HashSet<>();

        for (int num : nums) {
            if (!seen.add(num)){
                duplicates.add(num);
                System.out.println(!seen.add(num));
            }
        }

        System.out.println("Duplicate elements: " + duplicates);
    }

    public static void main(String[] args) {
        int[] arr = {1, 2, 3, 4, 2, 5, 6, 3};
        findDuplicates(arr);
    }
}
