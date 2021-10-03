## SinglyLinkedLists:
Creating Node class, LinkedList class and instantiate a linked list in the main
Where nodes single connected to each other stated from the head, example: {1} -> {2} -> {3} -> NULL

## Approach & Efficiency
```
while(current != null) {

        result += "{ " + current.getData() + " } -> ";

        current = current.getNext();
    }
```

That will confirm that the next node in the list isn't null

**Space -> o(1)**
**Time -> O(n)**

## Linked List (challenge5):
##API
The linked list should contain the following methods with their tests:

* insert: takes an string value and creates a new node into the linked list holding that value.
* includes: checks if a certain value is in one of the nodes in the linked list.
* toString: returns a String including all the values of the linked list nodes.
