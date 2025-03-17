package com.juaracoding.repo;

import com.juaracoding.model.Akses;
import com.juaracoding.model.Menu;
import org.springframework.data.domain.Page;
import org.springframework.data.domain.Pageable;
import org.springframework.data.jpa.repository.JpaRepository;

import java.util.List;

public interface AksesRepo extends JpaRepository<Akses, Long> {

    public Page<Akses> findByNamaContainsIgnoreCase(String nama, Pageable pageable);
    public List<Akses> findByNamaContainsIgnoreCase(String nama);

    public Page<Akses> findByDeskripsiContainsIgnoreCase(String nama, Pageable pageable);
    public List<Akses> findByDeskripsiContainsIgnoreCase(String nama);
}
