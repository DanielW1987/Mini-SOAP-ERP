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
    put(new SubLedgerAccount("10000", "Kunde A", "1400", "D"));
    put(new SubLedgerAccount("10001", "Demo 1 GmbH", "1400", "D"));
    put(new SubLedgerAccount("10002", "Demo 2 AG", "1400", "D"));
    put(new SubLedgerAccount("70000", "Lieferant A", "1600", "C"));
    put(new SubLedgerAccount("70001", "Demo 1 GmbH", "1600", "C"));
    put(new SubLedgerAccount("70002", "Demo 2 AG", "1600", "C"));
  }

}