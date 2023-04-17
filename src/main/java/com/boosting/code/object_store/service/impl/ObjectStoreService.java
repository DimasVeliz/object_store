package com.boosting.code.object_store.service.impl;

import com.boosting.code.object_store.dto.FileInfoDto;
import com.boosting.code.object_store.dto.ServiceInfo;
import com.boosting.code.object_store.entity.FileInfoEntity;
import com.boosting.code.object_store.repository.IObjectStoreRepository;
import com.boosting.code.object_store.service.IObjectStoreService;
import org.springframework.stereotype.Service;

@Service
public class ObjectStoreService implements IObjectStoreService {

    IObjectStoreRepository objectStoreRepository;

    public ObjectStoreService(IObjectStoreRepository objectStoreRepository) {
        this.objectStoreRepository = objectStoreRepository;
    }

    @Override
    public ServiceInfo save(FileInfoDto document) {
        FileInfoEntity toSave = new FileInfoEntity(0,document.getUuid(), document.getMime(), document.getData());
        FileInfoEntity response = objectStoreRepository.save(toSave);
        if(null==response){
            return new ServiceInfo(false,"failed to save document in object store");
        }
        return new ServiceInfo(true,"successfully saved document in object store");

    }

    @Override
    public FileInfoDto get(String documentUUID) {

        FileInfoEntity document = objectStoreRepository.findByUuid(documentUUID);
        if(null==document) return null;
        return new FileInfoDto(document.getUuid(),document.getMime(),document.getData());
    }
}
