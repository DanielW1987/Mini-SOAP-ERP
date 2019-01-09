package com.lucanet.model.repositories;

import com.lucanet.model.core.AbstractRepository;
import com.lucanet.model.entities.OpeningBalance;
import org.springframework.stereotype.Component;

import javax.annotation.PostConstruct;

@Component
@SuppressWarnings("unused") // Spring bean
public class OpeningBalanceRepository extends AbstractRepository<OpeningBalance> {

  @PostConstruct
  @SuppressWarnings("unused") // invoked by Spring Container
  private void init() {
    // Accounting area 1000
    put(new OpeningBalance("1000", 2012, "1000", 1000_00, 2));
    put(new OpeningBalance("1000", 2012, "1410", -1000_00, 2));
    put(new OpeningBalance("1000", 2012, "10000", 500_00, 2));
    put(new OpeningBalance("1000", 2012, "10002", 600_00, 2));
    put(new OpeningBalance("1000", 2012, "70000", -500_00, 2));
    put(new OpeningBalance("1000", 2012, "70002", -600_00, 2));

    // Accounting area 2000
    put(new OpeningBalance("2000", 2012, "1000", 1000_00, 2));
    put(new OpeningBalance("2000", 2012, "1410", -1000_00, 2));
    put(new OpeningBalance("2000", 2012, "10000", 500_00, 2));
    put(new OpeningBalance("2000", 2012, "10001", 600_00, 2));
    put(new OpeningBalance("2000", 2012, "70000", -500_00, 2));
    put(new OpeningBalance("2000", 2012, "70001", -600_00, 2));
  }

}