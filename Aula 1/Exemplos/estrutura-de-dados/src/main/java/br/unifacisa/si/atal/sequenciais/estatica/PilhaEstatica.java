package br.unifacisa.si.atal.sequenciais.estatica;

import br.unifacisa.si.atal.interfaces.IPilha;

public class PilhaEstatica<E> implements IPilha<E> {

    private final E[] pilha;
    private final int tamanho;
    private int topo;

    public PilhaEstatica(int tamanho) {
        this.pilha = (E[]) new Object[tamanho];
        this.tamanho = tamanho;
        this.topo = -1;  // Inicializa o topo como -1 (pilha vazia)
    }

    /**
     * Insere um elemento no topo da pilha (push)
     */
    @Override
    public void push(E e) {
        if (topo == tamanho - 1) {
            throw new StackOverflowError("A pilha está cheia!");
        }
        pilha[++topo] = e;  // Incrementa o topo e insere o elemento
    }

    /**
     * Remove e retorna o elemento do topo da pilha.
     */
    @Override
    public E pop() {
        if (isEmpty()) {
            throw new IllegalStateException("A pilha está vazia!");
        }
        E elementoTopo = pilha[topo];
        pilha[topo--] = null;  // Remove o elemento do topo e decrementa o topo
        return elementoTopo;
    }

    /**
     * Retorna o elemento do topo da pilha sem removê-lo.
     */
    @Override
    public E peek() {
        if (isEmpty()) {
            throw new IllegalStateException("A pilha está vazia!");
        }
        return pilha[topo];  // Retorna o elemento no topo
    }

    @Override
    public boolean isEmpty() {
        return topo == -1;  // A pilha está vazia quando o topo é -1
    }

    @Override
    public int search(Object o) {
        for (int i = 0; i <= topo; i++) {
            if (pilha[i].equals(o)) {
                return Math.abs(i - topo - 1);
            }
        }
        return -1;  // Retorna -1 se o elemento não for encontrado
    }

    // Método para obter o tamanho atual da pilha
    public int size() {
        return topo + 1;
    }
}
