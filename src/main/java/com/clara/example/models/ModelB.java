package com.clara.example.models;

import java.util.Objects;

public class ModelB {
    private boolean t;
    private String u;

    public ModelB(boolean t, String u) {
        this.t = t;
        this.u = u;
    }

    public boolean isT() {
        return t;
    }

    public void setT(boolean t) {
        this.t = t;
    }

    public String getU() {
        return u;
    }

    public void setU(String u) {
        this.u = u;
    }

    @Override
    public boolean equals(Object o) {
        if (this == o) return true;
        if (o == null || getClass() != o.getClass()) return false;
        ModelB modelB = (ModelB) o;
        return t == modelB.t &&
                Objects.equals(u, modelB.u);
    }

    @Override
    public int hashCode() {
        return Objects.hash(t, u);
    }

    @Override
    public String toString() {
        return "ModelB{" +
                "t=" + t +
                ", u='" + u + '\'' +
                '}';
    }
}
