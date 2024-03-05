package store;

// Copyright 2024 by Professor George F. Rice, modifications copyright 2024 by Alan Santoyo-Pina
// This program is free software: you can redistribute it and/or modify it under the terms 
// of the GNU General Public License as published by the Free Software Foundation, either 
// version 3 of the License, or (at your option) any later version.


import java.io.BufferedReader;
import java.io.BufferedWriter;
import java.io.IOException;

public class Customer {
    public Customer(String name, String email) {
        int at = email.indexOf("@");
        int dot = email.indexOf(".", at+1);
        if(at < 0 || dot < 0) 
            throw new  IllegalArgumentException("Invalid email address: " + email);
        this.name = name;
        this.email = email;
    }

    public Customer(BufferedReader br) throws IOException {
        this.name = br.readLine();
        this.email = br.readLine();
    }
    public void save(BufferedWriter bw) throws IOException {
        bw.write(name + " (");
        bw.write(email + ")" + '\n');
    }

    @Override
    public String toString() {
        return String.format("%s (%s)", name, email);
    }
    private String name;
    private String email;
}
