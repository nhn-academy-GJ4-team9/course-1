/*
https://www.inf.unibz.it/~calvanese/teaching/04-05-ip/lecture-notes/uni08/node23.html
Ex08.8
 */
package unit8;

import java.io.*;
import org.junit.jupiter.api.Assertions;

public class Apartment {
    private int size;
    private String adress;
    private String[] names;

    private static  final  int MAX_NAME = 10;
    public String[] getNames() {
        return names;
    }

    /**
     * @return MAX_NAME selector 집에 들어 갈 수 있는 최대 인원 수
     */
    public int getMaxName(){
        return MAX_NAME;
    }

    /**
     *
     * @param size 집의 평수
     * @param address 집의 주소
     */
    public Apartment(int size, String address) {
        this.size = size;
        this.adress = address;
        this.names = new String[getMaxName()];

    }

    /**
     * @return size selector
     */
    public int getSize() {
        return this.size;
    }

    /**
     *
     * @return selector 집의 주소 반환
     */
    public String getAdress() {
        return this.adress;
    }


    /**
     * @return count names 배열의 null이 아닌 값들 더해서 반환
     */
    public int countNames() {
        int count = 0;
        for (int i = 0; i < getMaxName(); i++) {
            if (names[i] != null) {
                count++;
            }
        }
        return count;
    }

    /**
     * @param name names 배열에 들어갈 name을 받아서 null이 아닐시 i번째 배열칸에 저장
     */
    public void registName(String name) {
        for (int i = 0; i < getMaxName(); i++) {
            if (names[i] == null) {
                names[i] = name;
                break;
            }
        }

    }

    /**
     * @param number names 배열칸의 번호
     * @return number 칸의 배열이 생성자의 값에 유효하다면 true 아닐시 false
     */
    public boolean isValid(int number){
        if (number <0 || number > names.length){
            return true;
        } else {
            return false;
        }
    }

    /**
     * @param number names 배열칸의 번호
     * @return isValid이거나 number의 배열칸이 비어 있다면 아무것도 null 반환
     *          아니라면 names[number] 의 값을 name에 저장해서 반환
     */
    public String whoIs(int number) {
        String name = "";
        if (isValid(number) || names[number] == null) {
            return null;
        } else {
            name += names[number];
        }
        return name;
    }

    /**
     * @param number names[number] 배열이 null아 아니고 isvalid하다면 names[number] 안의 값을 지움
     */
    public void removeName(int number) {
        if (isValid(number)) {
            return;
        }
        if (names[number] != null)
            names[number] = null;
    }

    /**
     * @return Apparment 객체에 생성된 size,address와 등록된 name들을 반환
     */
    @Override
    public String toString() {
        String ris = "";
        ris += "Apartment:" + adress + "size: " + size;
        for (int i = 0; i < 10; i++) {
            if (names[i] != null) {
                ris += "\nnames " + i + ": " + names[i];
            }
        }
        return ris;

    }

    /**
     * @param filename 저장할 filename 설정
     * @param apartment appartment 객체를 받아서 filename으로 저장
     * @throws IOException
     */
    public static void saveToFile(String filename, Apartment apartment) throws IOException {
        FileWriter f = new FileWriter(filename);

        PrintWriter out = new PrintWriter(f);

        out.write(apartment.getAdress() + " " + apartment.getSize());
        for (int i = 0; i < apartment.countNames(); i++) {

            out.write(" " + apartment.whoIs(i));
        }
        out.close();
        f.close();

    }

    /**
     * @param br BufferedReader를 통해 값을 읽어 들임
     * @return 읽어온 값들을 한줄씩 읽어 와서 새로운 apartment a 객체에 저장해서 반환
     * @throws IOException
     */
    public static Apartment readFromFile(BufferedReader br) throws IOException {
        String line = br.readLine();
        if(line ==null){
            return  null;
        }
        String split[]  =line.split(" ");
        Apartment a = new Apartment(Integer.parseInt(split[1]),split[0]);
        for( int i = 2; i<split.length;i++){
            a.registName(split[i]);
        }
        return a;
    }

    /**
     * @param filename 읽어올 filename을 BufferedReader를 통해 읽고 apartment를 출력
     * @throws IOException
     */
    public static void client(String filename) throws IOException {
        BufferedReader br = new BufferedReader(new FileReader(filename));
        Apartment apartment;
        while( (apartment =readFromFile(br)) != null){
            System.out.println(apartment);
        }
        br.close();

    }

    public static void main(String[] args) throws IOException {
        Apartment apartment = new Apartment(10, "chosundae");
        apartment.registName("철수");
        apartment.registName("영희");
        apartment.registName("민수");
        saveToFile("apartment.txt", apartment);
        client("apartment.txt");
        Assertions.assertEquals(10,apartment.getSize());
        Assertions.assertEquals("chosundae",apartment.getAdress());
        Assertions.assertEquals("철수",apartment.whoIs(0));
        Assertions.assertEquals("영희",apartment.whoIs(1));
        Assertions.assertEquals("민수",apartment.whoIs(2));
    }

}
