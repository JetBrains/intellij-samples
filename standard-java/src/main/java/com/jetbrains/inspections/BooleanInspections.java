package com.jetbrains.inspections;


@SuppressWarnings("unused")
public class BooleanInspections {

    private boolean moreBooleanExpressionsCanBeSimplified(boolean a, boolean b) {
        if (a && b) {
            return true;
        } else {
            return a;
        }
    }

    public boolean canSimplifyIfElse() {
        boolean enable;
        if (booleanExpression()) {
            enable = true;
        } else {
            enable = anotherBooleanExpression();
        }
        return enable;
    }

    //Run inspection by name: "Boolean method is aways inverted"
    static class BooleanMethodIsAlwaysInverted {
        public boolean isNotAcademic(String email) {
            if (email == null || email.isEmpty()) {
                return true;
            }

            return !email.contains(".edu");
        }

        void updateEmail(String email) {
            this.email = email;
            isEligible = !isNotAcademic(email);
        }

        String email = "intellij@jetbrains.edu";
        boolean isEligible = !isNotAcademic(email);
    }

    //<editor-fold desc="Helper methods">
    private boolean anotherBooleanExpression() {
        return false;
    }

    private boolean booleanExpression() {
        return false;
    }
    //</editor-fold>


}
