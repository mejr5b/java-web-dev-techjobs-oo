package org.launchcode.techjobs_oo.Tests;

import org.junit.Before;
import org.junit.Test;
import org.launchcode.techjobs_oo.*;

import static junit.framework.TestCase.assertTrue;
import static org.junit.Assert.*;

public class JobTest {

    @Before
    public void createJobObject() {
        Job test_job = new Job("Product tester", new Employer("ACME"), new Location("Desert"), new PositionType("Quality control"), new CoreCompetency("Persistence"));
    }

    @Test
    public void testSettingJobId() {
        Job test_job_Id = new Job();
        Job test_job_Id1 = new Job();
        assertEquals(test_job_Id.getId(), test_job_Id1.getId(), 1);
    }

    @Test
    public void testJobConstructorSetsAllFields() {
        Job test_job1 = new Job("Product tester", new Employer("ACME"), new Location("Desert"), new PositionType("Quality control"), new CoreCompetency("Persistence"));
        assertTrue(test_job1 instanceof Job);
        assertTrue(new Employer("ACME") instanceof Employer);
        assertTrue(new Location("Desert") instanceof Location);
        assertTrue(new PositionType("Quality control") instanceof PositionType);
        assertTrue(new CoreCompetency("persistence") instanceof CoreCompetency);


//        int id = test_job1.getId();
        assertEquals(2, test_job1.getId());
        assertEquals("Product tester", test_job1.getName());
        String employerName = test_job1.getEmployer().getValue();
        assertEquals("ACME", employerName);
        String locationName = test_job1.getLocation().getValue();
        assertEquals("Desert", locationName);
        String positionType = test_job1.getPositionType().getValue();
        assertEquals("Quality control", positionType);
        String coreCompetency = test_job1.getCoreCompetency().getValue();
        assertEquals("Persistence", coreCompetency);


        //will need 10 tests!!!
    }

    @Test
    public void testJobsForEquality() {
        Job test_job3 = new Job("Product tester", new Employer("ACME"), new Location("Desert"), new PositionType("Quality control"), new CoreCompetency("Persistence"));
        Job test_job4 = new Job("Product tester", new Employer("ACME"), new Location("Desert"), new PositionType("Quality control"), new CoreCompetency("Persistence"));

        assertNotEquals(test_job3, test_job4);
        assertFalse(test_job3.equals(test_job4));

    }
    @Test
    public void testToString(){
        Job test_job1 = new Job("Product tester", new Employer("ACME"), new Location("Desert"), new PositionType("Quality control"), new CoreCompetency("Persistence"));
         test_job1.toString().contains("\n");
    }
    @Test
    public void testToStringTwo(){
    Job test_job1 = new Job("Product tester", new Employer("ACME"), new Location("Desert"), new PositionType("Quality control"), new CoreCompetency("Persistence"));
        test_job1.toString().contains("id: " + "\n");
        test_job1.toString().contains("name: " + "Product Tester" + "\n");
        test_job1.toString().contains("employer: " + "ACME" + "\n");
        test_job1.toString().contains("location: " + "Desert" + "\n");
        test_job1.toString().contains("positionType: " + "Quality control" + "\n");
        test_job1.toString().contains("coreCompetency: " + "Persistence" + "\n");
    }
    @Test
    public void testToStringThree(){
        Job test_job1 = new Job("Product tester", new Employer("ACME"), new Location(""), new PositionType("Quality control"), new CoreCompetency("Persistence"));
        test_job1.toString().contains("location: data not available");

    }
}
