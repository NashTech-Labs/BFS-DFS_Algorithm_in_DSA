package com.knoldus.dfs;

import static org.junit.Assert.assertEquals;
import static org.junit.Assert.assertThrows;

import org.junit.Ignore;
import org.junit.Test;

public class DepthFirstSearchTest {
    /**
     * Method under test: {@link DepthFirstSearch.MyGraph#addData(int, int)}
     */
    @Test
    @Ignore("TODO: Complete this test")
    public void testMyGraphAddData() {

        (new DepthFirstSearch.MyGraph(1)).addData(2, 2);
    }

    /**
     * Method under test: {@link DepthFirstSearch.MyGraph#addData(int, int)}
     */
    @Test
    @Ignore("TODO: Complete this test")
    public void testMyGraphAddData2() {

        // TODO: Complete this test.

        (new DepthFirstSearch.MyGraph(1)).addData(0, 2);
    }

    /**
     * Method under test: {@link DepthFirstSearch.MyGraph#addData(int, int)}
     */
    @Test
    public void testMyGraphAddData3() {

        (new DepthFirstSearch.MyGraph(1)).addData(0, 0);
    }

    /**
     * Method under test: {@link DepthFirstSearch.MyGraph#MyGraph(int)}
     */
    @Test
    public void testMyGraphConstructor() {
        DepthFirstSearch.MyGraph actualMyGraph = new DepthFirstSearch.MyGraph(1);
        assertEquals(1, actualMyGraph.adjacency_list.length);
        assertEquals(1, actualMyGraph.vertices);
    }

    /**
     * Method under test: {@link DepthFirstSearch.MyGraph#MyGraph(int)}
     */
    @Test
    public void testMyGraphConstructor2() {
        assertThrows(NegativeArraySizeException.class, () -> new DepthFirstSearch.MyGraph(-1));
    }

    /**
     * Method under test: {@link DepthFirstSearch.MyGraph#display_list()}
     */
    @Test
    public void testMyGraphDisplay_list() {
        DepthFirstSearch.MyGraph myGraph = new DepthFirstSearch.MyGraph(1);
        myGraph.display_list();
        assertEquals(1, myGraph.adjacency_list.length);
        assertEquals(1, myGraph.vertices);
    }

    /**
     * Method under test: {@link DepthFirstSearch.MyGraph#start_searching(int)}
     */
    @Test
    @Ignore("TODO: Complete this test")
    public void testMyGraphStart_searching() {

        (new DepthFirstSearch.MyGraph(1)).start_searching(1);
    }

    /**
     * Method under test: {@link DepthFirstSearch.MyGraph#start_searching(int)}
     */
    @Test
    public void testMyGraphStart_searching2() {

        (new DepthFirstSearch.MyGraph(1)).start_searching(0);
    }
}

