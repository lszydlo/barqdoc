package pl.com.bottega.barqdoc.gateway;

import org.springframework.web.bind.annotation.PostMapping;
import pl.com.bottega.barqdoc.preparation.PreparationCommand;
import pl.com.bottega.barqdoc.preparation.PreparationService;

public class QDocDraftController {

    PreparationService service;

    @PostMapping("")
    public String handle(PreparationCommand.DoCreateQDocDraft command) {
        service.handle(command);
        return "";
    }

}
