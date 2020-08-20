package auto.exception;

/**
 * 基础异常
 *
 * @author Leon
 * 2017年2月24日 下午4:54:56
 */
public class BaseException extends RuntimeException {
    private static final long serialVersionUID = 1L;

    public BaseException() {
    }

    public BaseException(String msg) {
        super(msg);
    }
}
