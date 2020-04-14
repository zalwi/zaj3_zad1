class TestItems {
    public static void main(String[] args) {
        Glass szklanka = new Glass();
        Glass kieliszek = new Glass();

        szklanka.capacity = 100;
        szklanka.isEmpty = false;
        szklanka.material = "szkło i metal";
        szklanka.name = "Szklanka do herbaty z koszyczkiem";
        szklanka.totalCapacity = 200;

        kieliszek.capacity = 0;
        kieliszek.isEmpty = true;
        kieliszek.material = "szkło";
        kieliszek.name = "Kieliszek do białego wina";
        kieliszek.totalCapacity = 150;

        System.out.println( "Nazwa:\t\t" + szklanka.name +
                            "\nMateriał:\t" + szklanka.material +
                            "\nPojemność:\t" + szklanka.capacity +"/" + szklanka.totalCapacity + "ml" +
                            "\nPusty:\t\t" + szklanka.isEmpty);
        System.out.println( "Nazwa:\t\t" + kieliszek.name +
                            "\nMateriał:\t" + kieliszek.material +
                            "\nPojemność:\t" + kieliszek.capacity +"/" + kieliszek.totalCapacity + "ml" +
                            "\nPusty:\t\t" + kieliszek.isEmpty);
    }
}
