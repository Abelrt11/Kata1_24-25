import es.Miulpgc.Bakery;



public class Customer {

    public Customer() {
        Customer customer = new Customer();
    }

    public static void main(String[] args) {
        Bakery bakery = new Bakery(new String[]{"White", "Brown", "Baggete"}, new int[]{1, 5, 0});
        System.out.println(bakery.buy_bread("White"));
        System.out.println(bakery.buy_bread("Brown"));
        System.out.println(bakery.buy_bread("Baggete"));
        System.out.println(bakery.buy_bread("Batman"));
    }
}
