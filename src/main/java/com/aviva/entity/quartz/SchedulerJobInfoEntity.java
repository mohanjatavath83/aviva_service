package com.aviva.entity.quartz;

import lombok.Getter;
import lombok.NoArgsConstructor;
import lombok.Setter;
import org.hibernate.envers.Audited;

import javax.persistence.Entity;
import javax.persistence.GeneratedValue;
import javax.persistence.GenerationType;
import javax.persistence.Id;
import javax.persistence.Table;

@Entity
@Table(name = "scheduler_job_info")
@Getter
@Setter
@NoArgsConstructor
@Audited
public class SchedulerJobInfoEntity {

  @Id
  @GeneratedValue(strategy = GenerationType.IDENTITY)
  private String jobId;
  private String jobName;
  private String jobGroup;
  private String jobStatus;
  private String jobClass;
  private String cronExpression;
  private String description;
  private String interfaceName;
  private Long repeatTime;
  private Boolean cronJob;
}