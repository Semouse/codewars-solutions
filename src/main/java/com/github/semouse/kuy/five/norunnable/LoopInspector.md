Source: https://www.codewars.com/kata/52a89c2ea8ddc5547a000863/train/java

Description:
You are given a node that is the beginning of a linked list. This list contains a dangling piece and a loop. Your
objective is to determine the length of the loop.

Code:

```
    public int loopSize(Node node) {
        Node hair = node, turtle = node;
        do{
          hair = hair.getNext().getNext();
          turtle = turtle.getNext();
        } while (hair != turtle);
    
        int count = 0;
        do{
          turtle = turtle.getNext();
          count++;
        } while (hair != turtle);
    
        return count;
    }
```
