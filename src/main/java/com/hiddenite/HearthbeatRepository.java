package com.hiddenite;

import com.hiddenite.model.Hearthbeat;
import org.springframework.data.repository.CrudRepository;

public interface HearthbeatRepository extends CrudRepository<Hearthbeat, Long> {
}