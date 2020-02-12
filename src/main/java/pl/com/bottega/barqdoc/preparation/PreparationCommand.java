package pl.com.bottega.barqdoc.preparation;

import pl.com.bottega.barqdoc.Command;

import javax.validation.constraints.NotNull;

public class PreparationCommand implements Command {


    public static class DoCreateQDocDraft extends PreparationCommand {
        @NotNull String title;
    }

    public static class DoCreateNewVC extends PreparationCommand {}
    public static class DoUpdateContent extends PreparationCommand {}
}
