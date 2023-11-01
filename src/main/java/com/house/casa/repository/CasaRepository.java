package com.house.casa.repository;

import com.house.casa.entity.Casa;
import org.springframework.data.jpa.repository.JpaRepository;

public interface CasaRepository extends JpaRepository <Casa,Integer> {
}
