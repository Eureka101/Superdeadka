package com.projectskz.superdeadka.services;

import com.projectskz.superdeadka.dao.ArrivalDate;
import org.springframework.stereotype.Service;

import java.time.LocalDate;
import java.time.format.DateTimeFormatter;

@Service
public class CounterService {
    private ArrivalDate date;

    public CounterService(ArrivalDate date) {
        this.date = date;
    }

    public String endTime(LocalDate date) {
        LocalDate deadLine = date.plusDays(90);
        DateTimeFormatter formatter = DateTimeFormatter.ofPattern("yyyy-MM-dd");
        return formatter.format(deadLine);
    }
}
