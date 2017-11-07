package com.javarush.task.task37.task3707;

import java.io.IOException;
import java.io.ObjectInputStream;
import java.io.ObjectOutputStream;
import java.io.Serializable;
import java.util.*;
import java.util.function.Consumer;
import java.util.function.Predicate;
import java.util.stream.Stream;

/**
 * Created by ЯРОСЛАВ on 20.09.2017.
 */
public class AmigoSet<E> extends AbstractSet<E> implements Serializable, Cloneable, Set<E> {
    private static final Object PRESENT = new Object();
    private transient HashMap<E, Object> map;
    public AmigoSet() {
        map = new HashMap<E, Object>();
    }
    public AmigoSet(Collection<? extends E> collection) {
        int capacity = Math.max(16, (int)(collection.size()/0.75f +1));
        map = new HashMap<E, Object>(capacity);
        addAll(collection);
    }
    @Override
    public Iterator<E> iterator() {
        return map.keySet().iterator();
    }
    @Override
    public int size() {
        return map.size();
    }
    @Override
    public boolean isEmpty() {
        return map.isEmpty();
    }
    @Override
    public boolean contains(Object o) {
        return map.containsKey(o);
    }
    @Override
    public boolean remove(Object o) {
        return map.remove(o)==PRESENT;
    }
    @Override
    public void clear() {
        map.clear();
    }
    @Override
    public Spliterator<E> spliterator() {
        return map.keySet().spliterator();
    }
    @Override
    public boolean removeIf(Predicate<? super E> filter) {
        return false;
    }
    @Override
    public Stream<E> stream() {
        return null;
    }
    @Override
    public boolean add(E e) {
        return map.put(e, PRESENT) == null;
    }
    @Override
    public Stream<E> parallelStream() {
        return null;
    }
    @Override
    public void forEach(Consumer<? super E> action) {
    }
    @Override
    public Object clone() {
        try {
            AmigoSet copy = (AmigoSet)super.clone();
            copy.map = (HashMap) map.clone();
            return copy;
        }
        catch (Exception e) {
            throw new InternalError();
        }
    }
    private void writeObject(ObjectOutputStream out) throws IOException {
        out.defaultWriteObject();

        out.writeObject(map.size());
        for(E e:map.keySet()){
            out.writeObject(e);
        }
        out.writeObject(HashMapReflectionHelper.callHiddenMethod(map,"capacity"));
        out.writeObject(HashMapReflectionHelper.callHiddenMethod(map,"loadFactor"));
    }
    private void readObject(ObjectInputStream in) throws IOException, ClassNotFoundException {
        in.defaultReadObject();

        int size = (int)in.readObject();
        Set<E> set = new HashSet<>();
        for(int i =0;i<size;i++){
            set.add((E)in.readObject());
        }
        int capacity = (int)in.readObject();
        float loadFactor = (float)in.readObject();
        map = new HashMap<>(capacity,loadFactor);
        for(E e:set){
            map.put(e,PRESENT);
        }
    }
}
