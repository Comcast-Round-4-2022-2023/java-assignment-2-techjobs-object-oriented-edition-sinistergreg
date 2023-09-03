package org.launchcode.techjobs.oo.test;

import org.junit.Before;
import org.junit.Test;
import org.junit.runner.RunWith;
import org.junit.runners.JUnit4;
import static org.junit.Assert.*;
import org.launchcode.techjobs.oo.*;

/**
 * Created by LaunchCode
 */
@RunWith(JUnit4.class)
public class JobTest {

    private Job testJob1;
    private Job testJob2;

    @Before
    public void setUp() {
        testJob1 = new Job("Software Engineer", new Employer("LaunchCode"), new Location("St. Louis"), new PositionType("Full Time"), new CoreCompetency("Java"));
    }

    @Before
    public void createJobObjects() {
        testJob1 = new Job(); // Create testJob1 using the constructor
        testJob2 = new Job(); // Create testJob2 using the constructor
    }

    @Test
    public void testToStringStartsAndEndsWithNewLine() {
        // Create a test job with no data (empty fields)
        Job testJob = new Job();

        // Get the string representation of the job
        String jobString = testJob.toString();

        // Verify that the string starts and ends with a new line
        assertTrue(jobString.startsWith("\n"));
        assertTrue(jobString.endsWith("\n"));
    }

    @Test
    public void testSettingJobId() {
        Job job1 = new Job();
        Job job2 = new Job();
        assertNotEquals(job1.getId(), job2.getId());
    }

    // Create a new Job object using the full constructor
    @Test
    public void testJobConstructorSetsAllFields() {
        Job job = new Job("Product tester", new Employer("ACME"), new Location("Desert"), new PositionType("Quality control"), new CoreCompetency("Persistence"));
        // Use assertions to test each field
        assertTrue(job instanceof Job);
        assertEquals("Product tester", job.getName());
        assertEquals("ACME", job.getEmployer().getValue());
        assertEquals("Desert", job.getLocation().getValue());
        assertEquals("Quality control", job.getPositionType().getValue());
        assertEquals("Persistence", job.getCoreCompetency().getValue());
    }

    // Method to test two Job objects considered equal with identical field values except for ID
    @Test
    public void testJobsForEquality() {
        // Create two Job objects with identical field values except for id
        Job job1 = new Job("Product tester", new Employer("ACME"), new Location("Desert"), new PositionType("Quality control"), new CoreCompetency("Persistence"));
        Job job2 = new Job("Product tester", new Employer("ACME"), new Location("Desert"), new PositionType("Quality control"), new CoreCompetency("Persistence"));

        // Test that equals returns false
        assertFalse(job1.equals(job2));
    }

    @Test
    public void testToStringHandlesEmptyField() {
        // Create a job with empty fields
        Job job = new Job("", new Employer(""), new Location(""), new PositionType(""), new CoreCompetency(""));

        // Get the string representation of the job
        String jobString = job.toString();

        // Verify that the string contains "Name: Data not available" for empty fields
        assertTrue(jobString.contains("Name: Data not available"));
        assertTrue(jobString.contains("Employer: Data not available"));
        assertTrue(jobString.contains("Location: Data not available"));
        assertTrue(jobString.contains("Position Type: Data not available"));
        assertTrue(jobString.contains("Core Competency: Data not available"));
    }

    @Test
    public void testToStringContainsCorrectLabelsAndData() {
        // Create a test job with no data (empty fields)
        Job testJob = new Job();

        // Get the string representation of the job
        String jobString = testJob.toString();

        // Verify that the string contains the correct labels for empty fields
        assertTrue(jobString.contains("ID: "));
        assertTrue(jobString.contains("Name: Data not available"));
        assertTrue(jobString.contains("Employer: Data not available"));
        assertTrue(jobString.contains("Location: Data not available"));
        assertTrue(jobString.contains("Position Type: Data not available"));
        assertTrue(jobString.contains("Core Competency: Data not available"));
    }
}