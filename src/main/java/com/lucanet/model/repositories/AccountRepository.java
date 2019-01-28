package com.lucanet.model.repositories;

import com.lucanet.model.core.AbstractRepository;
import com.lucanet.model.entities.Account;
import org.springframework.stereotype.Component;

import javax.annotation.PostConstruct;

@Component
@SuppressWarnings("unused") // Spring bean
public class AccountRepository extends AbstractRepository<Account> {

  @PostConstruct
  @SuppressWarnings("unused") // invoked by Spring Container
  private void init() {
    put(new Account("1000", "Cash"));
    put(new Account("1410", "VAT 19%"));
    put(new Account("4000", "Wages"));
    put(new Account("8000", "Revenue"));
    put(new Account("1400", "Recievables"));
    put(new Account("1600", "Liabilities"));
    put(new Account("1401", "Input Tax 19%"));
    put(new Account("0400", "Tech Assets"));
    put(new Account("4100", "Depreciation"));
    put(new Account("4200", "Rent"));
  }

}