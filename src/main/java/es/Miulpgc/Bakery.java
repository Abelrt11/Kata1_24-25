package es.Miulpgc;

public class Bakery {

    private String[] Types_of_bread;
    private int[] Breads_per_type;

    public Bakery(String[] types_of_bread, int[] breads_per_type) {
        Types_of_bread = types_of_bread;
        Breads_per_type = breads_per_type;
    }

    public String[] getTypes_of_bread() {
        return Types_of_bread;
    }

    public void setTypes_of_bread(String[] types_of_bread) {
        Types_of_bread = types_of_bread;
    }

    public int[] getBreads_per_type() {
        return Breads_per_type;
    }

    public void setBreads_per_type(int[] breads_per_type) {
        Breads_per_type = breads_per_type;
    }
}