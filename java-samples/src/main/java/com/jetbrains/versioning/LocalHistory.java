package com.jetbrains.versioning;

import java.util.List;

public class LocalHistory {
    String change;
    List<String> changes;

    public LocalHistory(String string, List<String> changes) {
        this.change = string;
        this.changes = changes;
    }

    public String getChange() {
        return change;
    }

    //Sets the change variable
    public void setChange(String change) {
        this.change = change;
    }

    public List<String> getChanges() {
        return changes;
    }

    public void setChanges(List<String> changes) {
        this.changes = changes;
    }
}