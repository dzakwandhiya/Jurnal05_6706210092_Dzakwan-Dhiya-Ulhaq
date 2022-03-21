package com.company;

public class Stack {
    private int ukuranMaksimal;
    private char[] stackArray;
    private int top;

    public Stack(int maksimal){
        ukuranMaksimal = maksimal;
        stackArray = new char[ukuranMaksimal];
        top = -1;
    }

    public void push(char i){
        stackArray[++top] = i;
    }

    public char pop(){
        return stackArray[top--];
    }

    public char peek(){
        return stackArray[top];
    }

    public boolean isEmpty(){
        return (top == -1);
    }
}
