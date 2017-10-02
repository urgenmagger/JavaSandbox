package ru.job4j.tracker;


import java.util.Random;

/**
 * Tracker class.
 *
 * @author Megger
 * @version $Id$
 * @since 0.1
 */
public class Tracker {
    /**
     * id - id.
     */
    private Item[] items = new Item[100];

    /**
     * id - id.
     */
    private int position = 0;
    /**
     * id - id.
     */
    private static final Random RN = new Random();

    /**
     * @param items - items.
     * @return add items.
     */

    public Item add(Item items) {
        items.setId(this.generateId());
        this.items[position++] = items;
        return items;
    }

    /**
     * method update items.
     *
     * @param items - items.
     */

    public void update(Item items) {
        for (int i = 0; i != position; i++) {
            if (this.items[i] != null && this.items[i].getId().equals(items.getId())) {
                this.items[i] = items;
                break;
            }
        }
    }

    /**
     * method delete items.
     *
     * @param items - items.
     */

    public void delete(Item items) {
        for (int i = 0; i != position; i++) {
            if (this.items[i] != null && this.items[i].getId().equals(items.getId())) {
                this.items[i] = null;
                System.arraycopy(this.items, i + 1, this.items, i, this.position - 1);
            }
            this.position--;
        }
    }

    /**
     * method findById.
     *
     * @param id - id.
     * @return result.
     */
    public Item findById(String id) {
        Item result = null;
        for (Item item : this.items) {
            if (item != null && item.getId().equals(id)) {
                result = item;
                break;
            }
        }
        return result;
    }

    /**
     * @return all items.
     */

    public Item[] findAll() {
        Item[] result = new Item[this.position];
        for (int i = 0; i != this.position; i++) {
            result[i] = this.items[i];
        }
        return result;
    }

    /**
     * @return generate id.
     */
    String generateId() {
        return String.valueOf(System.currentTimeMillis() + RN.nextInt());
    }


}

