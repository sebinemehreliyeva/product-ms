package az.atlacademy.productms.exception;

public class ProductNotFoundException extends RuntimeException {
    public ProductNotFoundException (String message) {
        super(message);
    }
}

