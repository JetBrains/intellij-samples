package com.jetbrains.completion;

import java.util.*;

public class DataFlowCompletion {
    public void dataFlowCompletion(Collection list) {
        //Smart type completion is sensitive to dataflow analysis
        //Note the smart cast when invoking smart completion twice
        //Set es = list instanceof HashMap ?         <- ((HashMap) list).entrySet()

    }
}
