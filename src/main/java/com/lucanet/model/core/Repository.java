package com.lucanet.model.core;

import java.util.List;

public interface Repository<T> {

  T getById(Long id);

  List<T> getAll();

}