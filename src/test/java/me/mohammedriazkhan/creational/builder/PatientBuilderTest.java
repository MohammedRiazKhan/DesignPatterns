package me.mohammedriazkhan.creational.builder;

import org.junit.Assert;
import org.junit.Test;

import static org.junit.Assert.*;

public class PatientBuilderTest {

    @Test
    public void buildPatient(){

       PatientBuilder patient = new PatientBuilder.Builder()
               .firstName("Riaz")
               .build();

        Assert.assertEquals("Riaz", patient.getFirstName());
    }

}