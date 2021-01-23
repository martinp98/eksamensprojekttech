package com.nogetfedt.kea.model;
//I'm sure there's a better way to do this


public class IntComparer {
    private int int1;
    private int int2;

    public boolean compare(){
        if (int1==int2){return true;}
        return false;
    }

    public int getInt1() {
        return int1;
    }

    public int getInt2() {
        return int2;
    }

    public void setInt1(int int1) {
        this.int1 = int1;
    }

    public void setInt2(int int2) {
        this.int2 = int2;
    }

    public IntComparer(int int1, int int2){
        this.int1 = int1;
        this.int2 = int2;
    }
}
