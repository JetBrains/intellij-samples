package com.jetbrains.inspections;

/**
 * Created by breandan on 2/13/2015.
 */
public class BooleanInspections {
    //Run inspection by name: "Boolean method is aways inverted"
    class BooleanMethodIsAlwaysInverted {
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
}
