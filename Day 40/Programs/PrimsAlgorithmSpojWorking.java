import java.util.*;

public class Main {
    protected HashMap<Integer, HashMap<Integer, Integer>> map;

    public Main(int v) {
        map = new HashMap<>();
        for (int i = 1; i <= v; i++) {
            map.put(i, new HashMap<>());
        }
    }

    public void addEdge(int v1, int v2, int cost) {
        map.get(v1).put(v2, cost);
        map.get(v2).put(v1, cost);
    }

    public int prims() {
        int sum = 0;
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

        while (!pq.isEmpty()) {
            // 1. remove
            PrimsTriplet rt = pq.poll();

            // 2. ignore if already visited
            if (visited.contains(rt.vtx)) {
                continue;
            }

            // 3. marked visited
            visited.add(rt.vtx);

            // 4. self work
//            System.out.println(rt);
            sum = sum + rt.cost;

            // 5. add unvisited nbrs
            for (int nbrs : map.get(rt.vtx).keySet()) {
                if (!visited.contains(nbrs)) {
                    int cost = map.get(rt.vtx).get(nbrs);
                    pq.add(new PrimsTriplet(nbrs, rt.vtx, cost));
                }
            }

        }
        return sum;
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
        Scanner sc = new Scanner(System.in);
        int vertices = sc.nextInt();
        int edges = sc.nextInt();
        Main pq = new Main(vertices);
        for (int i = 1; i <= edges; i++) {
            int startVertex = sc.nextInt();
            int endVertex = sc.nextInt();
            int cost = sc.nextInt();
            pq.addEdge(startVertex, endVertex, cost);
        }
        System.out.println(pq.prims());
    }

}