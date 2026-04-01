package com.finalproject.core.structures.aux;

public class Stack<T> {
  private static class Node<T> {
    T value;
    Node<T> next;

    Node(T value) {
      this.value = value;
      this.next = null;
    }
  }

  private Node<T> top;
  private int size;

  public Stack() {
    this.top = null;
    this.size = 0;
  }

  public void push(T value) {
    Node<T> newNode = new Node<>(value);
    newNode.next = top;
    top = newNode;
    size++;
  }

  public T pop() {
    if (isEmpty()) {
      throw new RuntimeException("Stack is empty");
    }
    T value = top.value;
    top = top.next;
    size--;
    return value;
  }

  public T peek() {
    if (isEmpty()) {
      throw new RuntimeException("Stack is empty");
    }
    return top.value;
  }

  public boolean isEmpty() {
    return size == 0;
  }

  public int size() {
    return size;
  }

}
