package com.jetbrains.inspections;

import java.util.logging.Level;
import java.util.logging.Logger;

//Search template: logger.log($level$, $message$, $args$); (import existing template of logging without if)
@SuppressWarnings("unused")
public class StructuralSearchReplace {
    private final Logger logger = Logger.getLogger("StructuralSearch");

    public void logInfoWithinCheck() {
        if (logger.isLoggable(Level.INFO)) {
            logger.log(Level.INFO, "A log message");
        }
    }

    public void logInfo() {
        logger.log(Level.INFO, "A log message");
    }

    public void logWarningWithException() {
        logger.log(Level.WARNING, "Another log message",
                   new RuntimeException("Something went wrong"));
    }

    public void logFineWithLazyMessage() {
        logger.log(Level.FINE, () -> "Reached this point");
    }

}

