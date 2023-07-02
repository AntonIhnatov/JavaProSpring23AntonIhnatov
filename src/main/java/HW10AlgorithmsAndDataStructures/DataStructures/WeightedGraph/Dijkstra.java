package main.java.HW10AlgorithmsAndDataStructures.DataStructures.WeightedGraph;

import java.util.*;

class Dijkstra {
    public static List<Edge> findShortestPath(Graph graph, City source, City destination) {
        Map<City, Integer> distances = new HashMap<>();
        Map<City, Edge> previousEdges = new HashMap<>();
        PriorityQueue<City> queue = new PriorityQueue<>(Comparator.comparingInt(distances::get));

        for (City city : graph.cities) {
            if (city == source) {
                distances.put(city, 0);
            } else {
                distances.put(city, Integer.MAX_VALUE);
            }
            queue.add(city);
        }

        while (!queue.isEmpty()) {
            City current = queue.poll();
            if (current == destination) {
                break;
            }

            List<Edge> adjacentEdges = graph.getAdjacentEdges(current);
            for (Edge edge : adjacentEdges) {
                int newDistance = distances.get(current) + edge.weight;
                if (newDistance < distances.get(edge.destination)) {
                    distances.put(edge.destination, newDistance);
                    previousEdges.put(edge.destination, edge);
                    queue.remove(edge.destination);
                    queue.add(edge.destination);
                }
            }
        }

        List<Edge> shortestPath = new ArrayList<>();
        City current = destination;
        while (previousEdges.containsKey(current)) {
            Edge edge = previousEdges.get(current);
            shortestPath.add(0, edge);
            current = edge.source;
        }

        return shortestPath;
    }
}