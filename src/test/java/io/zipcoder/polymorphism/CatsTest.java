package io.zipcoder.polymorphism;

import org.junit.Assert;
import org.junit.Test;

public class CatsTest {

    public class CatTest extends PetTest {
        public CatTest(String name) {
            super(name);
        }

    }
}
