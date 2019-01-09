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
    put(new Account("1000", "Kasse"));
    put(new Account("1410", "USt 19%"));
    put(new Account("4000", "Löhne und Gehälter"));
    put(new Account("8000", "Umsatz"));
    put(new Account("1400", "Ford L+L"));
    put(new Account("1600", "Verb L+L"));
    put(new Account("1401", "VSt 19%"));
    put(new Account("0400", "Techn. Anlagen"));
    put(new Account("4100", "Abschreibungen"));
    put(new Account("4200", "Miete"));
  }

}