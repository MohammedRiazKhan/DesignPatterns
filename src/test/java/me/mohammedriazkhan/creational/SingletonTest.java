package me.mohammedriazkhan.creational;

import me.mohammedriazkhan.creational.singleton.Singleton;
import org.junit.Assert;
import org.junit.Test;

public class SingletonTest {

    @Test
    public void getInstance() {

        Singleton a = Singleton.getInstance();
        Singleton b = Singleton.getInstance();

        Assert.assertEquals(a.hashCode(), b.hashCode());

    }
}