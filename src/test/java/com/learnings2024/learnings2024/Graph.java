package com.learnings2024.learnings2024;

import java.util.*;

public class Graph {
    ArrayList<Node> nodes;
    Map<Integer, ArrayList<Integer>> matrix;

    Graph() {
        nodes = new ArrayList<>();
        matrix = new HashMap<>();
    }

    public void addNode(Node node) {
        nodes.add(node);
    }

    public void addEdge(int src, int dst) {
        ArrayList<Integer> neighbors = matrix.getOrDefault(src, new ArrayList<>());
        neighbors.add(dst);
        matrix.put(src, neighbors);
    }

    public boolean checkEdge(int src, int dst) {
        return matrix.get(src).contains(dst);
    }

    public void print() {
        System.out.print("  ");
        for (Node node : nodes) {
            System.out.print(node.data + " ");
        }
        System.out.println();

        for (int i = 0; i < nodes.size(); i++) {
            System.out.print(nodes.get(i).data + " ");
            for (int j = 0; j < nodes.size(); j++) {
                System.out.print(matrix.getOrDefault(i, new ArrayList<>()).contains(j) ? "1 " : "0 ");
            }
            System.out.println();
        }
    }

    public void depthFirstSearch(int src) {
        Stack<Node> stack = new Stack<>();
        stack.push(nodes.get(src));

        while (!stack.isEmpty()) {
            Node current = stack.pop();
            if (!current.isVisited()) {
                System.out.println("visited " + current.data);
                current.setVisited(true);
            }

            ArrayList<Integer> neighbors = matrix.getOrDefault(nodes.indexOf(current), new ArrayList<>());
            for(int neighborIndex: neighbors) {
                Node neighbor = nodes.get(neighborIndex);
                if(!neighbor.isVisited()){
                    stack.push(neighbor);
                }
            }
        }
    }

    public void BreadthFirstSearch(int src) {
        Queue<Node> queue = new LinkedList<>();
        queue.add(nodes.get(src));

        while (!queue.isEmpty()) {
            Node current = queue.poll();
            if (!current.isVisited()) {
                System.out.println("visited " + current.data);
                current.setVisited(true);
            }

            ArrayList<Integer> neighbors = matrix.getOrDefault(nodes.indexOf(current), new ArrayList<>());
            for(int neighborIndex: neighbors) {
                Node neighbor = nodes.get(neighborIndex);
                if(!neighbor.isVisited()){
                    queue.add(neighbor);
                }
            }
        }
    }
}
