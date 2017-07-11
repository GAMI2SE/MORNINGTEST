/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package data;

/**
 *
 * @author julie
 */
public class IntegerNumber {
    private int value;

    public IntegerNumber(int value) {
        this.value = value;
    }

    public int getValue() {
        return value;
    }

    public void setValue(int value) {
        this.value = value;
    }
    
    public boolean isPrimeNumber() {
        if (value < 2) {
            return false;
        } else {
            for (int i = 1; i <= value / 2; i++) {
                if (value % i == 0) {
                    return false;
                }
            }
        }
        return true;
    }
}
