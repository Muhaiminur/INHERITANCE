/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package PROTECTED;

/**
 *
 * @author ITCLANBD
 */
public class A {

    int i; // public be default
    protected int j;
    // open to A’s subclass

    void setij(int x, int y) {
        i = x;
        j = y;
    }
}
