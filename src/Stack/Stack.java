package Stack;

public class Stack extends Vector {
    private String[] capacity;
    private int count;
    private boolean isEmpty = true;

    public Stack(int len){
        this.capacity = new String[len];
    }

//    public void print(){
//        for(int i = 0; i < capacity.length; i++){
//            System.out.println(capacity[i]);
//        }
//    }

    public int size(){
        return count;
    }
    public void push(String item){
        if(capacity.length == count){
            String[] newItems = new String[count * 2];
            
            for (int i = 0; i < count; i++){
                newItems[i] = capacity[i];
            }

            capacity = newItems;
        }
        capacity[count++] = item;
        isEmpty = false;
    }

    public void pop(){
        capacity[capacity.length-1] = null;
        count--;
    }

    public String peek(){
        return capacity[capacity.length-1];
    }

    public String search(int item){
        for (int i = 0; i < capacity.length; i++){
            if (i == item){
                return capacity[i];
            }
        }
        return null;
    }

    public boolean empty(){
        return isEmpty;
    }


}
