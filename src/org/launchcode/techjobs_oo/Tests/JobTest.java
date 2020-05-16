package org.launchcode.techjobs_oo.Tests;

import org.junit.Before;
import org.junit.Test;
import static org.junit.Assert.*;
import static org.junit.Assert.assertEquals;
import org.launchcode.techjobs_oo.*;

public class JobTest {
    Job test_job1;
    Job test_job2;
    Job test_job3;
    Job test_job4;


    @Before
    public void createJobObject() {
        test_job1 = new Job();
        test_job2 = new Job();
        test_job3 = new Job("Product tester", new Employer("ACME"), new Location("Desert"), new PositionType("Quality control"), new CoreCompetency("Persistence"));
        test_job4 = new Job("Product tester", new Employer("ACME"), new Location("Desert"), new PositionType("Quality control"), new CoreCompetency("Persistence"));

    }

    @Test
    public void testSettingJobId() {
        assertNotEquals(test_job1.getId(), test_job2.getId());
        assertTrue(test_job2.getId() - 1 == test_job1.getId());
    }

    @Test
    public void testJobConstructorSetsAllFields() {
        assertEquals(test_job3.getName(), "Product tester");
        assertEquals(test_job3.getEmployer().getValue(), "ACME");
        assertEquals(test_job3.getLocation().getValue(), "Desert");
        assertEquals(test_job3.getPositionType().getValue(),"Quality control");
        assertEquals(test_job3.getCoreCompetency().getValue(), "Persistence");
    }

    @Test
    public  void testJobsForEquality() {
        Job Job1 = new Job("Product tester", new Employer("ACME"), new Location("Desert"), new PositionType("Quality control"), new CoreCompetency("Persistence"));
        Job Job2 = new Job("Product tester", new Employer("ACME"), new Location("Desert"), new PositionType("Quality control"), new CoreCompetency("Persistence"));
        assertFalse(Job1.equals(Job2));
    }

    @Test
    public void testToStringBlankLines() {
        Job testingJob = new Job("Product tester", new Employer("ACME"), new Location("Desert"), new PositionType("Quality control"), new CoreCompetency("Persistence"));
        int lastIndex = (testingJob.toString().length() - 1);

        assertTrue(testingJob.toString().charAt(0) == '\n');
        assertTrue(testingJob.toString().charAt(lastIndex) == '\n');
    }
}
