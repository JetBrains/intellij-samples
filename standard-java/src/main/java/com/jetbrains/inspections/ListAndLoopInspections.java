package com.jetbrains.inspections;

import java.util.Collection;
import java.util.LinkedList;
import java.util.List;

public class ListAndLoopInspections {
    private void warnOnListRemoveInsideCountedLoop(List<String> someList) {
        for (int i = 0; i < 10; i++) {
            if (booleanExpression()) {
                someList.remove(i);
            }
        }
    }

    private void canReplaceRemoveWithListClear(List<String> list) {
        int from = 3;
        int to = 8;

        for (int i = from; i < to; i++) {
            list.remove(from);
        }
    }

    private <T> LinkedList<T> suggestsAtomicOperationForLinkedListFromCollection(Collection<T> collection) {
        LinkedList<T> list = new LinkedList<>();
        list.addAll(collection);
        return list;
    }

    //<editor-fold desc="Helper methods">
    private boolean booleanExpression() {
        return false;
    }
    //</editor-fold>

}
