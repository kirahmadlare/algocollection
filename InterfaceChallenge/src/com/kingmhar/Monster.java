package com.kingmhar;

import java.util.ArrayList;
import java.util.List;

/**
 * Created by Kingmhar on 7/24/16.
 */
public class Monster implements ISaveable {
    private String name;
    private int hitPoings;
    private int strenght;

    public Monster(String name, int hitPoings, int strenght) {
        this.name = name;
        this.hitPoings = hitPoings;
        this.strenght = strenght;
    }

    public String getName() {
        return name;
    }

    public int getHitPoings() {
        return hitPoings;
    }

    public int getStrenght() {
        return strenght;
    }

    @Override
    public String toString() {
        return "Monster{" +
                "strenght=" + strenght +
                ", hitPoings=" + hitPoings +
                ", name='" + name + '\'' +
                '}';
    }

    @Override
    public List<String> write() {

        ArrayList<String> values = new ArrayList<String>();
        values.add(0, this.name);
        values.add(1, "" + this.hitPoings);
        values.add(2, "" + this.strenght);
        return values;
    }


    @Override
    public void read(List<String> savedValues) {
    if(savedValues != null && savedValues.size() > 0)
    {
        this.name = savedValues.get(0);
        this.hitPoings = Integer.parseInt(savedValues.get(1));
        this.strenght = Integer.parseInt(savedValues.get(2));
    }
    }
}
