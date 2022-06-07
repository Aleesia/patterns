public class Main {

    public static void main(String[] args) {

        //espresso + 2*sugar
        Beverage espresso_s = new Espresso();
        espresso_s = new Sugar(espresso_s);
        espresso_s = new Sugar(espresso_s);
        System.out.println(espresso_s);

        //DarkRoast + vershky + 2*sugar
        Beverage darkRoast_v_s = new DarkRoast();
        darkRoast_v_s = new Vershky(darkRoast_v_s);
        darkRoast_v_s = new Sugar(darkRoast_v_s);
        darkRoast_v_s = new Sugar(darkRoast_v_s);
        System.out.println(darkRoast_v_s);

        //DarkRoast + crema + sugar
        Beverage darkRoast_c_s = new DarkRoast();
        darkRoast_c_s = new Crema(darkRoast_c_s);
        darkRoast_c_s = new Sugar(darkRoast_c_s);
        System.out.println(darkRoast_c_s);

        //DeCaf + milk + 2*sugar
        Beverage decaf_m_s = new Decaf();
        decaf_m_s = new Milk(decaf_m_s);
        decaf_m_s = new Sugar(decaf_m_s);
        decaf_m_s = new Sugar(decaf_m_s);
        System.out.println(decaf_m_s);
    }
}
