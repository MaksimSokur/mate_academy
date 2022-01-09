import java.util.NoSuchElementException;

@SuppressWarnings("unchecked")
public class ArrayList<T> implements List<T> {
  private static final int DEFAULT_CAPACITY = 10;
  private int size;
  private Object[] elementData;

  public ArrayList() {
    elementData = new Object[DEFAULT_CAPACITY];
  }

  @Override
  public void add(T value) {
    if (size == elementData.length) {
      resize();
    }
    elementData[size] = value;
    size++;
  }

  @Override
  public void add(T value, int index) {
    size++;
    checkIndex(index);
    if (elementData.length == size) {
      resize();
    }

    System.arraycopy(elementData, index, elementData, index + 1, size - index);
    elementData[index] = value;

  }

  @Override
  public void addAll(List<T> list) {
    if (list.size() > elementData.length) {
      resize();
    }
    for (int i = 0; i < list.size(); i++) {
      add(list.get(i));
    }
  }

  @Override
  public T get(int index) {
    checkIndex(index);
    return (T) elementData[index];
  }

  @Override
  public void set(T value, int index) {
    checkIndex(index);
    elementData[index] = value;
  }

  @Override
  public T remove(int index) {
    checkIndex(index);
    T value = (T) elementData[index];
    System.arraycopy(elementData, index + 1, elementData, index, size - index - 1);
    size--;
    return value;
  }

  @Override
  public T remove(T element) {
    for (int i = 0; i < size; i++) {
      if (element == null) {
        size--;
        return null;
      }
      if (element.equals(elementData[i])) {
        return remove(i);
      }
    }
    throw new NoSuchElementException("Wrong element");
  }

  @Override
  public int size() {
    return size;
  }

  @Override
  public boolean isEmpty() {
    return size == 0;
  }

  private void resize() {
    Object[] objects = new Object[(int) (size * 1.5)];
    System.arraycopy(elementData, 0, objects, 0, size);
    elementData = objects;
  }

  private void checkIndex(int index) /*throws ArrayListIndexOutOfBoundsException*/{
    if (index < 0 || index >= size) {
      throw new ArrayListIndexOutOfBoundsException("Wrong index!");
    }
  }
}