/**
 * 
 */
package com.prescriber;

import org.testng.annotations.Test;

/**
 * @author VISISHTA
 *
 */
public class AddPrescription {

    @Test
    public void firstTestCase() throws Exception {
        Thread.sleep(2000);
        System.out.println("im in first test case from ClassTwo Class");
    }

    @Test
    public void secondTestCase() {
        System.out.println("im in second test case from ClassTwo Class");
    }
	
}
