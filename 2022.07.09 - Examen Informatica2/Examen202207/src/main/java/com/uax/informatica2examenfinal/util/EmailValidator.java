package com.uax.informatica2examenfinal.util;


import org.json.JSONObject;

public class EmailValidator {
	private int status;
	private String domain;
	private boolean mx;
	private boolean disposable;
	private String did_you_mean;
	private int remaining_requests;
	
	/*
	 * {
	 *   "status": 200,
	 *   "domain": "ieconsulting.es",
	 *   "mx": false,
	 *   "disposable": false,
	 *   "did_you_mean": null,
	 *   "remaining_requests": 117
	 * }
	 * 
	 */
	
	public EmailValidator(String json){
		JSONObject jsonParsed = new JSONObject(json);
	
		setStatus(((Integer) jsonParsed.get("status")).intValue());
		setDomain((String) jsonParsed.get("domain"));
		setMx(((Boolean)  jsonParsed.get("mx")).booleanValue());
		setDisposable(((Boolean) jsonParsed.get("disposable")).booleanValue());
		
		setRemaining_requests(((Integer) jsonParsed.get("remaining_requests")).intValue());
		
	}

	public void setStatus(int status) {
		this.status = status;
	}

	public void setDomain(String domain) {
		this.domain = domain;
	}

	public void setMx(boolean mx) {
		this.mx = mx;
	}

	public void setDisposable(boolean disposable) {
		this.disposable = disposable;
	}

	public void setDid_you_mean(String did_you_mean) {
		this.did_you_mean = did_you_mean;
	}

	public void setRemaining_requests(int remaining_requests) {
		this.remaining_requests = remaining_requests;
	}

	public int getStatus() {
		return status;
	}

	public String getDomain() {
		return domain;
	}

	public boolean isMx() {
		return mx;
	}

	public boolean isDisposable() {
		return disposable;
	}

	public String getDid_you_mean() {
		return did_you_mean;
	}

	public int getRemaining_requests() {
		return remaining_requests;
	}

		
}
