package com.pluralsight.finance;

import java.util.ArrayList;
import java.util.List;

public class Portfolio {
    private String name;
    private String owner;
    private List<Valuable> valuables;

    public Portfolio(String name, String owner) {
        this.name = name;
        this.owner = owner;
        valuables = new ArrayList<>();
    }

    public void add (Valuable valuable){
        this.valuables.add(valuable);
    }

    public double getValue(){
        double netValue = 0;
        for (Valuable valuable : this.valuables)
            netValue += valuable.getValue();
        return netValue;
    }
    public Valuable getMostValuable(){
        if (this.valuables.isEmpty())
            return null;
        Valuable mostValued = this.valuables.get(0);
        for (Valuable currentValuable : this.valuables)
            if (currentValuable.getValue() > mostValued.getValue())
                mostValued = currentValuable;
        return mostValued;
    }

    public Valuable getLeastValuable() {
        if (this.valuables.isEmpty())
            return null;
        Valuable leastValued = this.valuables.get(0);
        for (Valuable currentValuable : this.valuables)
            if (currentValuable.getValue() < leastValued.getValue())
                leastValued = currentValuable;
        return leastValued;


    }

}
