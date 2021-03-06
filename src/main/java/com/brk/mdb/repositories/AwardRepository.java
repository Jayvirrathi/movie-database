package com.brk.mdb.repositories;

import java.util.List;

import org.springframework.data.jpa.repository.JpaRepository;
import org.springframework.stereotype.Repository;

import com.brk.mdb.models.Award;

@Repository
public interface AwardRepository extends JpaRepository<Award, Long> {

	List<Award> findByNameLike(String name);
}
