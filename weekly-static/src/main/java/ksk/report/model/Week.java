package ksk.report.model;

import java.time.LocalDate;
import java.util.List;

import javax.persistence.CascadeType;
import javax.persistence.Entity;
import javax.persistence.Id;
import javax.persistence.OneToMany;

@Entity
public class Week implements Comparable<Week> {
	
	@Id
	private String weekNumber;
	
	private LocalDate friday;
	
	@OneToMany(mappedBy = "week", cascade = CascadeType.ALL, orphanRemoval = true)
	private List<Job> jobs;
	
	@Override
	public int compareTo(Week o) {
		return 0;
	}
}
