package lmar;

import java.util.EmptyStackException;

/**
 * Created by 21204603 on 20/10/2016.
 */
public class Stack implements IStack{

    private int nbElements = 0;

    @Override
    public boolean isEmpty() {
        return false;
    }

    @Override
    public int getSize() {
        return nbElements;
    }

    @Override
    public void push(Item item) {

    }

    @Override
    public Item peek() throws EmptyStackException {
        return null;
    }

    @Override
    public Item pop() throws EmptyStackException {
        return null;
    }
}
