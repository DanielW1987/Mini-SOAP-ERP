package com.lucanet.model.core;

import java.util.ArrayList;
import java.util.HashMap;
import java.util.List;
import java.util.Map;

public abstract class AbstractRepository<T extends Identifiable> implements Repository<T> {

  private Map<Long, T> repository;

  protected AbstractRepository() {
    repository = new HashMap<>();
  }

  @Override
  public T getById(Long id) {
    return repository.get(id);
  }

  @Override
  public List<T> getAll() {
    return new ArrayList<>(repository.values());
  }

  protected void put(T value) {
    repository.put(value.getId(), value);
  }

}