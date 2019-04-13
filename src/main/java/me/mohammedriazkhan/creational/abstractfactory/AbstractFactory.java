package me.mohammedriazkhan.creational.abstractfactory;

import me.mohammedriazkhan.model.Animal;

public class AbstractFactory {


   public SpeciesFactory getFactory(String type){

       if("mammal".equals(type)){
           return new MammalFactory();
       }
       else if("reptile".equals(type)){
           return new ReptileFactory();
       }

       return null;
   }


}
