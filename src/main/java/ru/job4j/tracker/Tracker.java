package ru.job4j.tracker;

import java.util.Arrays;

public class Tracker {
    private final Item[] items = new Item[100];
    private int ids = 1;
    private int size = 0;

    public Item add(Item item) {
        item.setId(ids++);
        items[size++] = item;
        return item;
    }

    public Item findById(int id) {
        return indexOf(id) != -1 ? items[indexOf(id)] : null;
    }

    public Item[] findAll() {
        Item[] itemWhithoutNull = new Item[items.length];
        int size = 0;
        for (int i = 0; i < items.length; i++ ) {
            if (items[i] != null) {
                itemWhithoutNull[size] = items[i];
                size++;
            }
        }
        return Arrays.copyOf(itemWhithoutNull, size);
    }

    public Item[] findByName(String key) {
        Item[] itemEquals = new Item[items.length];
        int size = 0;
        for (int i = 0; i < items.length; i++ ) {
            if (items[i] != null && key.equals(items[i].getName())) {
                itemEquals[size] = items[i];
                size++;
            }
        }
        return Arrays.copyOf(itemEquals, size);
    }

    private int indexOf(int id) {
        int rsl = -1;
        for (int index = 0; index < items.length; index++) {
            if (items[index].getId() == id) {
                rsl = index;
                break;
            }
        }
        return rsl;
    }

    public boolean replace(int id, Item item) {
        boolean rsl = false;
        if (indexOf(id) != -1) {
            items[indexOf(id)].setName(item.getName());
             rsl = true;
        }
        return rsl;
    }
}