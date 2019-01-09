package com.lucanet.model.repositories;

import com.lucanet.model.core.AbstractRepository;
import com.lucanet.model.entities.AccountingArea;
import org.springframework.stereotype.Component;

import javax.annotation.PostConstruct;

@Component
@SuppressWarnings("unused") // Spring bean
public class AccountingAreaRepository extends AbstractRepository<AccountingArea> {

  @PostConstruct
  @SuppressWarnings("unused") // invoked by Spring Container
  private void init() {
    put(new AccountingArea("1000", "Demo 1 GmbH"));
    put(new AccountingArea("2000", "Demo 2 AG"));
  }

}