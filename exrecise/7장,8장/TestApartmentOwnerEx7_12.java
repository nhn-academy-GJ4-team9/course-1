import org.example.ApartmentOwnerEx7_12;

public class TestApartmentOwnerEx7_12 {

    public static void main (String[] args) {
        ApartmentOwnerEx7_12 p = new ApartmentOwnerEx7_12("Mario Rossi");
        p.setApartment("Via della Camilluccia, 29", 0);
        p.setApartment("Largo di Torre Argentina, 42", 1);
        p.setApartment("P.zza Conca D'Oro, 9", 2);
        p.setApartment("Via del Corso, 30", 5);
        p.setApartment("Via Trionfale, 2500", 8);
        System.out.println(p);

        System.out.println();
        System.out.println(p.getOwner() + " has " +
                p.countApartments() + " apartments");
        System.out.println("Apartment 2: " + p.getApartment(2));

        System.out.println();
        p.reorganizeApartments();
        System.out.println(p);
    }
}
