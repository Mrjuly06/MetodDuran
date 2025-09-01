package models;

public class docente {
    private String name;

    public docente(String name) {
        this.name = name;
    }
    @Override
    public String toString() {
        return name;
    }
    public String getName() {
        return name;
    }
    public void setName(String name) {}
}
