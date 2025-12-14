import java.util.Comparator;
import java.util.HashMap;
import java.util.HashSet;
import java.util.PriorityQueue;

public class PrimsAlgorithm {
    protected HashMap<Integer, HashMap<Integer, Integer>> map;

    public PrimsAlgorithm(int v) {
        map = new HashMap<>();
        for (int i = 1; i <= v; i++) {
            map.put(i, new HashMap<>());
        }
    }

    public void addEdge(int v1, int v2, int cost) {
        map.get(v1).put(v2, cost);
        map.get(v2).put(v1, cost);
    }

    public void prims() {
        PriorityQueue<PrimsTriplet> pq = new PriorityQueue<>(
                new Comparator<PrimsTriplet>() {
                    @Override
                    public int compare(PrimsTriplet o1, PrimsTriplet o2) {
                        return o1.cost - o2.cost;
                    }
                }
        );

        HashSet<Integer> visited = new HashSet<>();
        pq.add(new PrimsTriplet(1, 1, 0));

        while(!pq.isEmpty()) {
            // 1. remove
            PrimsTriplet rt = pq.poll();

            // 2. ignore if already visited
            if(visited.contains(rt.vtx)) {
                continue;
            }

            // 3. marked visited
            visited.add(rt.vtx);

            // 4. self work
            System.out.println(rt);

            // 5. add unvisited nbrs
            for(int nbrs : map.get(rt.vtx).keySet()) {
                if(!visited.contains(nbrs)) {
                    int cost = map.get(rt.vtx).get(nbrs);
                    pq.add(new PrimsTriplet(nbrs, rt.vtx, cost));
                }
            }

        }
    }

    class PrimsTriplet {
        int vtx;
        int acqvtx;
        int cost;

        public PrimsTriplet(int vtx, int acqvtx, int cost) {
            this.vtx = vtx;
            this.acqvtx = acqvtx;
            this.cost = cost;
        }

        @Override
        public String toString() {
            return vtx + " " + acqvtx + " @ " + cost;
        }
    }

    public static void main(String args[]) {
        PrimsAlgorithm pq = new PrimsAlgorithm(7);
        pq.addEdge(1, 2, 5);
        pq.addEdge(1, 4, 2);
        pq.addEdge(2, 3, 3);
        pq.addEdge(4, 3, 1);
        pq.addEdge(4, 5, 6);
        pq.addEdge(5, 6, 2);
        pq.addEdge(6, 7, 9);
        pq.addEdge(5, 7, 4);
        pq.prims();
    }

}


























