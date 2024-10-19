package br.unifacisa.si.atal.interfaces;

public interface IPilha<E> {

    /**
     * Adiciona um elemento ao topo da pilha.
     */
    public void push(E e);

    /**
     * Remove e retorna o elemento do topo da pilha.
     */
    public E pop();

    /**
     * Retorna o elemento do topo da pilha sem removê-lo.
     */
    public E peek();

    /**
     * Verifica se a pilha está vazia.
     */
    public boolean isEmpty();

    /**
     * Retorna a posição de um elemento na pilha, ou -1 se não for encontrado.
     */
    public int search(Object o);
}
