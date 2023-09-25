package com.sonali.repo;

import org.springframework.data.jpa.repository.JpaRepository;
import org.springframework.stereotype.Repository;

import com.sonali.model.Mobile;
@Repository
public interface MobileRepo extends JpaRepository<Mobile,Long> {

}
