package pl.basestudio.carservice.services;

import java.util.List;

import pl.basestudio.carservice.dto.Issue;

public interface IssuesService {
	String getIssue();
	List<Issue> listIssues();
}
