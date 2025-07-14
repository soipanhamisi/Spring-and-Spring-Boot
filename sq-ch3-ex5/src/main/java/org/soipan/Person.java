package org.soipan;

public class Person {
    private String name = "martine";
    private Parrot parrot;

    public void setParrot(Parrot parrot) {
        this.parrot = parrot;
    }

    public String getName() {
        return name;
    }

    public Parrot getParrot() {
        return parrot;
    }
}
