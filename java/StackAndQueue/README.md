# Stack-and-Queue

Stack and Queue both are the non-primitive data structures. The main differences between stack and queue are that stack uses LIFO (last in first out) method to access and add data elements whereas Queue uses FIFO (First in first out) method to access and add data elements.

## Challenge 10

1. Create the stack class , the class should contain the following methods:
* push 
* pop 
* isEmpty 
* peek

2. Creat the Queue class , the class should contain the following methods:

* enqueue
* dequeue
* isEmpty 
* peek

## Approach & Efficiency

All The methods with complexity O(1)

## API

* push Method : this function accept a value and add it to the stack
* Enqueue Method : this method to accept a value and add a node with the same value to the Queue
* is empty Method : accept a Queue or Stack and return a true if is empty or false if not
* peek : method return the top node value on the stack or the front node value on the Queue
* pop : method delete the top on the stack and return its value
* deQueue : method to delete the front of the Queue and return its value.

## Challenge 11

## Description of the challenge

Implement a Queue using two Stacks. 

<img src="./challenge11.png">

## Approach & Efficiency
enqueueu: Time O(1), Space(n).
dequeue: Time O(n), Space(n).

## API

nqueue(value) which inserts value into the PseudoQueue, using a first-in, first-out approach. dequeue() which extracts a value from the PseudoQueue, using a first-in, first-out approach.