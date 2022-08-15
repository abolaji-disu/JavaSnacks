package Stack;

import java.util.Objects;

public class Stack extends Vector {
    private Object[] capacity;
    private int count;

    public Stack(Object[] obj, int count){
        this.capacity = obj;
        this.count = count;
    }

    public void push(Object item){
        if(capacity.length == count){
            Object[] newItems = new Object[count * 2];
            
            for (int i = 0; i < count; i++){
                newItems[i] = capacity[i];
            }

            capacity = newItems;
        }
        capacity[count++] = item;
    }

    public void pop(){
        capacity[capacity.length-1] = null;
        count--;
    }

    public Object peek(){
        return capacity[capacity.length-1];
    }

    public Object search(Object item){
        for (int i = 0; i < capacity.length; i++){
            if (Objects.equals(i,item)){
                return item;
            }
        }
        return null;
    }

    public boolean empty(){
        for(int i = 0; i < capacity.length; i++){
            if (capacity[i] == null){
                return true;
            }
        }
        return false;
    }


}
