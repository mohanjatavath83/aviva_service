package com.aviva.repositories.quartz;

import com.aviva.entity.quartz.SchedulerJobInfoEntity;
import org.springframework.data.jpa.repository.JpaRepository;
import org.springframework.stereotype.Repository;

@Repository
public interface SchedulerRepository extends JpaRepository<SchedulerJobInfoEntity, Long> {
  SchedulerJobInfoEntity findByJobName(String jobName);
}