package com.patients;

import org.testng.annotations.Test;

/**
 * @author VISISHTA
 *
 */
public class CreatePatient {

    @Test
    public void firstTestCase() throws Exception {
        Thread.sleep(2000);
        System.out.println("im in first test case from ClassOne Class");
    }

    @Test
    public void secondTestCase() throws Exception{
        Thread.sleep(1000);
        System.out.println("im in second test case from ClassOne Class");
    }
}
