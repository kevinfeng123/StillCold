import java.util.Arrays;

public class QQKachoo<D> implements Deque<D>{

    ArrayList<D> _deque;
    
    public QQKachoo(){
	_deque = new ArrayList<D>();
    }
    
    //means of adding an element to collection:
    //push an element on to top of deque
    public void addFirst( Card c );

    //enqueue an element to end of deque
    public void addLast( Card c);

    //pop element from front of deque
    public Card pollFirst();

    //pop element 
    public Card pollLast();

    public Card peekFirst();

    //
    public Card peekLast();

    //returns true if this deque is empty, otherwise returns false
    public boolean isEmpty();
    
}
