package com.jetbrains.inspections;

import java.util.Arrays;
import java.util.HashMap;
import java.util.List;
import java.util.Map;
import java.util.stream.Collectors;

import static com.jetbrains.inspections.RedundantCode.Mood.HAPPY;
import static com.jetbrains.inspections.RedundantCode.Mood.SAD;

public class RedundantCode {
    private static final Map<String, Mood> WORD_TO_MOOD = new HashMap<>();

    static {
        WORD_TO_MOOD.put("happy", HAPPY);
        WORD_TO_MOOD.put("good", HAPPY);
        WORD_TO_MOOD.put("great", HAPPY);
        WORD_TO_MOOD.put("keen", HAPPY);
        WORD_TO_MOOD.put("awesome", HAPPY);
        WORD_TO_MOOD.put("marvelous", HAPPY);
        WORD_TO_MOOD.put("yay", HAPPY);
        WORD_TO_MOOD.put("pleased", HAPPY);

        WORD_TO_MOOD.put("sad", SAD);
        WORD_TO_MOOD.put("mad", SAD);
        WORD_TO_MOOD.put("blargh", SAD);
        WORD_TO_MOOD.put("boo", SAD);
        WORD_TO_MOOD.put("terrible", SAD);
        WORD_TO_MOOD.put("horrible", SAD);
        WORD_TO_MOOD.put("bad", SAD);
        WORD_TO_MOOD.put("awful", SAD);
    }

    private static final List<String> WORDS_IN_MESSAGE
            = Arrays.asList("This", "is", "a", "happy", "message",
                            "This is a full sentence");

    public static String analyseMood() {

        final String csv = WORDS_IN_MESSAGE.stream()
                                               .map(String::toLowerCase)
                                               .map(WORD_TO_MOOD::get)
                                               .map(Enum::name)
                                               .collect(Collectors.joining(","));
        return csv;
    }

    enum Mood {
        HAPPY, SAD;
    }

    public static void main(String[] args) {
        analyseMood();
    }
}
