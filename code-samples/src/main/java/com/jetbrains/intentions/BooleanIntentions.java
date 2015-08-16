package com.jetbrains.intentions;

/**
 * Created by breandan on 2/13/2015.
 */
public class BooleanIntentions {
    public void deMorgans(boolean p, boolean q, boolean r) {
        //Replace '&&' with '||'
        if (!p && !q && !r) {
            System.out.println("p and q and r are *all* false");
        } else {
            System.out.println("at least one of p, q or r is true");
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
