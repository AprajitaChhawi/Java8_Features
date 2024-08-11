There is one more functional interface by the name Comparator

```
Sort method inside comparator is overloaded 
to expect comparator as well 
    public static <T extends Comparable<? super T>> void sort(List<T> list) {
        list.sort((Comparator)null);
    }

    public static <T> void sort(List<T> list, Comparator<? super T> c) {
        list.sort(c);
    }
    
    
    @FunctionalInterface
public interface Comparator<T> {
    int compare(T var1, T var2);
     ............some other methods
    }
```
