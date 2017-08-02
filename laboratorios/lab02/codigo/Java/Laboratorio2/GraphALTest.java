

import static org.junit.Assert.*;
import org.junit.After;
import org.junit.Before;
import org.junit.Test;
import java.util.ArrayList;

/**
 * The test class GraphALTest.
 *
 * @author  (your name)
 * @version (a version number or a date)
 */
public class GraphALTest
{
    /**
     * Default constructor for test class DigraphAMTest
     */
    public GraphALTest()
    {
    }

    /**
     * Sets up the test fixture.
     *
     * Called before every test case method.
     */
    @Before
    public void setUp()
    {
    }

    /**
     * Tears down the test fixture.
     *
     * Called after every test case method.
     */
    @After
    public void tearDown()
    {
    }

    @Test
    public void From0()
    {
     GraphAL gal = new GraphAL(7);
     gal.addArc(0,1,4);
     gal.addArc(0,2,8);
     gal.addArc(1,2,9);
     gal.addArc(1,4,10);
     gal.addArc(1,3,8);
     gal.addArc(2,3,2);
     gal.addArc(2,5,1);
     gal.addArc(3,4,7);
     gal.addArc(3,5,9);
     gal.addArc(4,5,5);
     gal.addArc(4,6,6);
     gal.addArc(5,6,2);
     
     ArrayList<Integer> respuesta = GraphAlgorithms.bfs(gal,0);
     
     assertEquals((int) respuesta.get(0),?);
     assertEquals((int) respuesta.get(1),?);
     assertEquals((int) respuesta.get(2),?);
     assertEquals((int) respuesta.get(3),?);
     assertEquals((int) respuesta.get(4),?);    

    }
}
