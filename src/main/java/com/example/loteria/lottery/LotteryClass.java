package com.example.loteria.lottery;

import java.util.ArrayList;
import java.util.Collections;
import java.util.List;
import java.util.stream.Collectors;
import java.util.stream.IntStream;

public class LotteryClass {
    static ArrayList getCommonElements(ArrayList source, ArrayList target) {
        ArrayList sourceCopy = new ArrayList<>(source);
        sourceCopy.retainAll(target);
        return sourceCopy;
    }

    static ArrayList getRandomNumbers() {
        ArrayList numberList = (ArrayList) IntStream.rangeClosed(1, 49)
                .boxed()
                .collect(Collectors.toList());
        Collections.shuffle(numberList);
        return (ArrayList) numberList.subList(0, 6);
    }
}
