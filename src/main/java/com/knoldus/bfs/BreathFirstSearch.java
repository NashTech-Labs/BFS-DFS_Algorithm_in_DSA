package com.knoldus.bfs;

import java.util.LinkedList;
import java.util.Queue;

/**
 * This class represents a directed graph using adjacency list representation
 *
 * @author shashikant
 * @version 11.0.11
 */
public class BreathFirstSearch {

    static class MyGraph {

        // Function to add an edge into the graph
        LinkedList<Integer>[] adjacency_list;
        int vertices;

        /**
         * represents the vertices in the Graph.
         * @param vertices all vertices including src & dest.
         */
        MyGraph(int vertices) {
            this.vertices = vertices;
            this.adjacency_list = new LinkedList[this.vertices];
            for (int i = 0; i < this.vertices; i++) {
                this.adjacency_list[i] = new LinkedList<>();
            }
        }

        /**
         * a source vertex 'src' and a destination vertex 'dst'
         * @param src a source vertex 'src'.
         * @param dest a destination vertex 'dest'.
         */
        public void addData(int src, int dest) {
            this.adjacency_list[src].addFirst(dest);
            this.adjacency_list[dest].addFirst(src);
        }

        /**
         *
         * utility function for printing
         * the found path in graph
         */
        public void display_list() {
            for (int i = 0; i < this.vertices; i++) {
                System.out.print("Vertex " + i + " ");
                for (Integer item : this.adjacency_list[i]) {
                    System.out.print("->" + item);
                }
                System.out.println();
            }
        }

        /**
         * the method public void start_searching used
         * to start searching in breath First .
         * @param start denotes starting pointer to search.
         */
        public void start_searching(int start){
            Queue<Integer> queue = new LinkedList<>();

            boolean[] visited = new boolean[vertices];

            for (int i = 0 ; i < vertices ; i++){
                visited[i] = false ;
            }

            visited[start] = true ;
            queue.add(start);

            while (queue.size() != 0){

                int vertex = (int) queue.peek();

                for (Integer item : this.adjacency_list[vertex]){
                    if (!visited[item]){
                        queue.add(item);
                        visited[item] = true ;
                    }
                }

                queue.poll();
                System.out.print(" -> " + vertex);
            }
        }

    }

    /**
     * main method implement.
     * @param args arguments.
     */
    public static void main(String[] args) {

        int vertices = 6;

        MyGraph graph = new MyGraph(vertices);

        graph.addData(0, 1);
        graph.addData(0, 2);
        graph.addData(1, 3);
        graph.addData(1, 4);
        graph.addData(2, 4);
        graph.addData(3, 4);
        graph.addData(3, 5);
        graph.addData(4, 5);

        System.out.println("The Adjacency Matrix :: ");

        graph.display_list();

        graph.start_searching(2);

    }

}
