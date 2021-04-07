package com.jetbrains.intentions;

@SuppressWarnings("unused")
public class BooleanIntentions {
    public void replaceNotAndWithOr(boolean p, boolean q, boolean r) {
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
