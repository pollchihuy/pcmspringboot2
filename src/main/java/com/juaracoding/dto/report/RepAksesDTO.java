package com.juaracoding.dto.report;


import com.juaracoding.dto.rel.RelMenuDTO;

import java.util.List;

public class RepAksesDTO {

    private Long id;

    private String nama;

    private String deskripsi;

    public Long getId() {
        return id;
    }

    public void setId(Long id) {
        this.id = id;
    }

    public String getNama() {
        return nama;
    }

    public void setNama(String nama) {
        this.nama = nama;
    }

    public String getDeskripsi() {
        return deskripsi;
    }

    public void setDeskripsi(String deskripsi) {
        this.deskripsi = deskripsi;
    }

}
