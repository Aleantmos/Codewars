package other;


import org.w3c.dom.Node;

public class NodeMania {
    public static Integer searchKFromEnd(Node linkedList, int k){

       Node n1 = linkedList;
       Node n2 = linkedList;

        for (int i = 0; i < k; i++) {
            if (n1 == null) {
                return null;
            }

            n1 = n1.getNextSibling();
        }

        while (n1 != null) {
            n1 = n1.getNextSibling();
            n2 = n2.getNextSibling();
        }
        assert n2 != null;
        return Integer.parseInt(n2.getNodeValue());
    }
}
