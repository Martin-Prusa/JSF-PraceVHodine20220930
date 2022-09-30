package com.martin;

import jakarta.enterprise.context.RequestScoped;
import jakarta.inject.Named;

@Named("calculator")
@RequestScoped
public class CalculatorBean {
    private int a = 0;
    private int b = 0;
    private boolean isAnswer = false;

    public int plus() {
        return a+b;
    }

    public int minus() {
        return a-b;
    }

    public int times() {
        return a*b;
    }

    public float divide() {
        if(b == 0) return -1;
        return a*1f/b;
    }

    public int getA() {
        return a;
    }

    public void setA(int a) {
        this.a = a;
        this.isAnswer = true;
    }

    public int getB() {
        return b;
    }

    public void setB(int b) {
        this.b = b;
    }

    public boolean isAnswer() {
        return isAnswer;
    }
}
