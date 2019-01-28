package com.lucanet.model.repositories;

import com.lucanet.model.core.AbstractRepository;
import com.lucanet.model.entities.CostCenter;
import org.springframework.stereotype.Component;

import javax.annotation.PostConstruct;

@Component
@SuppressWarnings("unused") // Spring bean
public class CostCenterRepository extends AbstractRepository<CostCenter> {

  @PostConstruct
  @SuppressWarnings("unused") // invoked by Spring Container
  private void init() {
    put(new CostCenter("1", "Office Berlin"));
    put(new CostCenter("2", "Office Munich"));
    put(new CostCenter("3", "Office MGL"));
  }

}