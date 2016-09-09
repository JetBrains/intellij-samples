package com.jetbrains.analysis;

/**
 * Created by hadihariri on 09/09/16.
 */
public class DataFlowUsage {

    DataFlow dataFlowIn = new DataFlow();


    void usingDataFlow() {

        System.out.println(dataFlowIn.readId());

    }
}
