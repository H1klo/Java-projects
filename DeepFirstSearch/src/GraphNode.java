public class GraphNode {
    private boolean isVisited=false;
    private final int value;

    public GraphNode(int value) {
        this.value = value;
    }

    public boolean isVisited() {
        return isVisited;
    }

    public void setVisited(boolean visited) {
        isVisited = visited;
    }

    public int getValue() {
        return value;
    }
}

