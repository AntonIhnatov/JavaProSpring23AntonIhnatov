package main.java.HW10AlgorithmsAndDataStructures.DataStructures.WeightedGraph;

import java.util.List;

public class Main {
    public static void main(String[] args) {
        Graph graph = new Graph();

        City cityA = new City("A");
        City cityB = new City("B");
        City cityC = new City("C");
        City cityD = new City("D");
        City cityE = new City("E");
        City cityF = new City("F");
        City cityG = new City("G");

        graph.addCity(cityA);
        graph.addCity(cityB);
        graph.addCity(cityC);
        graph.addCity(cityD);
        graph.addCity(cityE);
        graph.addCity(cityF);
        graph.addCity(cityG);

        graph.addEdge(cityA, cityB, 30);
        graph.addEdge(cityA, cityC, 20);
        graph.addEdge(cityB, cityG, 150);
        graph.addEdge(cityC, cityF, 50);
        graph.addEdge(cityC, cityD, 10);
        graph.addEdge(cityD, cityE, 60);
        graph.addEdge(cityF, cityG, 30);
        graph.addEdge(cityE, cityF, 80);


        City source = cityA;
        City destination = cityG;
        int totalPrice = 0;

        List<Edge> shortestPath = Dijkstra.findShortestPath(graph, source, destination);

        System.out.println("Shortest path from " + source.name + " to " + destination.name + ":");
        for (Edge edge : shortestPath) {
            System.out.println(edge.source.name + " -> " + edge.destination.name + " (Price: " + edge.weight + " dollars)");
            totalPrice = totalPrice + edge.weight;
        }
        System.out.println("Total trip price - " + totalPrice + " dollars");
    }
}
