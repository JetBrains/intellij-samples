package com.jetbrains.code.jdk17;

public class MyEarth {

    int getDamage(Object obj) {
        int damage = 0;
        if (obj instanceof PatternMatchingSwitch.AirPollution) {
            final PatternMatchingSwitch.AirPollution airPollution = ((PatternMatchingSwitch.AirPollution) obj);
            damage = airPollution.getDamage(obj);
        } else if (obj instanceof PatternMatchingSwitch.Discrimination) {
            PatternMatchingSwitch.Discrimination discrimination = ((PatternMatchingSwitch.Discrimination) obj);
            damage = discrimination.damagingGenerations();
        } else if (obj instanceof PatternMatchingSwitch.Deforestation) {
            PatternMatchingSwitch.Deforestation deforestation = ((PatternMatchingSwitch.Deforestation) obj);
            damage = deforestation.getTreeDamage();
        } else {
            damage = -1;
        }
        return damage;
    }
}