package me.mohammedriazkhan.creational.singleton;

public class Singleton {

    private static Singleton singleton;

    private Singleton(){

    }

    public synchronized static Singleton getInstance(){

        if(singleton == null) {
            singleton = new Singleton();
        }

        return singleton;
    }

    @Override
    public int hashCode() {
        return super.hashCode();
    }


}
