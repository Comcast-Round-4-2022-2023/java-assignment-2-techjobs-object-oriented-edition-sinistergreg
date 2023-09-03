package org.launchcode.techjobs.oo;

import org.junit.Test;

import static org.junit.Assert.assertEquals;
import static org.junit.Assert.fail;

/**
 * Created by LaunchCode
 */
public class TestTaskSix extends AbstractTest {

    @Test
    public void testEmployerClassExists() {
        try {
            Class theClass = getClassByName("Employer");
        } catch (ClassNotFoundException e) {
            fail("Class org.launchcode.techjobs.oo.Employer does not exist");
        }
    }

    @Test
    public void testCoreCompetencyClassExists() {
        try {
            Class theClass = getClassByName("CoreCompetency");
        } catch (ClassNotFoundException e) {
            fail("Class org.launchcode.techjobs.oo.CoreCompetency does not exist");
        }
    }

    @Test
    public void testLocationClassExists() {
        try {
            Class theClass = getClassByName("Location");
        } catch (ClassNotFoundException e) {
            fail("Class org.launchcode.techjobs.oo.Location does not exist");
        }
    }

    @Test
    public void testPositionTypeClassExists() {
        try {
            Class theClass = getClassByName("PositionType");
        } catch (ClassNotFoundException e) {
            fail("Class org.launchcode.techjobs.oo.PositionType does not exist");
        }
    }
}