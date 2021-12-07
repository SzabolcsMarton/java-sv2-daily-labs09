package day01;

import java.time.LocalDateTime;
import java.time.LocalTime;

public class FrontOfStageTicket extends Ticket{

    private String extraCode;

    public FrontOfStageTicket(String nameOfBand, LocalDateTime localDateTime, int price,String extraCode) {
        super(nameOfBand, localDateTime, price);
        this.extraCode = extraCode;
    }

    @Override
    public LocalTime entryTime(){
        return super.entryTime().minusHours(1);
    }

    public String getExtraCode() {
        return extraCode;
    }
}
