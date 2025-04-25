package collection.link;

public class NodeMain1 {

    public static void main(String[] args) {
        // 노드 생성하고 연결: A -> B -> C

        Node firstNode = new Node("A");
        firstNode.next = new Node("B");
        firstNode.next.next = new Node("C");

        System.out.println("모든 노드 탐색하기");
        Node x = firstNode;

        while (x != null) {
            System.out.println(x.item);
            x = x.next;
        }

    }

}
