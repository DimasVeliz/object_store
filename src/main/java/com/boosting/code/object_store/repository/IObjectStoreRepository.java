package com.boosting.code.object_store.repository;

import com.boosting.code.object_store.entity.FileInfoEntity;
import org.springframework.data.jpa.repository.JpaRepository;

public interface IObjectStoreRepository extends JpaRepository<FileInfoEntity, Integer> {
    FileInfoEntity findByUuid(String uuid);
}
