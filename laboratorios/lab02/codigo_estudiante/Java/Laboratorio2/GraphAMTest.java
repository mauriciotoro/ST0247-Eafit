

import static org.junit.Assert.*;
import org.junit.After;
import org.junit.Before;
import org.junit.Test;
import java.util.ArrayList;


/**
 * The test class DigraphAMTest.
 *
 * @author  (your name)
 * @version (a version number or a date)
 */
public class GraphAMTest
{
    /**
     * Default constructor for test class DigraphAMTest
     */
    public GraphAMTest()
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
     GraphAM gam = new GraphAM(7);
     gam.addArc(0,1,4);
     gam.addArc(0,2,8);
     gam.addArc(1,2,9);
     gam.addArc(1,4,10);
     gam.addArc(1,3,8);
     gam.addArc(2,3,2);
     gam.addArc(2,5,1);
     gam.addArc(3,4,7);
     gam.addArc(3,5,9);
     gam.addArc(4,5,5);
     gam.addArc(4,6,6);
     gam.addArc(5,6,2);
     
     ArrayList<Integer> respuesta = GraphAlgorithms.bfs(gam,0);
     
     assertEquals((int) respuesta.get(0),?);
     assertEquals((int) respuesta.get(1),?);
     assertEquals((int) respuesta.get(2),?);
     assertEquals((int) respuesta.get(3),?);
     assertEquals((int) respuesta.get(4),?);     

    }
}

