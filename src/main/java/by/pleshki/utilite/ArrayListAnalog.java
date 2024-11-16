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
        if (size == elementData.length)
            listExpansion();
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
                System.arraycopy(elementData, index, elementData, index + 1, size - index);
                elementData[index] = e;
            }
            size++;
        }
    }

    public void trim() {
        if (size < elementData.length) {
            Object[] tempArray = new Object[size];
            System.arraycopy(elementData, 0, tempArray, 0, size);
            elementData = tempArray;
        }
    }

    public void clear() {
        for (int i = 0; i < size; i++)
            elementData[i] = null;
        size = 0;
    }

    public boolean remove(Object object) {
        int i = 0;
        boolean result = false;
        if (object == null) {
            for (; i < size; i++) {
                if (elementData[i] == null) {
                    result = true;
                    break;
                }
            }
        } else {
            for (; i < size; i++) {
                if (object.equals(elementData[i])) {
                    result = true;
                    break;
                }
            }
        }
        if (result)
            return removeElement(i);
        return result;
    }

    public boolean remove(int index) {
        if (index <= size)
            return removeElement(index);
        return false;
    }

    private boolean removeElement(int i) {
        final int newSize;
        if ((newSize = size - 1) > i)
            System.arraycopy(elementData, i + 1, elementData, i, newSize - i);
        elementData[size = newSize] = null;
        return true;
    }

    public void set(Object e, int index) {
        if (index <= size) {
            elementData[index] = e;
        } else throw new IndexOutOfBoundsException("Index out of range");
    }

    public int getSize() {
        return size;
    }

    @Override
    public String toString() {
        Object[] tempData = new Object[size];
        System.arraycopy(elementData, 0, tempData, 0, size);
        return "ArrayListAnalog{" +
                "elementData=" + Arrays.toString(tempData) +
                '}';
    }
}