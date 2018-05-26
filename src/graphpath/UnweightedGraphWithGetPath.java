package graphpath;

import queue.LinkedQueue;

import java.util.*;

public class UnweightedGraphWithGetPath extends UnweightedGraph {
    public UnweightedGraphWithGetPath(String[] cities, List<List<Integer>> connections) {
        super(cities, connections);
    }

    public List<Integer> getPath(int u, int v){
        Queue<Integer> queue = new LinkedQueue<>();
        doBFS(u, v);
        return null;
    }

    private void doBFS(int start, int end) {
        Queue<Integer> queue = new LinkedList<>();
        Stack<Integer> stack = new Stack<>();
        boolean visited[] = new boolean[cities.length];
        queue.add(start);
        visited[start] = true;
        while (!queue.isEmpty())
        {
            stack.add(start);
            int source = queue.remove();
            System.out.println(source + "t" + queue.size());
            List<Integer> neighbours = connections.get(source);
            for (int element: neighbours) {
                if (element == end)
                    break;
                if(!visited[element])
                {
                    queue.add(element);
                    visited[element] = true;
                }
            }

        }
        System.out.println(Arrays.toString(visited));
    }

}
