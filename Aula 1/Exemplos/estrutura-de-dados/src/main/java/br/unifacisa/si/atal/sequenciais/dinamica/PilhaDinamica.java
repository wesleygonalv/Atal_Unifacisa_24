package br.unifacisa.si.atal.sequenciais.dinamica;

import br.unifacisa.si.atal.interfaces.IPilha;

public class PilhaDinamica<E> implements IPilha<E> {

    private E[] pilha;
    private int topo;
    private int capacidade;

    public PilhaDinamica(int capacidadeInicial) {
        this.pilha = (E[]) new Object[capacidadeInicial];
        this.capacidade = capacidadeInicial;
        this.topo = -1;
    }

    /**
     * Insere um elemento no topo da pilha (push)
     */
    @Override
    public void push(E e) {
        if (topo == capacidade - 1) {  // Se a pilha estiver cheia
            redimensionar();  // Redimensiona a pilha
        }
        pilha[++topo] = e;  // Adiciona o elemento no topo
    }

    /**
     * Redimensiona a pilha para o dobro do tamanho atual
     */
    private void redimensionar() {
        capacidade = capacidade * 2;
        E[] novaPilha = (E[]) new Object[capacidade];
        System.arraycopy(pilha, 0, novaPilha, 0, topo + 1);
        pilha = novaPilha;
    }

    /**
     * Remove e retorna o elemento do topo da pilha (pop)
     */
    @Override
    public E pop() {
        if (isEmpty()) {
            throw new IllegalStateException("A pilha está vazia!");
        }
        E elementoTopo = pilha[topo];
        pilha[topo--] = null;  // Remove o elemento do topo
        return elementoTopo;
    }

    /**
     * Retorna o elemento do topo sem removê-lo (peek)
     */
    @Override
    public E peek() {
        if (isEmpty()) {
            throw new IllegalStateException("A pilha está vazia!");
        }
        return pilha[topo];
    }

    /**
     * Verifica se a pilha está vazia
     */
    @Override
    public boolean isEmpty() {
        return topo == -1;
    }

    /**
     * Retorna o tamanho atual da pilha
     */
    public int size() {
        return topo + 1;
    }

    @Override
    public int search(Object o) {
        for (int i = 0; i <= topo; i++) {
            if (pilha[i].equals(o)) {
                /*
                 * Se o objeto for encontrado, o método calcula sua posição em relação ao topo da pilha.
                 * 
                 * i é o índice onde o elemento foi encontrado.
                 * topo é a posição atual do topo da pilha.
                 * 
                 * Math.abs(i - topo - 1) garante que o resultado seja positivo e corresponda 
                 * à posição do elemento considerando a regra de contagem de pilhas 
                 * (posição 1 para o elemento do topo).
                 * 
                 * Exemplo de Cálculo: 
                 * 
                 * Se topo = 4 e o elemento for encontrado em i = 2, 
                 * a posição retornada será Math.abs(2 - 4 - 1) = Math.abs(-3) = 3, 
                 * indicando que o elemento está na terceira posição a partir do topo. 
                 */
                return Math.abs(i - topo - 1);
            }
        }
        return -1;  // Retorna -1 se o elemento não for encontrado
    }
}
