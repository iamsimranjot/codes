package datastructures;

// @author iamsimranjot
// Implementation of Queue's using Linked List

public class Lqueue {
    
    private class node{
        
        String item;
        node next;
    }
    
    node first, last;
    
    boolean isempty(){
        
        return (first == null);
    }
    
    void enqueue(String str){
        
        node oldlast= last;
        last = new node();
        last.item = str;
        last.next = null;
        
        if(isempty()) {
            first = last;
        }
        else {
            oldlast.next = last;
        }
    }
    
    String dequeue(){
        
        String item = first.item;
        first = first.next;
        
        if(isempty()) {
            last = null;
        }
        
        return item;
    }
}
