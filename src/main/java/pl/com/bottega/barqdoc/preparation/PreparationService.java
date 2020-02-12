package pl.com.bottega.barqdoc.preparation;

import javax.validation.constraints.NotNull;

// ApplicationService
public class PreparationService {


    NumberFactory numberFactory;
    QDocDraftRepo repo;

    public void handle(PreparationCommand.DoCreateQDocDraft command) {
        QDocNumber number = numberFactory.create().generate();

        QDocDraft qDocDraft = new QDocDraft(number, command.title);
        repo.save(qDocDraft);
    }

    public void handle(PreparationCommand.DoUpdateContent command) {

    }

    public void handle(PreparationCommand.DoCreateNewVC command) {

    }

    static class QDocDraft {
        private final QDocNumber number;
        private final String title;

        QDocDraft(QDocNumber number, @NotNull String title) {

            this.number = number;
            this.title = title;
        }
    }
}
