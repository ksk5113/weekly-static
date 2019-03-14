package ksk.report.repository;

import org.springframework.data.jpa.repository.JpaRepository;

import ksk.report.model.Job;

public interface JobRepository extends JpaRepository<Job, String> {

}
