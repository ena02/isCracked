package com.ena.iscracked.repo;

import com.ena.iscracked.model.Requirements;
import org.springframework.data.jpa.repository.JpaRepository;
import org.springframework.stereotype.Repository;

@Repository
public interface RequirementsRepository extends JpaRepository<Requirements, Long> {
}
