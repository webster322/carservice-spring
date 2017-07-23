package pl.basestudio.carservice.services;

import java.util.ArrayList;
import java.util.Collections;
import java.util.Date;
import java.util.List;

import pl.basestudio.carservice.dto.Issue;

public class AppIssuesService implements IssuesService {

	private List<Issue> issues;
	
	
	public AppIssuesService() {
		super();
		issues = new ArrayList<Issue>();
		issues.add(new Issue("Tytu� pierwszego zg�oszenia", "Tre�� pierwszego zg�oszenia", 1, new Date()));
		issues.add(new Issue("Tytu� drugiego zg�oszenia", "Tre�� drugiego zg�oszenia", 2, new Date()));
		issues.add(new Issue("Tytu� trzeciego zg�oszenia", "Tre�� trzeciego zg�oszenia", 3, new Date()));
		issues.add(new Issue("Tytu� czwartego zg�oszenia", "Tre�� czwartego zg�oszenia", 4, new Date()));
	}

	public String getIssue() {
		return "Issue from App";
	}

	public List<Issue> listIssues() {
		return Collections.unmodifiableList(issues);
	}

}
