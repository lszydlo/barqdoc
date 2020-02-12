package pl.com.bottega.barqdoc.preparation;

import org.springframework.stereotype.Component;

@Component
public class NumberFactory {

    SystemConfig systemConfig;
    SequencePort sequencePort;
    TimePort timePort;
    AuthPort authPort;

    public NumberGenerator create() {
        return new NumberGenerator(sequencePort.next(), timePort.getYearMonth(), authPort.isAuditor(), systemConfig.isDemo(), systemConfig.getSystemType());
    }
}
