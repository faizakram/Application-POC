package com.example.configurationproperties.service;

import org.springframework.scheduling.annotation.Scheduled;
import org.springframework.stereotype.Component;

import lombok.extern.log4j.Log4j2;
import net.javacrumbs.shedlock.spring.annotation.SchedulerLock;

@Component
@Log4j2
public class RevenueReporter {

  @Scheduled(cron = "0 0 12 * * *")
  @SchedulerLock(name = "revenueReport", lockAtMostFor = "30m")
  public void report() {
    // report revenue based on e.g. orders in database
    log.info("Reporting revenue");
  }

  @Scheduled(cron = "0 * * * * *")
  @SchedulerLock(name = "shortRunningTask", lockAtMostFor = "50s", lockAtLeastFor = "30s")
  public void shortRunningTask() {
    log.info("Start short running task");
  }
}
