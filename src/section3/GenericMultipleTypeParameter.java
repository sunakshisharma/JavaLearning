package section3;

class Store<T> {
    private T item;
    public void setStoreItem(T item){
        this.item = item;
    }

    public T getItem() {
        return this.item;
    }

    @Override
    public String toString() {
        return ""+ this.item.toString();
    }
class Hashtable<K, V>{
        private K key;
        private V value;

        public Hashtable(K key, V value){
            this.key = key;
            this.value = value;
        }

    @Override
    public String toString() {
        return key.toString()+ "-"+value.toString();
    }
}
}

public class GenericMultipleTypeParameter {
    public static void main(String[] args) {
//        raw Type AVOID IT...
//        Store store = new Store();
//        store.setStoreItem(45);

//        Store1<String> stringStore1 = new Store1<>();
//        stringStore1.setStoreItem("Hello World");
//        String item = stringStore1.getItem();
//        System.out.println(item);

            //Store.Hashtable<String, Integer> hashtable = new Store.Hashtable<>("Hello World", 55);
            //System.out.println(hashtable);

    }
    }