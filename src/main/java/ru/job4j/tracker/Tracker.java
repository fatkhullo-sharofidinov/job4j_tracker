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
        Item rsl = null;
        for (int index = 0; index < size; index++) {
            Item item = items[index];
            if (item.getId() == id) {
                rsl = item;
                break;
            }
        }
        return rsl;
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
        return itemWhithoutNull = Arrays.copyOf(itemWhithoutNull, size);
    }

    public Item[] findByName(String key) {
        Item[] itemEquals = new Item[items.length];
        int size = 0;
        for (int i = 0; i < items.length; i++ ) {
            if (key.equals(items[i])) {
                itemEquals[size] = items[i];
                size++;
            }
        }
        return itemEquals = Arrays.copyOf(itemEquals, size);
    }
}