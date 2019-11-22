package org.launchcode.techjobs_oo.Tests;

import org.junit.Before;
import org.junit.Test;
import org.launchcode.techjobs_oo.*;

import static junit.framework.TestCase.assertTrue;
import static org.junit.Assert.assertEquals;
import static org.junit.Assert.assertFalse;

public class JobTest {

    @Before
    public void createJobObject(){
        Job test_job = new Job("Product tester", new Employer("ACME"), new Location("Desert"), new PositionType("Quality control"), new CoreCompetency("Persistence"));
    }

    @Test
public void testSettingJobId(){
    Job test_job_Id = new Job();
    Job test_job_Id1 = new Job();
    assertEquals(test_job_Id.getId(), test_job_Id1.getId(), 1);
    }
    @Test
    public void testJobConstructorSetsAllFields(){
        Job test_job1 = new Job("Product tester", new Employer("ACME"), new Location("Desert"), new PositionType("Quality control"), new CoreCompetency("Persistence"));
        assertTrue(test_job1 instanceof Job);
        assertEquals("Product tester", test_job1.getName());
        String employerName = test_job1.getEmployer().getValue();
        assertEquals("ACME", employerName);
        String locationName = test_job1.getLocation().getValue();
        assertEquals("Desert", locationName);


        //will need 10 tests!!!
    }
}
