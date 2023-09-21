package ex07;

import java.io.BufferedReader;
import java.io.BufferedWriter;
import java.io.FileReader;
import java.io.FileWriter;
import java.io.IOException;
import java.util.Arrays;

/**
 * Exercise 07.12 Realize a Java class Apartment, whose objects maintain the following information: an integer that indicates the size in square meters of the apartment, the address, and a list of maximal 10 names of persons that live in the apartment. Each person living in the apartment has an associated number between 0 and the number of persons currently living in the apartment minus 1. The class should export the following functionalities:
 * <p>
 * a constructor that takes a size and an address and creates an apartment that is initially empty;
 * a method that returns the size of the apartment;
 * a method that returns the address of the apartment;
 * a method that returns the number of persons currently living in the apartment;
 * a method that takes as parameter the name of a person, and adds the person to those living in the apartment; the person gets assigned the next available number, if there is still room; if the apartment is full (i.e., 10 persons already live there), the method does nothing;
 * a method that takes as parameter a nonnegative integer number and returns the name of the person associated to that number and living in the apartment; if the number is greater than or equal to the number of persons in the apartment, the method returns null;
 * a method that takes as parameter a nonnegative integer number and removes the person associated to that number from the apartment; the number associated to all following persons should be decreased by one; if the number is greater than or equal to the number of persons in the apartment, the method does nothing.
 * a method toString that does overriding of toString inherited from object, and returns a string with all the information about the apartment.
 */
public class Apartment {
    private int size;
    private String address;
    private String[] residents;

    public Apartment(int size, String address) {
        this.size = (int) Math.pow(size, 2);
        this.address = address;
        this.residents = new String[10];
    }

    /**
     * 아파트 크기 반환
     *
     * @return 아파트 크기
     */
    public int getSize() {
        return size;
    }

    /**
     * 아파트 주소를 반환
     *
     * @return 아파트 주소
     */
    public String getAddress() {
        return address;
    }

    /**
     * 현재 아파트에 살고 있는 사람 수
     *
     * @return 사람 수 반환
     */
    public int getNumberOfResidents() {
        int count = 0;
        for (String resident : residents) {
            if (resident != null) {
                count++;
            }
        }
        return count;
    }

    /**
     * 아파트 사람 추가
     *
     * @param person 사람 이름
     */
    public void addResident(String person) {
        for (int i = 0; i < 10; i++) {
            if (residents[i] == null) {
                residents[i] = person;
                break;
            }
        }
    }

    /**
     * 숫자를 매개변수로 아파트 주민 반환
     *
     * @param number
     * @return
     */
    public String getResident(int number) {
        if (number > 10 || residents[number] == null) {
            return null;
        } else {
            return residents[number];
        }
    }

    /**
     * 아파트 주민 제거
     *
     * @param number 주민 번호
     */
    public void removeResident(int number) {
        if (number <= 10 && residents[number] != null) {
            residents[number] = null;
        }
    }
    /**
     * 아파트 사이즈 주소 주민 정보 toString 메서드
     *
     * @return
     */
    @Override
    public String toString() {
        return "Apartment{" +
                "size=" + size +
                ", address='" + address + '\'' +
                ", residents=" + Arrays.toString(residents) +
                '}';
    }


    /**
     * 아파트 주민 정보 파일 저장 메서드
     *
     * @param filename
     * @throws IOException
     */
    public void saveToFile(String filename) throws IOException {
        try (BufferedWriter writer = new BufferedWriter(new FileWriter(filename))) {
            writer.write("아파트 사이즈 = " + this.getSize() + "\n");
            writer.write("아파트 주소 = " + this.getAddress() + "\n");
            writer.write("아파트 주민 수 = " + this.getNumberOfResidents() + "\n");
            for (String resident : residents) {
                writer.write(resident + "\n");
            }
        }
    }

    /**
     * 아파트 구성 반환 메서드
     *
     * @param reader
     * @return
     * @throws IOException
     */
    public static Apartment readFromFile(BufferedReader reader) throws IOException {
        int size = Integer.parseInt(reader.readLine());
        String address = reader.readLine();
        Apartment apartment = new Apartment(size, address);

        int numberOfResidents = Integer.parseInt(reader.readLine());
        for (int i = 0; i < numberOfResidents; i++) {
            apartment.addResident(reader.readLine());
        }

        return apartment;
    }

    /**
     * 아파트 주민 출력 메서드
     *
     * @param filename
     * @throws IOException
     */
    public static void displayApartmentsFromFile(String filename) throws IOException {
        try (BufferedReader reader = new BufferedReader(new FileReader(filename))) {
            while (reader.ready()) {
                Apartment apartment = Apartment.readFromFile(reader);
                System.out.println(apartment);
            }
        }
    }

    public static void main(String[] args) throws IOException {
        Apartment apt1 = new Apartment(5, "광주");
        System.out.println(apt1.getSize());
        System.out.println(apt1.getAddress());
        apt1.addResident("Jin");
        apt1.addResident("Kim");
        apt1.addResident("Lee");
        System.out.println(apt1);
        apt1.saveToFile("test.txt");
        FileReader f = new FileReader("test.txt");
        BufferedReader in = new BufferedReader(f);
        readFromFile(in);
        //코드 수정 NumberFormatException
    }
}

