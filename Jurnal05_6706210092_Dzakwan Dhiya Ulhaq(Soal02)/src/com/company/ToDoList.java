package com.company;
import java.util.*;

public class ToDoList<E> {
    private Queue<E> queueList;
    public ToDoList(){
        queueList = new LinkedList<E>();
    }
    public void enqueue(E object){
        queueList.add(object);
    }
    public E dequeue() throws NoSuchElementException{
        return queueList.remove();
    }
    public boolean isEmpty(){
        return queueList.isEmpty();
    }
    public void print(){
        Iterator<E> iterator = queueList.iterator();
            for(int i = 0; i < queueList.size(); i++){
                for(int j = 0; j < queueList.size(); j++){
                    Object value = iterator.next();

                    if(j == queueList.size() - 1){
                        System.out.print(value);
                        break;
                    }
                    else{
                        System.out.print(value + " - ");
                    }
                }

                System.out.println();
                break;
            }

    }

}
