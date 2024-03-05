package store;

// Copyright 2024 by Professor George F. Rice, modifications copyright 2024 by Alan Santoyo-Pina
// This program is free software: you can redistribute it and/or modify it under the terms 
// of the GNU General Public License as published by the Free Software Foundation, either 
// version 3 of the License, or (at your option) any later version.

public class Plant extends Product {
    public Plant(String species, Exposure exposure, int price) {
        super("Plant: " + species, price);
        this.exposure = exposure;
    }
    public Exposure getExposure() {
        return exposure;
    }
    private Exposure exposure;
}
