package pl.basestudio.carservice.dto;

public class RecordRange {
	private Integer from;
	private Integer to;
	public Integer getFrom() {
		return from;
	}
	public void setFrom(Integer from) {
		this.from = from;
	}
	public Integer getTo() {
		return to;
	}
	public void setTo(Integer to) {
		this.to = to;
	}
	public RecordRange(Integer from, Integer to) {
		super();
		this.from = from;
		this.to = to;
	}
	
}
