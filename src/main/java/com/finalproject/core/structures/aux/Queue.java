package com.finalproject.core.structures.aux;

public class Queue<T> {
  private static class Node<T> {
    T value;
    Node<T> next;

    Node(T value) {
      this.value = value;
      this.next = null;
    }
  }

  private Node<T> front;
  private Node<T> rear;
  private int size;

  public Queue() {
    this.front = null;
    this.rear = null;
    this.size = 0;
  }

  public void enqueue(T value) {
    Node<T> newNode = new Node<>(value);
    if (rear != null) {
      rear.next = newNode;
    }
    rear = newNode;
    if (front == null) {
      front = rear;
    }
    size++;
  }

  public T dequeue() {
    if (isEmpty()) {
      throw new RuntimeException("Queue is empty");
    }
    T value = front.value;
    front = front.next;
    if (front == null) {
      rear = null;
    }
    size--;
    return value;
  }

  public T peek() {
    if (isEmpty()) {
      throw new RuntimeException("Queue is empty");
    }
    return front.value;
  }

  public boolean isEmpty() {
    return size == 0;
  }

  public int size() {
    return size;
  }
}
