package edu.luc.cs271.linkedstack;

import java.util.List;
import java.util.ArrayList;
import java.util.NoSuchElementException;


public class LinkedStack<E> implements IStack<E> {

  /** The topmost node of this stack. The stack gets pushed down from here. */
  private Node<E> top;

  // TODO why don't we need an explicit constructor?

  @Override
  public E push(final E obj) {
    top = new Node<>(obj, top);
    return obj;

  }

  @Override
  public E peek() {
    if (isEmpty())
    {
      throw new NoSuchElementException();
    }
    return top.data;
  }

  @Override
  public E pop() {
    if (isEmpty()) {
      throw new NoSuchElementException();
    }
    else {
      E newTop = top.data;
      top = top.next;
      return newTop;
    }
  }

  @Override
  public boolean isEmpty() {
    if (top == null)
    {return true;}
    else
    {return false;}
  }

  @Override
  public List<E> asList() {
    ArrayList<E> list = new ArrayList<E>();
    while (top != null) {
      list.add(top.data);
      top = top.next;
    }
    return list;
  }
}
