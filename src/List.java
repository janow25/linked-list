interface List<type> {
    void add(type value);
    void insert(int index, type value);
    void clear();
    type get(int index);
    int indexOf(type value);
    boolean isEmpty();
    void remove(int index);
    int size();
}
