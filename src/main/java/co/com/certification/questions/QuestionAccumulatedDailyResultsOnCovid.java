package co.com.certification.questions;

import co.com.certification.exceptions.BaseException;
import co.com.certification.utils.others.Utils;
import lombok.AllArgsConstructor;
import lombok.extern.slf4j.Slf4j;
import net.serenitybdd.core.Serenity;
import net.serenitybdd.screenplay.Actor;
import net.serenitybdd.screenplay.Question;
import org.jetbrains.annotations.Contract;
import org.jetbrains.annotations.NotNull;

import java.util.ArrayList;
import java.util.List;
import java.util.Map;

import static net.serenitybdd.rest.SerenityRest.lastResponse;

@Slf4j
@AllArgsConstructor
public class QuestionAccumulatedDailyResultsOnCovid implements Question<Boolean> {
    @Override
    public Boolean answeredBy(Actor actor) {
        final String MESSAGE = "<<%s SE ENCONTRO LA CLAVE %s. JSON: \n %s>>";
        final String CLAVE = "result.data.allCovidUsDaily.nodes";
        final String MESSAGE_TITLE = "RESULTADOS DIARIOS ACUMULADOS SOBRE EL COVID";
        List<Map<String, Object>> mapList = new ArrayList<>();
        try {
            mapList = lastResponse().jsonPath().getJsonObject(CLAVE);
            String formatTextToJson = Utils.formatTextToJson(mapList);
            Serenity.recordReportData().withTitle(MESSAGE_TITLE).andContents(formatTextToJson);
            log.info(String.format(MESSAGE, "SE", CLAVE, formatTextToJson));
        } catch (Exception exception) {
            throw new BaseException(MESSAGE.formatted("NO SE", CLAVE, mapList.size()).concat(" ")
                    .concat(String.valueOf(exception)));
        }
        return !mapList.isEmpty();
    }

    @Contract(" -> new")
    public static @NotNull QuestionAccumulatedDailyResultsOnCovid checkResponseAccumulatedDailyResultsOnCovid() {
        return new QuestionAccumulatedDailyResultsOnCovid();
    }
}
