package com.boosting.code.object_store.dto;

public class DocumentDto {

    String uuid;
    String mime;
    byte [] data;

    public DocumentDto(String uuid, String mime, byte[] data) {
        this.uuid = uuid;
        this.mime = mime;
        this.data = data;
    }

    public String getUuid() {
        return uuid;
    }

    public void setUuid(String uuid) {
        this.uuid = uuid;
    }

    public String getMime() {
        return mime;
    }

    public void setMime(String mime) {
        this.mime = mime;
    }

    public byte[] getData() {
        return data;
    }

    public void setData(byte[] data) {
        this.data = data;
    }
}
