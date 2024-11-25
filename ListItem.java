public class ListItem <T>{
    private T data;
    private ListItem<T> prev;
    private ListItem<T> next;
    ListItem(T data){
        this.data=data;
        prev=null;
        next=null;
    }
    public T getData(){
        return data;
    }
    public ListItem<T> getPrev(){
        return prev;
    }
    public ListItem<T> getNext() {
        return next;
    }
    public void setData(T data){
        this.data=data;
    }
    public void setPrev(ListItem<T> prev){
        this.prev=prev;
    }
    public void setNext(ListItem<T> next) {
        this.next = next;
    }
}
