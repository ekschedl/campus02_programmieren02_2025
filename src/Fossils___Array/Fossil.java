package Fossils___Array;


public class Fossil {
    private String name;
    private int age;
    private boolean complete;

    public Fossil(String name, int age, boolean complete) {
        this.name = name;
        this.age = age;
        this.complete = complete;
    }

    @Override
    public String toString() {
        return "notGeneric.Fossil{" +
                "name='" + name + '\'' +
                ", age=" + age +
                ", complete=" + complete +
                '}';
    }
}
