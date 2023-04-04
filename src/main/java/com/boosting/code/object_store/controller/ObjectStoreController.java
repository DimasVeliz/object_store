package com.boosting.code.object_store.controller;

import com.boosting.code.object_store.dto.DocumentDto;
import com.boosting.code.object_store.dto.ServiceInfo;
import com.boosting.code.object_store.entity.Document;
import com.boosting.code.object_store.service.IObjectStoreService;
import org.springframework.http.HttpStatus;
import org.springframework.http.ResponseEntity;
import org.springframework.web.bind.annotation.*;

@RestController
@RequestMapping("api/object_store")
public class ObjectStoreController {

    IObjectStoreService objectStoreService;

    public ObjectStoreController(IObjectStoreService objectStoreService) {
        this.objectStoreService = objectStoreService;
    }

    @PostMapping
    public ResponseEntity<ServiceInfo> saveObject(@RequestBody DocumentDto document)
    {
        ServiceInfo info = objectStoreService.save(document);
        return new ResponseEntity<>(info, HttpStatus.OK);
    }

    @GetMapping(value = "/download")
    public ResponseEntity<DocumentDto> getParticularDocument(@RequestParam String documentUUID)
    {
        DocumentDto documentDto = objectStoreService.get(documentUUID);

        if(null==documentDto)
            return new ResponseEntity<>(HttpStatus.NOT_FOUND);
        return new ResponseEntity<>(documentDto, HttpStatus.OK);
    }
}
