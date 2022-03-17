package ru.codewars.eightkyu;

import java.util.ArrayList;
import java.util.Collections;
import java.util.List;

public class MenFromBoys {
    public static int[] menFromBoys(final int[] values) {
        List<Integer> evenlist = new ArrayList<>();
        List<Integer> oddlist = new ArrayList<>();


        for (int value : values) {
            if (evenlist.contains(value) || oddlist.contains(value)) {
                continue;
            }
            if (value % 2 == 0) {
                evenlist.add(value);
            } else {
                oddlist.add(value);
            }
        }
        Collections.sort(evenlist);
        oddlist.sort(Collections.reverseOrder());

        evenlist.addAll(oddlist);

        int[] res = new int[evenlist.size()];
        for (int i = 0; i < evenlist.size(); i++) {
            res[i] = evenlist.get(i);
        }

        return res;
    }
    }

