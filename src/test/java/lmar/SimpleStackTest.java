package lmar;

import junit.framework.Assert;
import org.junit.Before;
import org.junit.Test;

import static org.junit.Assert.*;

public class SimpleStackTest {

    SimpleStack simpleStack;

    @Before
    public void setUp() throws Exception{
        simpleStack = new SimpleStack();
        System.out.println("Je suis exécuté avant chaque test");

    }

    @Test
    public void testIsEmpty() throws Exception{
        assertEquals(true, simpleStack.isEmpty());
        String element1 = "toto";
        simpleStack.push(new Item(new String(element1)));
        assertEquals(false,simpleStack.isEmpty());
    }

    @Test
    public void testGetSize() throws Exception {
        assertEquals(0,simpleStack.getSize());
        String element1 = "toto";
        simpleStack.push(new Item(new String(element1)));
        simpleStack.push(new Item(new String(element1 + "2")));
        //la taille doit augmenter de 2
        assertEquals(2,simpleStack.getSize());
    }

    @Test
    public void testPush() throws Exception {
        Item ita = new Item(new Integer(8));
        assertEquals(0,simpleStack.getSize());
        simpleStack.push(ita);
        //la pile doit être augmentée d'un item
        assertEquals(1,simpleStack.getSize());
        Item o = simpleStack.peek();
        //on doit retrouver l'objet initial
        assertTrue(o.getValeur() instanceof Integer);
        Integer integer = (Integer)o.getValeur();
        assertEquals(8,integer.intValue());
        assertEquals(ita.getValeur(),integer);
    }

    @Test
    public void testPeek() throws Exception{
        Item ita = new Item (new Integer(8));
        assertEquals(0,simpleStack.getSize());
        simpleStack.push(ita);
        assertEquals(1,simpleStack.getSize());
        Item o = simpleStack.peek();
        //ne doit pas retirer l'objet de la pile
        assertEquals(1,simpleStack.getSize());
        //on doit retrouver l'objet initial
        assertTrue(o.getValeur() instanceof Integer);
        Integer integer = (Integer) o.getValeur();
        assertEquals(8,integer.intValue());
        assertEquals(ita.getValeur(),integer);
    }

    @Test
    public void testPop() throws Exception{
        Item ita = new Item(new Integer(8));
        assertEquals(0,simpleStack.getSize());
        simpleStack.push(ita);
        assertEquals(1,simpleStack.getSize());
        Item o = simpleStack.pop();
        // on doit retirer l'objet de la pile
        assertEquals(0,simpleStack.getSize());
        // on doit retrouver l'objet initial
        assertTrue(o.getValeur() instanceof Integer);
        Integer integer = (Integer) o.getValeur();
        assertEquals(8,integer.intValue());
        assertEquals(ita.getValeur(),integer);
    }

}