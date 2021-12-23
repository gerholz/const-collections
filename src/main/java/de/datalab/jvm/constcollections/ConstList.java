package de.datalab.jvm.constcollections;

/*
Copyright 2021 Gerhard Holzmeister

Licensed under the Apache License, Version 2.0 (the "License");
you may not use this file except in compliance with the License.
You may obtain a copy of the License at
    http://www.apache.org/licenses/LICENSE-2.0
Unless required by applicable law or agreed to in writing, software
distributed under the License is distributed on an "AS IS" BASIS,
WITHOUT WARRANTIES OR CONDITIONS OF ANY KIND, either express or implied.
See the License for the specific language governing permissions and
limitations under the License.
*/

import java.util.ArrayList;
import java.util.Collection;
import java.util.List;
import java.util.function.Consumer;
import java.util.stream.Stream;

public final class ConstList<E> {

    private final List<E> list;

    public ConstList(Collection<? extends E> c) {
        this.list = new ArrayList<>(c);
    }

    boolean contains(Object object) { return list.contains(object); }

    boolean containsAll(Collection<?> c) { return list.containsAll(c); }

    void forEach(Consumer<? super E> action) {
        list.forEach(action);
    }

    List<E> get()
    {
        return new ArrayList<>(list);
    }

    E get(int idx)
    {
        return list.get(idx);
    }

    int indexOf(Object o) { return list.indexOf(o); }

    boolean isEmpty() { return list.isEmpty(); }

    int lastIndexOf(Object o) { return list.lastIndexOf(o); }

    int size() { return list.size(); }

    Stream<E> stream() {
        return list.stream();
    }

    List<E> subList(int fromIndex, int toIndex) { return new ArrayList<>(list.subList(fromIndex, toIndex)); }

    Object[] toArray() { return list.toArray(); }

    <T> T[] toArray(T[] a) { return list.toArray(a); }
}
