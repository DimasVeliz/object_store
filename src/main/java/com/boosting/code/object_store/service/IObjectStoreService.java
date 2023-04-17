package com.boosting.code.object_store.service;

import com.boosting.code.object_store.dto.FileInfoDto;
import com.boosting.code.object_store.dto.ServiceInfo;

public interface IObjectStoreService {
    ServiceInfo save(FileInfoDto document);

    FileInfoDto get(String documentUUID);
}
