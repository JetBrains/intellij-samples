package com.jetbrains.generation;

import java.util.List;
import java.util.stream.Collectors;

@SuppressWarnings("unused")
public class GenerateSwitchBranches {
    enum Nucleotide {
        ADENINE, CYTOSINE, GUANINE, THYMINE, URACIL
    }

    List<Nucleotide> transform(List<Nucleotide> seq) {
        return seq.stream()
                  .map(this::getBasePair)
                  .collect(Collectors.toList());
    }

    private Nucleotide getBasePair(Nucleotide nucleotide) {
        switch (nucleotide) {
            case ADENINE:
                return Nucleotide.THYMINE;
            case CYTOSINE:
                return Nucleotide.GUANINE;
            case URACIL:
                return Nucleotide.ADENINE;
        }
        return null;
    }
}