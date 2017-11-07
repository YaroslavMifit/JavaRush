package com.javarush.task.task13.task1327;

public class Person implements RepkaItem
{
    private String name;
    private String namePadezh;

    public Person(String name, String namePadezh)
    {
        this.name = name;
        this.namePadezh = namePadezh;
    }
    public String getNamePadezh(){
        return namePadezh;
    }
    public void pull(Person person){
        System.out.println(name + " за " + person.getNamePadezh());
    }
}
