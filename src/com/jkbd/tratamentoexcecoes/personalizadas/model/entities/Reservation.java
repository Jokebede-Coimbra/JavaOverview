package com.jkbd.tratamentoexcecoes.personalizadas.model.entities;

import com.jkbd.tratamentoexcecoes.personalizadas.exceptions.DomainException;

import java.text.SimpleDateFormat;
import java.util.Date;
import java.util.concurrent.TimeUnit;

public class Reservation {
    private Integer rooNumber;
    private Date checkIn;
    private Date checkOut;

    private static SimpleDateFormat sdf = new SimpleDateFormat("dd/MM/yyyy");

    public Reservation() {
    }

    public Reservation(Integer rooNumber, Date checkIn, Date checkOut) {
        if (!checkOut.after(checkIn)) {
            throw new DomainException("Check-out date must be after check-in date");
        }
        this.rooNumber = rooNumber;
        this.checkIn = checkIn;
        this.checkOut = checkOut;
    }

    public Integer getRooNumber() {
        return rooNumber;
    }

    public void setRooNumber(Integer rooNumber) {
        this.rooNumber = rooNumber;
    }

    public Date getCheckIn() {
        return checkIn;
    }

    public void setCheckIn(Date checkIn) {
        this.checkIn = checkIn;
    }

    public Date getCheckOut() {
        return checkOut;
    }

    public void setCheckOut(Date checkOut) {
        this.checkOut = checkOut;
    }

    public long duration() {
        long diff = checkOut.getTime() - checkIn.getTime();
        return TimeUnit.DAYS.convert(diff, TimeUnit.MILLISECONDS);
    }

    public void updateDates(Date checkIn, Date checkOut) {
        Date now = new Date();
        if (checkIn.before(now) || checkOut.before(now)) {
            throw new DomainException("Reservation dates for update must be future dates");
        }
        if (!checkOut.after(checkIn)) {
            throw new DomainException("Check-out date must be after check-in date");
        }
        this.checkIn = checkIn;
        this.checkOut = checkOut;

    }


    @Override
    public String toString() {
        return "Room "
                + rooNumber
                + ", check-in: "
                + sdf.format(checkIn)
                + ", check-out: "
                + sdf.format(checkOut)
                + ",  "
                + duration()
                + " nights";

    }
}
