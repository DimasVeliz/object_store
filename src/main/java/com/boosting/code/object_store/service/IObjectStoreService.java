package com.boosting.code.object_store.service;

import com.boosting.code.object_store.dto.DocumentDto;
import com.boosting.code.object_store.dto.ServiceInfo;
import com.boosting.code.object_store.entity.Document;

public interface IObjectStoreService {
    ServiceInfo save(DocumentDto document);

    DocumentDto get(String documentUUID);
}
