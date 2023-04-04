package com.boosting.code.object_store.repository;

import com.boosting.code.object_store.entity.Document;
import org.springframework.data.jpa.repository.JpaRepository;

public interface IObjectStoreRepository extends JpaRepository<Document, Integer> {
    Document findByUuid(String uuid);
}
