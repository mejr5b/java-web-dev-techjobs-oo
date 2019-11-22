package org.launchcode.techjobs_oo.Tests;

import org.junit.Before;
import org.junit.Test;
import org.launchcode.techjobs_oo.*;

import static org.junit.Assert.assertEquals;
import static org.junit.Assert.assertFalse;

public class JobTest {

    @Before
    public void createJobObject(){
        Job test_job1 = new Job("Product tester", new Employer("ACME"), new Location("Desert"), new PositionType("Quality control"), new CoreCompetency("Persistence"));
        Job test_job2 = new Job("Product tester", new Employer("ACME"), new Location("Desert"), new PositionType("Quality control"), new CoreCompetency("Persistence"));

    }

    @Test
public void testSettingJobId(){
    Job test_job_Id = new Job();
    Job test_job_Id1 = new Job();
    assertEquals(test_job_Id.getId(), test_job_Id1.getId(), 1);
    }
}
