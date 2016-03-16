package com.jetbrains.versioning;

import java.util.List;

/**
 * Created by breandan on 4/29/2015.
 */
public class LocalHistory {
    String change;
    List<String> changes;

    @Override
    public boolean equals(Object o) {
        if (this == o) return true;
        if (o == null || getClass() != o.getClass()) return false;

        LocalHistory that = (LocalHistory) o;

        if (change != null ? !change.equals(that.change) : that.change != null) return false;
        return changes != null ? changes.equals(that.changes) : that.changes == null;

    }

    @Override
    public int hashCode() {
        int result = change != null ? change.hashCode() : 0;
        result = 31 * result + (changes != null ? changes.hashCode() : 0);
        return result;
    }

    public boolean myEquals(Object o) {
        if (this == o) return true;
        if (o == null || getClass() != o.getClass()) return false;

        LocalHistory that = (LocalHistory) o;

        if (change != null ? !change.equals(that.change) : that.change != null) return false;
        return changes != null ? changes.equals(that.changes) : that.changes == null;
    }

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