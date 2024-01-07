package com.epam.mjc.collections.set;

import java.util.HashSet;
import java.util.LinkedHashSet;
import java.util.List;
import java.util.Set;
import java.util.stream.Collectors;

public class HashSetCreator {
    public HashSet<Integer> createHashSet(List<Integer> sourceList) {
        HashSet<Integer> res = new LinkedHashSet<>();

        sourceList.forEach(e -> {
            if (e % 2 == 0) {
                int subEl = e;
                res.add(subEl);
                while (subEl % 2 == 0) {
                    subEl = subEl / 2;
                    res.add(subEl);
                }
            } else {
                res.add(e);
                res.add(e * 2);
            }
        });

        return res;
    }
}
