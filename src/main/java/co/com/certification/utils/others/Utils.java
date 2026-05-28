package co.com.certification.utils.others;

import co.com.certification.exceptions.BaseException;
import com.fasterxml.jackson.databind.ObjectMapper;
import lombok.AccessLevel;
import lombok.NoArgsConstructor;

import java.util.List;
import java.util.Map;

@NoArgsConstructor(access = AccessLevel.PRIVATE)
public class Utils {
    public static String formatTextToJson(List<Map<String, Object>> input) {
        final String FUNCTION = "convertTextToJson";
        final String MESSAGE = "%s AL FORMATEAR EL TEXTO. FUNCION: %s. ";
        final String ERROR_MESSAGE = "ERROR";
        final String EXCEPTION = "EXCEPCION: %S";
        try {
            ObjectMapper mapper = new ObjectMapper();
            return mapper.writerWithDefaultPrettyPrinter().writeValueAsString(input);
        } catch (Exception exception) {
            throw new BaseException(MESSAGE.formatted(ERROR_MESSAGE, FUNCTION).concat(EXCEPTION.formatted(
                    exception.getMessage())));
        }
    }
}
