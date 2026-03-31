package com.finalproject.core.stack;

/**
 * Implementación genérica de una pila (LIFO - Last-In, First-Out).
 *
 * <p>Esta clase proporciona operaciones básicas de pila con complejidad
 * amortizada O(1) para push, pop, peek, isEmpty y size.
 *
 * @param <T> tipo de los elementos almacenados en la pila
 */
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

  /**
   * Crea una pila vacía.
   */
  public Stack() {
    this.top = null;
    this.size = 0;
  }

  /**
   * Inserta un valor en el tope de la pila.
   *
   * @param value el valor a añadir; puede ser {@code null} si se requiere
   */
  public void push(T value) {
    Node<T> newNode = new Node<>(value);
    newNode.next = top;
    top = newNode;
    size++;
  }

  /**
   * Elimina y retorna el valor del tope de la pila.
   *
   * @return el valor extraído de la pila
   * @throws RuntimeException si la pila está vacía
   */
  public T pop() {
    if (isEmpty()) {
      throw new RuntimeException("Stack is empty");
    }
    T value = top.value;
    top = top.next;
    size--;
    return value;
  }

  /**
   * Retorna el valor del tope de la pila sin eliminarlo.
   *
   * @return el valor del tope de la pila
   * @throws RuntimeException si la pila está vacía
   */
  public T peek() {
    if (isEmpty()) {
      throw new RuntimeException("Stack is empty");
    }
    return top.value;
  }

  /**
   * Indica si la pila está vacía.
   *
   * @return {@code true} si la pila no contiene elementos; {@code false} en caso contrario
   */
  public boolean isEmpty() {
    return size == 0;
  }

  /**
   * Devuelve la cantidad de elementos almacenados en la pila.
   *
   * @return el tamaño actual de la pila
   */
  public int size() {
    return size;
  }

}
