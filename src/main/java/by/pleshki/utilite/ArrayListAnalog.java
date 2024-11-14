package by.pleshki.utilite;

import java.util.Arrays;

public class ArrayListAnalog<E> {
    private int size;
    private Object[] elementData;
    private final int DEFAULT_CAPACITY = 10;

    public ArrayListAnalog(int capacity) {
        if (capacity > 0) {
            this.elementData = new Object[capacity];
        } else {
            throw new IllegalArgumentException("capacity error");
        }
    }

    public ArrayListAnalog() {
        this.elementData = new Object[DEFAULT_CAPACITY];
    }

    public void add(E e) {
        if (size == elementData.length) {
            listExpansion();
        }
        elementData[size] = e;
        size++;
    }

    private void listExpansion() {
        listExpansion(((elementData.length * 3) / 2 + 1) - elementData.length);
    }

    private void listExpansion(int addCapacity) {
        int oldCapacity = elementData.length;
        int newLength = oldCapacity + addCapacity;
        Object[] tempArray = new Object[newLength];
        System.arraycopy(elementData, 0, tempArray, 0, oldCapacity);
        elementData = tempArray;
    }

    public void add(int index, E e) {
        if (index > size) {
            throw new IndexOutOfBoundsException("index out of bounds");
        } else {
            if (elementData.length == size) {
                listExpansion();
            }
            if (index == size) {
                elementData[index] = e;
            } else {
                int movingSize = size - index;
                Object[] tempArray = new Object[movingSize];
                System.arraycopy(elementData, index, tempArray, 0, movingSize);
                elementData[index] = e;
                System.arraycopy(tempArray, 0, elementData, index + 1, movingSize);
            }
            size++;
        }
    }

    public int getSize() {
        return size;
    }

    @Override
    public String toString() {
        return "ArrayListAnalog{" +
                "elementData=" + Arrays.toString(elementData) +
                '}';
    }
}