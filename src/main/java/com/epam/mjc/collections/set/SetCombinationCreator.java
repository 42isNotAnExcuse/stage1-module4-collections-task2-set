package com.epam.mjc.collections.set;

import java.util.*;

public class SetCombinationCreator {
    public Set<String> createSetCombination(Set<String> firstSet, Set<String> secondSet, Set<String> thirdSet) {
        Set<String> rawRes1 = new HashSet<>();
        Set<String> res = new HashSet<>(firstSet);

        res.retainAll(secondSet);
        res.removeAll(thirdSet);
        thirdSet.removeAll(firstSet);
        thirdSet.removeAll(secondSet);
        res.addAll(thirdSet);

        return res;
    }
}
