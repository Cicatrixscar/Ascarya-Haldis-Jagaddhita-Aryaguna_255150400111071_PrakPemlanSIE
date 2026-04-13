public class DoubleLinkedList {
    Node head, tail;
    int size = 0;

    void init() { head = null; }
    boolean isEmpty() { return size == 0; }
    int size() { return size; }

    void addFirst(Node data) {
        if (isEmpty()) {
            head = data;
            tail = data;
        } else {
            data.next = head;
            head.prev = data;
            head = data;
        }
        size++;
    }

    void addLast(Node data) {
        if (isEmpty()) {
            head = data;
            tail = data;
        } else {
            tail.next = data;
            data.prev = tail;
            tail = data;
        }
        size++;
    }

    void print() {
        Node current = head;
        while (current != null) {
            System.out.println(current.data);
            current = current.next;
        }
    }

    void printBackwards() {
        Node current = tail;
        while (current != null) {
            System.out.println(current.data);
            current = current.prev;
        }
    }

    Node findNode(Object data) {
        Node current = head;
        while (current != null) {
            if (current.data.equals(data))
                return current;
            current = current.next;
        }
        return null;
    }
    
    Node findNodeAt(int index) {
        if (index < 0 || index >= size)
            return null;
        Node current = head;
        for (int i = 0; i < index; i++) {
            current = current.next;
        }
        return current;
    }
    
    void removeAt(int index) {
        if (index < 0 || index >= size)
            return;

        if (index == 0) {
            head = head.next;
            if (head != null)
                head.prev = null;
            else
                tail = null;
        } else if (index == size - 1) {
            tail = tail.prev;
            tail.next = null;
        } else {
            Node current = findNodeAt(index);
            current.prev.next = current.next;
            current.next.prev = current.prev;
        }
        size--;
    }
    
    void remove(Object data) {
        Node current = findNode(data);
        if (current == null)
            return;

        if (current == head) {
            head = head.next;
            if (head != null)
                head.prev = null;
            else
                tail = null;
        } else if (current == tail) {
            tail = tail.prev;
            tail.next = null;
        } else {
            current.prev.next = current.next;
            current.next.prev = current.prev;
        }
        size--;
    }
    
    void insertAt(int index, Node data) {
        if (index < 0 || index > size)
            return;
        if (index == 0) {
            addFirst(data);
        } else if (index == size) {
            addLast(data);
        } else {
            Node current = findNodeAt(index);
            data.prev = current.prev;
            data.next = current;
            current.prev.next = data;
            current.prev = data;
            size++;
        }
    }

    void insertAfter(Object key, Node data) {
        Node current = findNode(key);
        if (current == null) {
            System.out.println("-> Data '" + key + "' tidak ditemukan.");
            return;
        }

        if (current == tail) {
            addLast(data);
        } else {
            data.next = current.next;
            data.prev = current;
            current.next.prev = data;
            current.next = data;
            size++;
        }
    }

    void insertBefore(Object key, Node data) {
        Node current = findNode(key);
        if (current == null) {
            System.out.println("-> Data '" + key + "' tidak ditemukan.");
            return;
        }

        if (current == head) {
            addFirst(data);
        } else {
            data.prev = current.prev;
            data.next = current;
            current.prev.next = data;
            current.prev = data;
            size++;
        }
    }

    public static void main(String[] args) {
        DoubleLinkedList list = new DoubleLinkedList();

        Node nodeA = new Node("A");
        Node nodeB = new Node("B");
        //Node nodeC = new Node("C");
        Node nodeD = new Node("D");

        list.addFirst(nodeA);
        list.addLast(nodeB);
        //list.addLast(nodeC);
        list.addLast(nodeD);

        System.out.println("Isi list awal : ");
        list.print();

        System.out.println("\nSisip 'C' sebelum 'D' : ");
        list.insertBefore("D", new Node("C"));
        list.print();

        System.out.println("\nSisip 'X' sebelum 'A' : ");
        list.insertBefore("A", new Node("X"));
        list.print();
        
        /*System.out.println("Isi list awal : ");
        list.print();

        System.out.println("\nSisip 'C' setelah 'B' : ");
        list.insertAfter("B", new Node("C"));
        list.print();

        System.out.println("\nSisip 'E' setelah 'D' : ");
        list.insertAfter("D", new Node("E"));
        list.print();
        
        /*System.out.println("Isi list awal : ");
        list.print();

        System.out.println("\nSisip 'C' di index 2 : ");
        list.insertAt(2, new Node("C"));
        list.print();

        System.out.println("\nSisip 'X' di index 0 : ");
        list.insertAt(0, new Node("X"));
        list.print();
        
        /*System.out.println("Hapus data 'C' : ");
        list.remove("C");
        list.print();

        System.out.println("\nHapus data 'Z' : ");
        list.remove("Z");
        list.print();
        
        /*Node searchIndex1 = list.findNodeAt(1);
        if (searchIndex1 != null) {
            System.out.println("Cari Index 1 : " + searchIndex1.data);
        } else {
            System.out.println("Cari Index 1 : Tidak ditemukan data dalam index" + searchIndex1);
        }

        Node searchIndex5 = list.findNodeAt(5);
        if (searchIndex5 != null) {
            System.out.println("Cari Index 5 : " + searchIndex5.data);
        } else {
            System.out.println("Cari Index 5 : Tidak ditemukan data dalam index (" + searchIndex5 + ")");
        }

        /*Node search1 = list.findNode("B");
        if (search1 != null) {
            System.out.println("Cari input data (B) : " + search1.data);
        } else {
            System.out.println("Data tidak ditemukan");
        }

        Node search2 = list.findNode("Z");
        if (search2 != null) {
            System.out.println("Cari input data (Z) : " + search2.data);
        } else {
            System.out.println("Data tidak ditemukan");
        }

        /*System.out.println("List urut : ");
        list.print();

        System.out.println("Backwards list : ");
        list.printBackwards();

        /*list.addLast(nodeA);
        System.out.println("head: " + list.head.data);
        System.out.println("tail: " + list.tail.data);

        list.addLast(nodeB);
        System.out.println("head: " + list.head.data);
        System.out.println("tail: " + list.tail.data);

        list.addLast(nodeC);
        System.out.println("head: " + list.head.data);
        System.out.println("tail: " + list.tail.data);

        list.print();

        System.out.println("Next of B: " + nodeB.next.data);
        System.out.println("Prev of B: " + nodeB.prev.data);*/
    }
}