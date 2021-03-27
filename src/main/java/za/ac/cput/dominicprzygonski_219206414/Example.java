package za.ac.cput.dominicprzygonski_219206414;

/**
 *
 * @author Dominic Przygonski - 219206414
 */
public class Example {
    
    private String name;
    private int value1, value2;
    
    public int LessThanTen (int first, int second){
        return first + second;
    }

    public String getName() {
        return name;
    }

    public void setName(String name) {
        this.name = name;
    }

    public int getValue1() {
        return value1;
    }

    public void setValue1(int value1) {
        this.value1 = value1;
    }

    public int getValue2() {
        return value2;
    }

    public void setValue2(int value2) {
        this.value2 = value2;
    }
    
    @Override
    public String toString() {
        return "AssingmentClass{" + "name=" + name + ", value1=" + value1 + ", value2=" + value2 + '}';
    }
    
}
