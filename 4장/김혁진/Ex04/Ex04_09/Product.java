package Ex04_09;

/**
 * Exercise 04.9
 */
public class Product {
    private final String productName;
    private int storedPieces;

    public Product(String name) {
        this.productName = name;
        this.storedPieces = 0;
    }

    public void downLoad(int amount) {
        this.storedPieces += amount;
    }

    /**
     * 감소 메서드
     * 만약 재고가 0 이하로 떨어지면 0을 반환한다.
     * @param amount
     */
    public void upLoad(int amount) {
        this.storedPieces -= amount;
        if(this.storedPieces < 0) {
            this.storedPieces = 0;
        }
    }


    @Override
    public String toString() {
        return productName + ", " + storedPieces + " pieces";
    }
}
