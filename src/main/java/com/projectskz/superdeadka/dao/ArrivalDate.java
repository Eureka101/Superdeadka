package com.projectskz.superdeadka.dao;


import lombok.Data;
import org.springframework.stereotype.Component;

import java.time.LocalDate;

@Component
@Data
public class ArrivalDate {
    private LocalDate date;
}
