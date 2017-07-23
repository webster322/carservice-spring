package pl.basestudio.carservice.dto;

import javax.validation.constraints.Size;

public class IssueForm {
	
	@Size(min=1, max=50)
	private String title;
	
	@Size(min=20, max=200)
	private String content;
	public String getTitle() {
		return title;
	}
	public void setTitle(String title) {
		this.title = title;
	}
	public String getContent() {
		return content;
	}
	public void setContent(String content) {
		this.content = content;
	}
	
	
}
