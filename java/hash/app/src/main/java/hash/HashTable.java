package hash;

public class HashTable<T> {
  Node[] arrayHash;
  int size;

  public HashTable(int size) {
    this.size = size;
    arrayHash = new Node[size];
    for (int i = 0; i < size; i++) {
      arrayHash[i] = new Node();
    }
  }
  public int getHash(Object key) {
    if(key.getClass().getSimpleName().equals("String")){
      return Math.abs(key.hashCode()%size);
    }else{
      return (Integer) key % size;
    }
  }

  public void add(Object key, Object value){
    Node newItem = new Node(key,value);
    int hashIndex = getHash(key);

    if(arrayHash[hashIndex].key == null){
      arrayHash[hashIndex] = newItem;
    }else{
      newItem.next = arrayHash[hashIndex].next;
      arrayHash[hashIndex].next = newItem;
    }
  }

  public T get(Object key){
    T output = null;

    int hashIndex = getHash(key);
    Node arrValue = arrayHash[hashIndex];

    while (arrValue != null){
      if(arrValue.key == key){
        output = (T) arrValue.value;
        break;
      }
      arrValue=arrValue.next;
    }
    return output;
  }

  public boolean contains(Object key){
    boolean output = false;

    int hashIndex = getHash(key);
    Node arrValue = arrayHash[hashIndex];

    while (arrValue.key != null){
      if(arrValue.key.equals(key)){
        output = true;
        break;
      }
      if(arrValue.next == null){
        break;
      }
      arrValue=arrValue.next;
    }
    return output;
  }
}
