# StillCold
Fiona Cai, Kevin Feng, Alexia Leong

APCS2 pd1
## L #02: All Hands on Deque!

## To Do List:
- [X] Write informative comments for each chosen method in Deque interface
- [X] Choose a data structure for deque testing and implementation
- [X] Write deque implementation, methods in QQKachoo:
     - ```void addFirst( Card C ); ```
     - ```void addLast( Card C ); ```
     - ```Card pollFirst(); ```
     - ```Card pollLast(); ```
     - ```Card peekFirst(); ```
     - ```Card peekLast(); ```
     - ```boolean isEmpty(); ```

- [X] Create a driver for testing QQKachoo
- [X] Update README.md with method selections and rationale for choosing said data structure

## Development Plan:
1. Select methods for our local Deque interface based on queue and deque Java API entries
2. Write local Deque interface with comments
3. Choose a data structure for deque testing and implementation
4. Write deque implementation, methods in QQKachoo
5. Create a driver for testing QQKachoo
6. Update README.md with method selections and rationale for choosing said data structure

## Method Selections:
1. addFirst(Card C) and addLast(Card C)

      We chose addFirst and addLast because we needed a way to add a card to both ends of the deque. We chose these methods over offerFirst and offerLast because those return a boolean and for just putting a card in the deque and we didn't need that. We also didn't use push() because we needed methods that worked for both ends of the deque.  
         
2. pollFirst() and pollLast()

      pollFirst() and pollLast() retrieves and removes the value at either the first or last element of the deque but the element if empty (there isn't anything in the first or last spot) then it'll return a null. We chose to use the poll methods instead of the remove methods because even though it also retrieves and removes the element, it won't return a null if there's nothing in the spot. Like push(), we didn't use pop() because we needed methods to work for both ends of the deque.
      
3. peekFirst() and peekLast()

      peekFirst() and peekLast() retrieves the element at the first or last element of the deque and if it's empty, it'll return a null. We chose these methods over getFirst() and getLast() because even though those also retrieve the first or last element, it won't return a null.
      
4. isEmpty()

      We just needed a method to tell us if the deque was empty or not to use in other methods.

## Why Doubly Linked Nodes?

   Initially, we chose to use an ArrayList as our container for our deque because we thought the implementation for an ArrayList over a linked list would be easier and there was a way to access both ends of the array that was simpler than a linked list. So after thinking about it more, we changed from an ArrayList container to having Doubly Linked Nodes so that the methods we chose to implement would run in constant (O(1)) time rather than having addFirst(Card C) run in linear (O(n)) time if we used an ArrayList.

