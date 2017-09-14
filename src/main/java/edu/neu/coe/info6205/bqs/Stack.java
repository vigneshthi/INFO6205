/*
 * Copyright (c) 2017. Phasmid Software
 */

package edu.neu.coe.info6205.bqs;

public interface Stack<Item> {

    /**
     * Update this Stack by adding an item on the top.
     * @param item the item to add
     */
    public void push(Item item);

    /**
     * Update this Stack by taking the top item of this Stack.
     * @return the item.
     * @throws Exception
     */
    public Item pop();

    /**
     * Take the peek at the item on top of this Stack.
     * @return the item.
     */
    public Item peek();

    /**
     * @return true if this stack is empty
     */
    public boolean isEmpty();
}
