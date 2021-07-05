package com.company;

import com.company.creatures.Human;

public interface Selleable {
    void sell(Human seller, Human buyer, Double price) throws Exception;
}
