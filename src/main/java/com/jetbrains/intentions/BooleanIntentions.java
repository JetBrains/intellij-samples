package com.jetbrains.intentions;

import static java.lang.System.out;

public class BooleanIntentions {
    public void deMorgans(boolean p, boolean q, boolean r) {
        //Replace '&&' with '||'
        if (!p && !q && !r) {
            out.println("p and q and r are *all* false");
        } else {
            out.println("at least one of p, q or r is true");
        }
    }

    public boolean isAcademic(String email) {
        //Simplify
        if (email != null && !email.isEmpty()) {
            return email.contains(".edu");
        }

        return false;
    }
}
