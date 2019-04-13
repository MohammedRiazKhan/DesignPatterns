package me.mohammedriazkhan.creational.factory;

import me.mohammedriazkhan.model.Animal;
import me.mohammedriazkhan.model.Dog;
import org.junit.Assert;
import org.junit.Test;

import static org.junit.Assert.*;

public class AnimalFactoryTest {

    @Test
    public void getAnimal() {

        AnimalFactory factory = new AnimalFactory();

        Animal lassie = factory.getAnimal("dog");
        Animal mittens = factory.getAnimal("cat");

        Assert.assertEquals(lassie instanceof Animal, mittens instanceof Animal);

    }
}