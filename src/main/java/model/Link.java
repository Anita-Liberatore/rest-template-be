package model;

public class Link {

	private String ok;
	private ResultResponse result;
	
	public String getOk() {
		return ok;
	}
	public void setOk(String ok) {
		this.ok = ok;
	}
	public ResultResponse getResult() {
		return result;
	}
	public void setResult(ResultResponse result) {
		this.result = result;
	}
	@Override
	public String toString() {
		return "Link [ok=" + ok + ", result=" + result + "]";
	}
	
	
	
	
}
