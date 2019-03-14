package ksk.report.model;

import java.util.HashMap;

import javax.persistence.Entity;
import javax.persistence.Id;
import javax.persistence.ManyToOne;

@Entity
public class Job implements Comparable<Job> {

	@Id
	private String name;

	private HashMap<String, String> contents = new HashMap(); // 작성자, 내용

	@ManyToOne
	private Week week;

	@Override
	public int compareTo(Job o) {
		return 0;
	}
}
