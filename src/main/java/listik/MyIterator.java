package listik;

import java.util.Iterator;

public class MyIterator<T> implements Iterator<T> {
    @Override
    public boolean hasNext(){
        return true;
    }

    @Override
    public T next(){
        return null;
    }
}
