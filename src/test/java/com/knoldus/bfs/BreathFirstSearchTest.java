package com.knoldus.bfs;

import static org.junit.Assert.assertEquals;
import static org.junit.Assert.assertThrows;

import org.junit.Ignore;
import org.junit.Test;

public class BreathFirstSearchTest {
    /**
     * Method under test: {@link BreathFirstSearch.MyGraph#addData(int, int)}
     */
    @Test
    @Ignore("TODO: Complete this test")
    public void testMyGraphAddData() {

        (new BreathFirstSearch.MyGraph(1)).addData(2, 2);
    }

    /**
     * Method under test: {@link BreathFirstSearch.MyGraph#addData(int, int)}
     */
    @Test
    @Ignore("TODO: Complete this test")
    public void testMyGraphAddData2() {

        // TODO: Complete this test.

        (new BreathFirstSearch.MyGraph(1)).addData(0, 2);
    }

    /**
     * Method under test: {@link BreathFirstSearch.MyGraph#addData(int, int)}
     */
    @Test
    public void testMyGraphAddData3() {

        // TODO: Complete this test.

        (new BreathFirstSearch.MyGraph(1)).addData(0, 0);
    }

    /**
     * Method under test: {@link BreathFirstSearch.MyGraph#MyGraph(int)}
     */
    @Test
    public void testMyGraphConstructor() {
        BreathFirstSearch.MyGraph actualMyGraph = new BreathFirstSearch.MyGraph(1);
        assertEquals(1, actualMyGraph.adjacency_list.length);
        assertEquals(1, actualMyGraph.vertices);
    }

    /**
     * Method under test: {@link BreathFirstSearch.MyGraph#MyGraph(int)}
     */
    @Test
    public void testMyGraphConstructor2() {
        assertThrows(NegativeArraySizeException.class, () -> new BreathFirstSearch.MyGraph(-1));
    }

    /**
     * Method under test: {@link BreathFirstSearch.MyGraph#display_list()}
     */
    @Test
    public void testMyGraphDisplay_list() {
        BreathFirstSearch.MyGraph myGraph = new BreathFirstSearch.MyGraph(1);
        myGraph.display_list();
        assertEquals(1, myGraph.adjacency_list.length);
        assertEquals(1, myGraph.vertices);
    }

    /**
     * Method under test: {@link BreathFirstSearch.MyGraph#start_searching(int)}
     */
    @Test
    @Ignore("TODO: Complete this test")
    public void testMyGraphStart_searching() {

        (new BreathFirstSearch.MyGraph(1)).start_searching(1);
    }

    /**
     * Method under test: {@link BreathFirstSearch.MyGraph#start_searching(int)}
     */
    @Test
    public void testMyGraphStart_searching2() {

        (new BreathFirstSearch.MyGraph(1)).start_searching(0);
    }
}

