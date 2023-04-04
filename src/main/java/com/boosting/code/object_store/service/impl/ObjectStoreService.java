package com.boosting.code.object_store.service.impl;

import com.boosting.code.object_store.dto.DocumentDto;
import com.boosting.code.object_store.dto.ServiceInfo;
import com.boosting.code.object_store.entity.Document;
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
    public ServiceInfo save(DocumentDto document) {
        Document toSave = new Document(0,document.getUuid(), document.getMime(), document.getData());
        Document response = objectStoreRepository.save(toSave);
        if(null==response){
            return new ServiceInfo(false,"failed to save document in object store");
        }
        return new ServiceInfo(true,"successfully saved document in object store");

    }

    @Override
    public DocumentDto get(String documentUUID) {

        Document document = objectStoreRepository.findByUuid(documentUUID);
        if(null==document) return null;
        return new DocumentDto(document.getUuid(),document.getMime(),document.getData());
    }
}
