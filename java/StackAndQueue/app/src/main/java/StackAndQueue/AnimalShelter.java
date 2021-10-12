package StackAndQueue;

public class AnimalShelter {
  Queue cat = new Queue();
  Queue dog = new Queue();

public void enqueue(Dog dogs) {
  dog.enqueue(dogs.getType());
}
  public void enqueue(Cat cats) {
    cat.enqueue(cats.getType());
  }

  public String dequeue(String animal) throws Exception {
    if (animal.equals("dog") && (dog != null)){
      return dog.dequeue();
    } else if (animal.equals("cat") && cat !=null) {
      return cat.dequeue();
    } else {
      return null;
    }
  }

  @Override
  public String toString() {
    return "AnimalShelter{" +
      "dogs=" + dog +
      ", cats=" + cat +
      '}';
  }
}
