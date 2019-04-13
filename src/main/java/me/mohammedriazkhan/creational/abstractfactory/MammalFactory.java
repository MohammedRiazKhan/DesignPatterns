package me.mohammedriazkhan.creational.abstractfactory;

import me.mohammedriazkhan.model.Animal;
import me.mohammedriazkhan.model.Cat;
import me.mohammedriazkhan.model.Dog;

public class MammalFactory extends SpeciesFactory{

    @Override
    public Animal getAnimal(String type) {

        if(type.equals("dog")){
            return new Dog();
        }
        else if(type.equals("cat")){
            return new Cat();
        }

        return null;

    }
}
