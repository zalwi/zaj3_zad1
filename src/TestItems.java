class TestItems {
    public static void main(String[] args) {
        Glass szklanka = new Glass("Szklanka do herbaty z koszyczkiem","szkło i metal",100,200,false);
        Glass kieliszek = new Glass("Kieliszek do białego wina", "szkło",0,150,true);

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
