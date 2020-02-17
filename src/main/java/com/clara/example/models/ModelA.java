package com.clara.example.models;

import java.util.Objects;

public class ModelA {
    private int x;
    private String y;

    public ModelA(int x, String y){
        this.x = x;
        this.y = y;
    }

    public int getX() {
        return x;
    }

    public void setX(int x) {
        this.x = x;
    }

    public String getY() {
        return y;
    }

    public void setY(String y) {
        this.y = y;
    }

    @Override
    public boolean equals(Object o) {
        if (this == o) return true;
        if (o == null || getClass() != o.getClass()) return false;
        ModelA modelA = (ModelA) o;
        return x == modelA.x &&
                Objects.equals(y, modelA.y);
    }

    @Override
    public int hashCode() {
        return Objects.hash(x, y);
    }

    @Override
    public String toString() {
        return "ModelA{" +
                "x=" + x +
                ", y='" + y + '\'' +
                '}';
    }
}
