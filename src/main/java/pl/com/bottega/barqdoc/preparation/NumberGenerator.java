package pl.com.bottega.barqdoc.preparation;

import java.time.YearMonth;

// Domain Service
public class NumberGenerator {

    private final Integer seq;
    private final YearMonth yearMonth;
    private final boolean isAuditor;
    private final boolean isDemo;
    private final String systemType;

    public NumberGenerator(Integer seq, YearMonth yearMonth, boolean isAuditor, boolean isDemo, String systemType) {
        this.seq = seq;
        this.yearMonth = yearMonth;
        this.isAuditor = isAuditor;
        this.isDemo = isDemo;
        this.systemType = systemType;
    }


    QDocNumber generate() {
        String num = systemType + "/" + seq + "/" + yearMonth.getMonthValue() + "/" + yearMonth.getYear();

        if (isAuditor) {
            num = num + "/AUDIT";
        }

        if (isDemo) {
            num = "DEMO/" + num;
        }

        return new QDocNumber(num);
    }

}
