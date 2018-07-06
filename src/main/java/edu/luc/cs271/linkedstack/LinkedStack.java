package edu.luc.cs271.linkedstack;

import java.util.List;
import java.util.ArrayList;
import java.util.NoSuchElementException;


public class LinkedStack<E> implements IStack<E> {

  /** The topmost node of this stack. The stack gets pushed down from here. */
  private Node<E> top;
    private Node<E> topOfStackRef;

    // TODO why don't we need an explicit constructor?

  @Override
  public E push(final E obj) {
    topOfStackRef = new Node<>(obj, topOfStackRef);
      // TODO 
    return obj;
  }

  @Override
  public E peek() {
    // TODO
      if (isEmpty()) {
          throw new NoSuchElementException();
      }
      else {
          return topOfStackRef.data;
      }
  }

  @Override
  public E pop() {
    // TODO
      if (isEmpty()) {
          throw new NoSuchElementException();
      }
      else {
          E result = topOfStackRef.data;
          topOfStackRef = topOfStackRef.next;
          return result;
      }
  }

  @Override
  public boolean isEmpty() {
      if (topOfStackRef == null)
        {return true;}
    else
      {return false;}
  }

  @Override
  public List<E> asList() {
      List<E> nList = new ArrayList<E>();
      while (topOfStackRef != null)
      {
          nList.add(topOfStackRef.data);
          topOfStackRef = topOfStackRef.next;
      }
      return nList;
    // TODO implement using an ArrayList.  Populate the ArrayList with the stack values, without deconstructing the stack!
    // TODO add any instance variable(s) required to support this
  }
}
