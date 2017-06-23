package com.hiddenite.repository;

import com.hiddenite.model.checkout.CheckoutData;
import org.springframework.data.domain.Page;
import org.springframework.data.domain.Pageable;
import org.springframework.data.repository.CrudRepository;
import org.springframework.stereotype.Repository;

import java.util.List;

@Repository
public interface CheckoutDataRepository extends CrudRepository<CheckoutData, Long> {
  List<CheckoutData> findAll();
  Page<CheckoutData> findAll(Pageable pageable);
}
