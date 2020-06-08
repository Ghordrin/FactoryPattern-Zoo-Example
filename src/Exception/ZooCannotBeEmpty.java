package Exception;

public class ZooCannotBeEmpty extends RuntimeException {
    public ZooCannotBeEmpty(String error) {
        super(error);
    }
}
