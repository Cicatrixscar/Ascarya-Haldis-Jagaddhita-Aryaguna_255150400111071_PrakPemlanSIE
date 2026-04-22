public class CustomStack {
    Node top;
    int size = 0;
    
    public void push(int x) {
        Node n = new Node(x);
        n.next = top;
        top = n;
        size++;
    }
    
    public int pop() {
        if (top == null)
            throw new RuntimeException("Stack is empty.");
        int val = top.data;
        top = top.next;
        size--;
        return val;
    }
    
    public boolean isEmpty() {
        return top == null;
    }

    public int peek() {
        if (top == null)
            throw new RuntimeException("Stack is empty.");
        return top.data;
    }


    public static void main(String[] args) {
        CustomStack custom = new CustomStack();
        custom.push(1);
        custom.push(2);
        custom.push(3);
        custom.push(4);

        CustomStack tempStack = new CustomStack();
        tempStack.push(custom.pop()); //4
        tempStack.push(custom.pop()); //3
        tempStack.push(custom.pop()); //2

        custom.push(5);

        //Kembalikan isi (4,3,2)
        while (!tempStack.isEmpty()) {
            custom.push(tempStack.pop());
        }

        System.out.println("Custom Stack: ");
        while (!custom.isEmpty()) {
            System.out.println(("[" + custom.pop() + "]"));
        }
        System.out.println("End.");
    }
}