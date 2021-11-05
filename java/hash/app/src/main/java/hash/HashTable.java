package hash;

import java.util.Arrays;

public class HashTable<T> {
  Node[] arrayHash;
  int size;

  public HashTable(int size) {
    this.size = size;
    arrayHash = new Node[size]; // initialize the array with a node take the size,its the first node
    for (int i = 0; i < size; i++) {
      arrayHash[i] = new Node(); // then we will initialize the rest of nodes inside this array which is inside the big node
    }
  }
// generate the hash which is in many ways
  public int getHash(int key) {
    return key % size;
  }

  public void add(int key, Object value){
    int hashIndex = getHash(key);
    Node arrValue = arrayHash[hashIndex]; //linked list
    Node newItem = new Node(key,value); // every index may have multi elements

    newItem.next = arrValue.next;
    arrValue.next = newItem;
  }

  public T get(int key){
    T value = null;

    int hashIndex = getHash(key);
    Node arrValue = arrayHash[hashIndex];

    while (arrValue != null){
      if(arrValue.key == key){
        value = (T) arrValue.value;
        break;
      }
      arrValue=arrValue.next;
    }
    return value;
  }

  public boolean contains(int key){
    boolean output = false;

    int hashIndex = getHash(key);
    Node arrValue = arrayHash[hashIndex];

    while (arrValue != null){
      if(arrValue.key == key){
        output = true;
        break;
      }
      arrValue=arrValue.next;
    }
    return output;
  }
}

