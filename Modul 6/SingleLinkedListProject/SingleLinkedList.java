public class SingleLinkedList {

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
            tail = data;
        }
        size++;
    }

        /*Node findNode(Object data) {
            Node current = head;
            while (current != null) {
                if (current.data.equals(data))
                    return current;
                current = current.next;
            }
            return null;
        }*/

        void printList() {
            Node current = head;
            while (current != null) {
                System.out.print(current.data + " -> ");
                current = current.next;
            }
            System.out.println("null");
        }

        Node findNodeAt(int index) {
            if (index < 0 || index >= size) return null;
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
                if (head == null)
                    tail = null;
            } else {
                Node prev = findNodeAt(index - 1);
                prev.next = prev.next.next;
                if (prev.next == null)
                    tail = prev;
            }
            size--;
        }

        void remove(Object data) {
            if (isEmpty()) return; 
            
            if (head.data.equals(data)) {
                head = head.next; 
                if (head == null) tail = null; 
                size--;
                return;
            }
            
            Node current = head;
            while (current.next != null) {
                if (current.next.data.equals(data)) { 
                    current.next = current.next.next; 
                    if (current.next == null) tail = current; 
                    size--;
                    return;
                }
                current = current.next;
            }
        }

        public static void main(String[] args) {
            SingleLinkedList list = new SingleLinkedList();

            list.addLast(new Node("A"));
            list.addLast(new Node("B"));
            list.addLast(new Node("C"));
            list.addLast(new Node("D"));

            System.out.println("Delete C (Mid) : ");
            list.remove("C");
            System.out.print("Hasil List : ");
            list.printList(); 

            System.out.println("Delete A (Head) :");
            list.remove("A");
            System.out.print("Hasil List : ");
            list.printList(); 

            System.out.println("Delete Z (Tidak ada di list):");
            list.remove("Z");
            System.out.print("Hasil List : ");
            list.printList(); 
            
            /*System.out.println("Delete data index 2 : ");
            list.removeAt(2);
            System.out.print("Hasil List : ");
            list.printList();

            System.out.println("Delete data index 0 : ");
            list.removeAt(0);
            System.out.print("Hasil List : ");
            list.printList();*/

            /*System.out.print("Tes findNode : ");
            Node hasil1 = list.findNodeAt(1);
                if (hasil1 != null) {
                    System.out.println("Node Found");
                } else {
                    System.out.println("Node not found (NULL)");
                }
            
            System.out.print("Tes findNode (Null Condition) : ");
            Node hasil5 = list.findNodeAt(5);
                if (hasil5 != null) {
                    System.out.println("Node Found");
                } else {
                    System.out.println("Node not found (NULL)");
                }*/
        }
}