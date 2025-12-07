import java.util.HashSet;

public class GraphClient {

    public static void main(String args[]) {
        Graph g = new Graph(9);
        System.out.println(g.map);

        g.addEdge(1, 2, 8);
        g.addEdge(1, 4, 7);
        g.addEdge(2, 3, 8);
        g.addEdge(4, 3, 2);
        g.addEdge(4, 5, -5);
        g.addEdge(5, 7, -2);
        g.addEdge(5, 6, 3);
        g.addEdge(6, 7, 4);

        System.out.println(g.map);
        System.out.println(g.containsEdge(1, 4));
        System.out.println(g.containsEdge(1, 7));

        System.out.println(g.containsVertex(1));
        System.out.println(g.containsVertex(190));

        System.out.println(g.noOfEdges());

//        g.removeEdge(1, 4);
        System.out.println(g.map);
        System.out.println(g.containsEdge(1, 4));

//        g.removeVertex(1);
        System.out.println(g.map);
        System.out.println(g.containsVertex(1));

        System.out.println(g.hasPath(2, 7, new HashSet<>()));

        g.findAllPaths(1, 6, new HashSet<>(), "");

        System.out.println(g.bfs(1, 6));
        System.out.println(g.dfs(1, 6));
        System.out.println(g.bfsCycle());
        System.out.println(g.bfsCycleCount());

        g.removeEdge(4, 5);
        g.addEdge(8, 9, 63);
        g.bft();


    }
}
