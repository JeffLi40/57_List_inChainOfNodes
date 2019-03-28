/**
  Represent a list, implemented in a chain of nodes
 */
public class List_inChainOfNodes {
    private Node headReference;

    /**
      Construct an empty list
     */


    /**
      @return the number of elements in this list
     */
    public int size() {
        if (headReference == null) return 0;
        else {
            int sizeCount = 1;
            Node currentNode = headReference;
            while (currentNode.getReferenceToNextNode() != null) {
                sizeCount++;
                currentNode = currentNode.getReferenceToNextNode();
            }
            return sizeCount;
        }
    }
    /**
      @return a string representation of this list,
      format:
          # elements [element0,element1,element2,]
     */
    public String toString() {
        if (headReference == null) return "[,]";
        else {
            String s = "[" + headReference.getCargoReference() + ",";
            Node currentNode = headReference;
            while (currentNode.getReferenceToNextNode() != null) {
                s += currentNode.getReferenceToNextNode().getCargoReference() + ",";
                currentNode = currentNode.getReferenceToNextNode();
            }
            return s + "]";
        }
    }

    //if (headReference == null) return "[,]";
    //else return toString(headReference);
    //
    //     public String toString(Node node) {
    //       if (node.getReferenceToNextNode() == null) return node;
    //       else return node + "," + toString(node.getReferenceToNextNode());
    //     }

    /**
      Append @value to the head of this list.
      @return true, in keeping with conventions yet to be discussed
     */
    public boolean addAsHead(Object val) {
        headReference = new Node(val, headReference);
        return true;
    }
    public Node getNode(int index) {
        Node currentNode = headReference;
        for (int i = 0
            ; i < index
            ; i++
            , currentNode = currentNode.getReferenceToNextNode());
        
        return currentNode;
    }
    public Object get(int index) {
      return getNode(index).getCargoReference();
    }
    public boolean set(int index, Object value) {
        getNode(index).setCargoReference(value);
        return true;
    }
    public boolean add(int index, Object value) {
        if (index == size()) {
            (getNode(index - 1)).setReferenceToNextNode(new Node(value));
        } else if (index == 0) {
            addAsHead(value);
        } else {
            Node dummyNode = new Node(value, getNode(index));
            getNode(index - 1).setReferenceToNextNode(dummyNode);
        }
        return true;
    }
    public Object remove(int index) {
        Object old = get(index);
        if (index == 0) {
            headReference = getNode(1);
        }
        else getNode(index - 1).setReferenceToNextNode( getNode(index + 1));
        return old;
    }
}
