package com.finalproject.core.queue;

/**
 * Implementación genérica de una cola FIFO (First-In, First-Out).
 *
 * <p>Esta clase mantiene referencias al frente y al final de la cola para que
 * las operaciones {@link #enqueue(Object)} y {@link #dequeue()} se realicen en
 * tiempo constante O(1).
 *
 * @param <T> tipo de los elementos en la cola
 */
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

  /**
   * Crea una cola vacía.
   */
  public Queue() {
    this.front = null;
    this.rear = null;
    this.size = 0;
  }

  /**
   * Añade un elemento al final de la cola.
   *
   * @param value el valor a encolar; puede ser {@code null}
   */
  public void enqueue(T value) {
    Node<T> newNode = new Node<>(value);
    if (isEmpty()) {
      front = rear = newNode;
    } else {
      rear.next = newNode;
      rear = newNode;
    }
    size++;
  }

  /**
   * Remueve y retorna el elemento que está al frente de la cola.
   *
   * @return el valor desencolado
   * @throws RuntimeException si la cola está vacía
   */
  public T dequeue() {
    if (isEmpty()) {
      throw new RuntimeException("Queue is empty");
    }
    T value = front.value;
    front = front.next;
    size--;
    if (isEmpty()) {
      rear = null;
    }
    return value;
  }

  /**
   * Retorna el elemento al frente sin removerlo.
   *
   * @return el valor al frente de la cola
   * @throws RuntimeException si la cola está vacía
   */
  public T peek() {
    if (isEmpty()) {
      throw new RuntimeException("Queue is empty");
    }
    return front.value;
  }

  /**
   * Indica si la cola está vacía.
   *
   * @return {@code true} si no hay elementos, {@code false} si hay al menos uno.
   */
  public boolean isEmpty() {
    return size == 0;
  }

  /**
   * Devuelve el número de elementos en la cola.
   *
   * @return la cantidad de elementos en espera
   */
  public int size() {
    return size;
  }

}
