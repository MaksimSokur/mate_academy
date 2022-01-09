import java.util.Objects;

@SuppressWarnings("unchecked") // do not remove this line
class Pair<T, K> {
    //write your code here
    private T firstElement;
    private K secondElement;

    private Pair(T firstElement, K secondElement) {
        this.firstElement = firstElement;
        this.secondElement = secondElement;
    }

    public static <T, K> Pair<T, K> of(T firstElement, K secondElement) {
        return new Pair<>(firstElement, secondElement);
    }

    public T getFirst() {
        return firstElement;
    }

    public K getSecond() {
        return secondElement;
    }

    public boolean equals(Pair pair) {
        if (pair == this) {
            return true;
        }
        if (pair == null) {
            return false;
        }
        if (pair.getClass().equals(Pair.class)) {
                    Pair current = (Pair) pair;
                    return Objects.equals(this.firstElement, current.firstElement) && Objects.equals(this.secondElement, current.secondElement);
                }
            return false;
    }

    public int hashCode() {
        int result = 17;
        result = 31 * result + (firstElement == null ? 0 : firstElement.hashCode());
        result = 31 * result + (secondElement == null ? 0 : secondElement.hashCode());
        return result;
    }
}
