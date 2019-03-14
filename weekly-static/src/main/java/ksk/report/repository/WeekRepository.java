package ksk.report.repository;

import org.springframework.data.jpa.repository.JpaRepository;

import ksk.report.model.Week;

public interface WeekRepository extends JpaRepository<Week, String> {

}
