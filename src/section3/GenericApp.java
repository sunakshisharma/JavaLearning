package section3;

class Store1<T> {
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
}

public class GenericApp {
    public static void main(String[] args) {
//        raw Type AVOID IT...
//        Store store = new Store();
//        store.setStoreItem(45);

        Store1<String> stringStore1 = new Store1<>();
        stringStore1.setStoreItem("Hello World");
        String item = stringStore1.getItem();
        System.out.println(item);

    }
}
