package br.unifacisa.si.atal.sequenciais.dinamica;

import static org.junit.jupiter.api.Assertions.assertEquals;
import static org.junit.jupiter.api.Assertions.assertFalse;
import static org.junit.jupiter.api.Assertions.assertThrows;
import static org.junit.jupiter.api.Assertions.assertTrue;
import org.junit.jupiter.api.BeforeEach;
import org.junit.jupiter.api.Test;

import br.unifacisa.si.atal.interfaces.IPilha;

class PilhaDinamicaTest {

    private IPilha<Integer> pilha;

    @BeforeEach
    @SuppressWarnings("unused")
    void setUp() {
        pilha = new PilhaDinamica<>(1);
    }

    @Test
    void testPushAndPeek() {
        pilha.push(10);
        assertEquals(10, pilha.peek(), "O elemento do topo deveria ser 10");

        pilha.push(20);
        assertEquals(20, pilha.peek(), "O elemento do topo deveria ser 20");
    }

    @Test
    void testPop() {
        pilha.push(10);
        pilha.push(20);

        assertEquals(20, pilha.pop(), "Deveria remover e retornar 20");
        assertEquals(10, pilha.pop(), "Deveria remover e retornar 10");

        assertTrue(pilha.isEmpty(), "A pilha deveria estar vazia");
    }

    @Test
    void testIsEmpty() {
        assertTrue(pilha.isEmpty(), "A pilha deveria estar vazia inicialmente");

        pilha.push(10);
        assertFalse(pilha.isEmpty(), "A pilha não deveria estar vazia após adicionar um elemento");

        pilha.pop();
        assertTrue(pilha.isEmpty(), "A pilha deveria estar vazia após remover todos os elementos");
    }

    @Test
    void testSearch() {
        pilha.push(10);
        pilha.push(20);
        pilha.push(30);

        assertEquals(1, pilha.search(30), "O elemento 30 deveria estar na posição 1");
        assertEquals(2, pilha.search(20), "O elemento 20 deveria estar na posição 2");
        assertEquals(3, pilha.search(10), "O elemento 10 deveria estar na posição 3");
        assertEquals(-1, pilha.search(40), "O elemento 40 não deveria estar na pilha");
    }

    @Test
    void testPopOnEmptyStack() {
        assertThrows(IllegalStateException.class, () -> {
            pilha.pop();
        }, "Deveria lançar IllegalStateException ao tentar fazer pop em uma pilha vazia");
    }

    @Test
    void testPeekOnEmptyStack() {
        assertThrows(IllegalStateException.class, () -> {
            pilha.peek();
        }, "Deveria lançar IllegalStateException ao tentar fazer peek em uma pilha vazia");
    }

    @Test
    void testOverflow() {
        pilha.push(10);
        pilha.push(20);
        pilha.push(30);
        pilha.push(40);
        pilha.push(50);
        pilha.push(60);
        pilha.push(70);
        pilha.push(80);
        pilha.push(90);
        pilha.push(100);

        assertFalse(pilha.isEmpty(), "A pilha não deveria estar vazia após adicionar elementos acima da capacidade");
    }
}
