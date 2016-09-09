package com.jetbrains.refactoring;

import java.util.ArrayList;

/**
 * Created by hadihariri on 09/09/16.
 */
public class TypeMigrationsRefactoring {

        private ArrayList<String> myResult;
        public String[] getResult() {
            return myResult.toArray(new String[myResult.size()]);
        }
}
