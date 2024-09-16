package az.atlacademy.productms.exception;

public class ProductNotFoundException extends RuntimeException {
    public ProductNotFoundException(Long id) {
        super("Məhsul tapılmadı: " + id);
    }
}

