public class List <T>{
    ListItem<T>first;
    ListItem<T>last;
    private int kol;
    List(){
        kol=0;
        first=last=null;
    }
    List(T data){
        first=last=new ListItem<>(data);
        kol=1;
    }
    public void add(T data){
        ListItem<T>t=new ListItem<>(data);
        if(kol>0){
            last.setNext(t);
            t.setPrev(last);
            last=t;
        }
        else{first=t;}
        last=t;
        kol++;
    }
    public void Print(){
        ListItem<T> current=first;
        System.out.println("Список: ");
        while(current!=null){
            System.out.print(current.getData()+" ");
            current=current.getNext();
        }
        System.out.println();
    }
    public boolean isSymmetric(){
        ListItem<T>left=first;
        ListItem<T>right=last;
        while(left!=null && right!=null){
            if(!left.getData().equals(right.getData()))
                return false;
            left=left.getNext();
            right=right.getPrev();
        }
        return left==null && right==null;
    }
    public void deleteIndex(int index){
        if(index<0 || index>=kol){
            throw new IndexOutOfBoundsException("Индекс вне диапазона");
        }
        ListItem<T>current=first;
        for(int i=0;i<index;i++){
            current=current.getNext();
        }
        if(current==first && current==last){
            first=null;
            last=null;
        }
        else if(current==first){
            first=current.getNext();
            if(first!=null)
                first.setPrev(null);
        }
        else if(current==last){
            last=current.getPrev();
            last.setNext(null);
        }
        else{
            current.getPrev().setNext(current.getNext());
            current.getNext().setPrev(current.getPrev());
        }
        kol--;
    }
    public void DeleteFirst(T data){
        ListItem<T>current=first;
        while(current!=null){
            if(current.getData().equals(data)){
                if(current==first && current==last){
                    first=null;
                    last=null;
                }
                else if(current==first){
                    first=current.getNext();
                    if(first!=null)
                        first.setPrev(null);
                }
                else if(current==last){
                    last=current.getPrev();
                    last.setNext(null);
                }
                else{
                    current.getPrev().setNext(current.getNext());
                    current.getNext().setPrev(current.getPrev());
                }
                kol--;
            }
            current=current.getNext();
        }
    }
}
