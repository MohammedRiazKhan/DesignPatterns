package me.mohammedriazkhan.creational.abstractfactory;

import me.mohammedriazkhan.model.Animal;
import me.mohammedriazkhan.model.Snake;
import me.mohammedriazkhan.model.Velociraptor;

public class ReptileFactory extends SpeciesFactory {

    @Override
    public Animal getAnimal(String type) {
        if(type.equals("dino")){
            return new Velociraptor();
        }
        else if(type.equals("snek")){
            return new Snake();
        }

        return null;
    }
}
