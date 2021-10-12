package StackAndQueue;

import java.util.HashMap;
import java.util.LinkedList;
import java.util.Map;

public class Balanced {

  public boolean validateBrackets(String arg) {
    char c[] = arg.toCharArray();
    Stack myStack = new Stack();
 if (((arg.length() % 2) != 0) )
    return false;
    for (int i = 0; i < c.length; i++) {
      if (c[i] == '(' || c[i] == '[' || c[i] == '{') {
        myStack.push(c[i]+"");
      } else {
        if (myStack.isEmpty()) {
          return false;
        } else {
          char chAr = c[i];
          if (chAr == ')' && (myStack.peek()).equals('('+"")) {
            myStack.pop();
          } else if (chAr == ']' &&(myStack.peek()).equals('['+"")) {

            myStack.pop();
          } else if (chAr == '}' && (myStack.peek()).equals('{'+"")) {

            myStack.pop();
          }
        }
      }

    }
    if (myStack.isEmpty()) {
      return true;
    } else {
      return false;
    }
  }
}
