public class Main {
    public static void main(String[] args){
        GraphNode node1 = new GraphNode(1);
        GraphNode node2 = new GraphNode(2);
        GraphNode node3 = new GraphNode(3);
        GraphNode node4 = new GraphNode(4);
        GraphNode node5 = new GraphNode(5);
        GraphNode node6 = new GraphNode(6);
        GraphNode node7 = new GraphNode(7);
        GraphNode node8 = new GraphNode(8);
        GraphNode node9 = new GraphNode(9);
        GraphNode node10 = new GraphNode(10);
        GraphNode[][] graph= {
              //1,2,3,4,5,6,7,8,9,10
                {null, node2,null,null,node5,null,null,null,node9,null},
                {node1,null,node3,node3,null,null,null,null,null,null},
                {null,node2,null,node4,null,null,null,null,null,null},
                {null,node2,node3,null,null,null,null,null,null,null},
                {node1,null,null,null,null,node6,node7,node8,null,null},
                {null,null,null,null,node5,null,null,null,null,null},
                {null,null,null,null,node5,null,null,null,null,null},
                {null,null,null,null,node5,null,null,null,null,node10},
                {node1,null,null,null,null,null,null,null,null,node10},
                {null,null,null,null,null,null,null,node8,node9,null}
        };
        int column=0;
        int row=0;
        GraphNode graphNode;

        for(;row< graph.length;row++){
            graphNode = graph[row][0];
            if (graphNode != null) {
                System.out.print(graphNode.getValue()+", ");
                graphNode.setVisited(true);
                row=0;
                break;
            }
        }
        findPath(graph,row,column);
        }
    public static void findPath(GraphNode[][] graph,int row,int column) {

        while (true) {
            GraphNode graphNode = graph[row][column];
            if (graphNode != null) {
                if (!graphNode.isVisited()) {
                    //System.out.println(graphNode.getValue()+" "+ graph[row][column].isVisited());
                    graph[row][column].setVisited(true);
                    System.out.print(graphNode.getValue() + ", ");
                    findPath(graph,column,0);
                }
            }
            column++;
            if (column >= graph.length) {
                break;
            }
        }
    }
}

