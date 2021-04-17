package com.urunov.service;

import org.springframework.scheduling.quartz.QuartzJobBean;

import java.util.Date;
import java.util.List;
import java.util.Map;


/**
 * User: hamdamboy
 * Project: JobSchdule
 * Github: @urunov
 */
public interface JobService {

    // Schedule one time job.
    boolean scheduleOneTimeJob(String jobName, Class<? extends QuartzJobBean> jobClass, Date date);

    // Schedule cron recurring job.
    boolean scheduleCronJob(String jobName, Class<? extends QuartzJobBean> jobClass, Date date, String cronExpression);

    // Update one time recurring job.
    boolean updateCronJob (String jobName, Date date, String cronExpression);

    //Unscheduled scheduled job.
    boolean unScheduledJob (String jobName);

    // Delete a job
    boolean deleteJob(String jobName);

    // Pause job
    boolean pauseJob(String jobName);

    // resume a job
    boolean resumeJob(String jobName);

    // Starting a job
    boolean startJobNow(String jobName);

    List<Map<String, Object>> getAllJobs();

    // Get if job is already Running.
    boolean isJobWithNamePresent(String jobName);

    // Get the current state of job.
    String getJobState(String jobName);

    // Step a job
    boolean stopJob(String jobName);

}
