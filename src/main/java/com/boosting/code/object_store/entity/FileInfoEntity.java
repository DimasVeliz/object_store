package com.boosting.code.object_store.entity;

import jakarta.persistence.*;

@Entity
@Table(name="document")
public class FileInfoEntity {


    @Id
    @GeneratedValue(strategy= GenerationType.IDENTITY )
    @Column(name="id")
    private int id;
    @Column
    private String uuid;
    @Column
    private String mime;
    @Column(columnDefinition="MEDIUMBLOB")
    byte [] data;

    public FileInfoEntity(int id, String uuid, String mime, byte[] data) {
        this.id = id;
        this.uuid = uuid;
        this.mime = mime;
        this.data = data;
    }

    public FileInfoEntity() {
    }

    public int getId() {
        return id;
    }

    public void setId(int id) {
        this.id = id;
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
