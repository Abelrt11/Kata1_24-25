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

    private boolean is_this_bread_available(String bread) {
        for (int i = 0; i < Types_of_bread.length; i++) {
            if (bread.equals(Types_of_bread[i]) && Breads_per_type[i] >= 1) {
                return true;
            }
        }
        return false;
    }

    public String buy_bread(String bread) {
        if (is_this_bread_available(bread)) {
            return "Bread bought succesfully";
        }
        return "Bread not bought succesfully due to shortage";
    }
}