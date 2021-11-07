package hash;

public class RepeatedWord {
  public static String repeatedWord(String string) {
    String output = null;
    String[] stringArr = string.split(" ");
    HashTable<Integer> hashTable = new HashTable<>(stringArr.length);

    for (int i = 0; i < stringArr.length; i++) {
      if (hashTable.contains(stringArr[i])) {
        output = stringArr[i];
        break;
      }
      hashTable.add(stringArr[i].toLowerCase(), i);
    }
    return output;
  }
}
