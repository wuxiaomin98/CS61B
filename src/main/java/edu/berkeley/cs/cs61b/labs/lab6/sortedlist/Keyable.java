package edu.berkeley.cs.cs61b.labs.lab6.sortedlist;

/* Keyable.java */

//package sortedlist;

public interface Keyable {
    public int getKey();
    public boolean lessThan(Keyable x);
}