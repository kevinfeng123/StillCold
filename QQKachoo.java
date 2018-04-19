import java.util.Arrays;

public class QQKachoo<Card> implements Deque<Card>{

    DLLNode<Card> _front;
    DLLNode<Card> _end;
    int size;
    
    public QQKachoo(){
        _front = null;
	_end = null;
	size = 0;
    }
    
    //Means of adding an element to collection:
    //Inserts an element at front of Deque 
    public void addFirst( Card c ){
	DLLNode<Card> newfront = new DLLNode<Card>(c, null, _front);
	_front = newfront;
	size++;
    }

   //Means of adding an element to collection:
    //Inserts an element to end of Deque
    public void addLast( Card c){
	DLLNode<Card> newlast = new DLLNode<Card>(c, _end, null);
	_end = newlast;
	size++;
    }

     //Means of removing an element to collection:
    //Removes element from front of Deque 
    public Card pollFirst(){
	if(isEmpty()){
	    return null;
	}
	if(_front == null){
	    _end = null;
	}
	Card retVal = _front.getCargo();
	_front = _front.getNext();
	_front.setPrev(null);
	size--;
	return retVal;
    }

    
    //Means of removing an element to collection:
    //Removes element from end of Deque
    public Card pollLast(){
       	if(isEmpty()){
	    return null;
	}
	if(_front == null){
	    _end = null;
	}
	Card retVal = _end.getCargo();
	_end = _end.getPrev();
	_end.setNext(null);
	size--;
	return retVal;
	
    }

    
    //Means of retrieving but not removing first element of deque
    //returns null if deque is empty
    public Card peekFirst(){
	if(isEmpty()){
	    return null;
	}
	return _front.getCargo();
    }

    //Means of retrieving but not removing last element of deque
    //returns null if deque is empty
    public Card peekLast(){
	if(isEmpty()){
	    return null;
	}
	return _end.getCargo();
    }

    //returns true if this deque is empty, otherwise returns false
    public boolean isEmpty(){
	return size == 0;
    }
    
}
