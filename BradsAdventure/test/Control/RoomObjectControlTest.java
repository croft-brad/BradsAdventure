/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package Control;

import org.junit.After;
import org.junit.AfterClass;
import org.junit.Before;
import org.junit.BeforeClass;
import org.junit.Test;
import static org.junit.Assert.*;

/**
 *
 * @author Brad Croft me@bradcroft.com
 */
public class RoomObjectControlTest {
    
    public RoomObjectControlTest() {
    }
    
    @BeforeClass
    public static void setUpClass() {
    }
    
    @AfterClass
    public static void tearDownClass() {
    }
    
    @Before
    public void setUp() {
    }
    
    @After
    public void tearDown() {
    }

    /**
     * Test of checkPuzzleAnswer method, of class RoomObjectControl.
     */
    @Test
    public void testCheckPuzzleAnswer() {
        System.out.println("checkPuzzleAnswer");
        int radius = 0;
        int height = 0;
        int volumeLow = 0;
        int volumeHigh = 0;
        RoomObjectControl instance = new RoomObjectControl();
        int expResult = 0;
        int result = instance.checkPuzzleAnswer(radius, height, volumeLow, volumeHigh);
        assertEquals(expResult, result);
        // TODO review the generated test code and remove the default call to fail.
        fail("The test case is a prototype.");
    }

    /**
     * Test of checkLockCover method, of class RoomObjectControl.
     */
    @Test
    public void testCheckLockCover() {
        System.out.println("checkLockCover");
        int radius = 0;
        int height = 0;
        int volumeLow = 0;
        int volumeHigh = 0;
        RoomObjectControl instance = new RoomObjectControl();
        int expResult = 0;
        int result = instance.checkLockCover(radius, height, volumeLow, volumeHigh);
        assertEquals(expResult, result);
        // TODO review the generated test code and remove the default call to fail.
        fail("The test case is a prototype.");
    }

    /**
     * Test of unravelClueCheck method, of class RoomObjectControl.
     */
    @Test
    public void testUnravelClueCheck() {
        System.out.println("unravelClueCheck");
        int areaBase = 0;
        int areaHeight = 0;
        int areaLow = 0;
        int areaHigh = 0;
        RoomObjectControl instance = new RoomObjectControl();
        int expResult = 0;
        int result = instance.unravelClueCheck(areaBase, areaHeight, areaLow, areaHigh);
        assertEquals(expResult, result);
        // TODO review the generated test code and remove the default call to fail.
        fail("The test case is a prototype.");
    }
    
}
