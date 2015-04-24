package com.jetbrains.generation;

import java.util.List;
import java.util.stream.Collectors;

public class GenerateSwitchBranches {
    enum Nucleotide {
        ADENINE, CYTOSINE, GUANINE, THMINE, URACIL
    }

    List<Nucleotide> transform(List<Nucleotide> seq) {
        return seq.stream().map(this::getBasePair)
                .collect(Collectors.toList());
    }

    private Nucleotide getBasePair(Nucleotide nucleotide) {
        switch (nucleotide) {
            //Create missing 'switch' branches
        }
        return null;
    }
}