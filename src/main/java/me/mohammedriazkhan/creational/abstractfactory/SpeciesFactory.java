package me.mohammedriazkhan.creational.abstractfactory;

import me.mohammedriazkhan.model.Animal;

public abstract class SpeciesFactory {

    public abstract Animal getAnimal(String type);

}
