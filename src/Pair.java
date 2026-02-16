    public class Pair<K, V> {
    
    private K key;
    private V value;

    public Pair (K key, V value) {
        if (key == null) {
            throw new IllegalArgumentException("A key can not be null");
        }
        this.key = key;
        this.value = value;
    }

    public static <K, V> Pair<K, V> create (K key, V value) {
        return new Pair<>(key, value);
    }

    public K getKey() {
        return key;
    }

    public V getValue() {
        return value;
        }

    @Override
    public String toString() {
        return "(key=" + key +
                ", value=" + value +
                ")";
        } 
    }