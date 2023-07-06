import static org.junit.jupiter.api.Assertions.*;

class LinkedListTest {

    @org.junit.jupiter.api.Test
    void addAndGet() {
        LinkedList<Integer> list = new LinkedList<Integer>();

        assertTrue(list.isEmpty());

        list.add(1);
        list.add(2);
        list.add(3);

        assertEquals(1, list.get(0));
        assertEquals(2, list.get(1));
        assertEquals(3, list.get(2));

        assertFalse(list.isEmpty());

        assertEquals(list.size(), 3);
    }

    @org.junit.jupiter.api.Test
    void insert() {
        LinkedList<Integer> list = new LinkedList<Integer>();

        list.add(1);
        list.add(2);
        list.add(3);

        list.insert(2, 4);

        assertEquals(1, list.get(0));
        assertEquals(2, list.get(1));
        assertEquals(4, list.get(2));
        assertEquals(3, list.get(3));
    }

    @org.junit.jupiter.api.Test
    void clear() {

        LinkedList<Integer> list = new LinkedList<Integer>();

        list.add(1);
        list.add(2);
        list.add(3);

        assertEquals(list.size(), 3);

        list.clear();

        assertEquals(list.size(), 0);

    }

    @org.junit.jupiter.api.Test
    void indexOf() {

        LinkedList<Integer> list = new LinkedList<Integer>();

        list.add(1);
        list.add(2);
        list.add(3);

        assertEquals(list.size(), 3);

        assertEquals(list.indexOf(1), 0);
        assertEquals(list.indexOf(2), 1);
        assertEquals(list.indexOf(3), 2);
        assertEquals(list.indexOf(4), -1);

    }

    @org.junit.jupiter.api.Test
    void remove() {

            LinkedList<Integer> list = new LinkedList<Integer>();

            list.add(1);
            list.add(2);
            list.add(3);

            assertEquals(list.size(), 3);

            list.remove(1);

            assertEquals(list.size(), 2);
            assertEquals(list.get(0), 1);
            assertEquals(list.get(1), 3);

    }
}