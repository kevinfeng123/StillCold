//StillCold (Fiona Cai, Alexia Leong, Kevin Feng)
//APCS2 pd1
//L#02: All Hands on Deque!
//2018-04-20

/*****************************************************
 * interface Deque
 * Includes only methods listed in AP subset of Java
 * (Local version, to override built-in Java implementation.)
 ******************************************************/

public interface Deque<Card>{

    //~~~~~~~~~~~~~~~~~~~~~~~~begin AP subset~~~~~~~~~~~~~~~~~~~~~~~~//
    //Means of adding an element to collection:
    //Inserts an element at front of Deque
    public void addFirst( Card c );

    //Means of adding an element to collection:
    //Inserts an element to end of Deque
    public void addLast( Card c);

    //Means of removing an element to collection:
    //Removes element from front of Deque
    public Card pollFirst();

    //Means of removing an element to collection:
    //Removes element from end of Deque
    public Card pollLast();

    //Means of viewin
    public Card peekFirst();

    //
    public Card peekLast();

    //returns true if this deque is empty, otherwise returns false
    public boolean isEmpty();

    //~~~~~~~~~~~~~~~~~~~~~~~end AP subset~~~~~~~~~~~~~~~~~~~~~~~~~~//
}//end interface Deque
