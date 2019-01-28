package com.lucanet.model.repositories;

import com.lucanet.model.core.AbstractRepository;
import com.lucanet.model.entities.SubLedgerAccount;
import org.springframework.stereotype.Component;

import javax.annotation.PostConstruct;

@Component
@SuppressWarnings("unused") // Spring bean
public class SubLedgerAccountRepository extends AbstractRepository<SubLedgerAccount> {

  @PostConstruct
  @SuppressWarnings("unused") // invoked by Spring Container
  private void init() {
    put(new SubLedgerAccount("10000", "Customer A", "1400", "D"));
    put(new SubLedgerAccount("10001", "Demo 1 ltd.", "1400", "D"));
    put(new SubLedgerAccount("10002", "Demo 2 inc.", "1400", "D"));
    put(new SubLedgerAccount("70000", "Supplier A", "1600", "C"));
    put(new SubLedgerAccount("70001", "Demo 1 ltd.", "1600", "C"));
    put(new SubLedgerAccount("70002", "Demo 2 inc.", "1600", "C"));
  }

}