package co.com.certification.exceptions;

import lombok.AccessLevel;
import lombok.NoArgsConstructor;

import java.io.Serial;

@NoArgsConstructor(access = AccessLevel.PRIVATE)
public class BaseException extends RuntimeException {
    @Serial
    private static final long serialVersionUID = 1L;

    public BaseException(String message) {
        super(message);
    }
}
