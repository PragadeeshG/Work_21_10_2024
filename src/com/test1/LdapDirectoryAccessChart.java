package com.test1;

public class LdapDirectoryAccessChart {
	private Integer ldapServerUrl;
	private Integer ldapDirectoryAccessId;
	private String ldapDirectoryAccessBudgetIndicator;
	private String ldapDirectoryAccessSheet;
	private String ldapDirectoryAccessControlFlag;
	private String ldapDirectoryAccessDesc;
	private String ldapDirectoryAccessShortDesc;
	private String ldapDirectoryAccessType;
	private String creationDate;
	private String modifiedDate;
	private String entityState;

	public LdapDirectoryAccessChart() {

	}

	public LdapDirectoryAccessChart(Integer ldapServerUrl, Integer ldapDirectoryAccessId,
			String ldapDirectoryAccessBudgetIndicator, String ldapDirectoryAccessSheet,
			String ldapDirectoryAccessControlFlag, String ldapDirectoryAccessDesc, String ldapDirectoryAccessShortDesc,
			String ldapDirectoryAccessType, String creationDate, String modifiedDate, String entityState) {
		super();
		this.ldapServerUrl = ldapServerUrl;
		this.ldapDirectoryAccessId = ldapDirectoryAccessId;
		this.ldapDirectoryAccessBudgetIndicator = ldapDirectoryAccessBudgetIndicator;
		this.ldapDirectoryAccessSheet = ldapDirectoryAccessSheet;
		this.ldapDirectoryAccessControlFlag = ldapDirectoryAccessControlFlag;
		this.ldapDirectoryAccessDesc = ldapDirectoryAccessDesc;
		this.ldapDirectoryAccessShortDesc = ldapDirectoryAccessShortDesc;
		this.ldapDirectoryAccessType = ldapDirectoryAccessType;
		this.creationDate = creationDate;
		this.modifiedDate = modifiedDate;
		this.entityState = entityState;
	}

	public Integer getLdapServerUrl() {
		return ldapServerUrl;
	}

	public void setLdapServerUrl(Integer ldapServerUrl) {
		this.ldapServerUrl = ldapServerUrl;
	}

	public Integer getLdapDirectoryAccessId() {
		return ldapDirectoryAccessId;
	}

	public void setLdapDirectoryAccessId(Integer ldapDirectoryAccessId) {
		this.ldapDirectoryAccessId = ldapDirectoryAccessId;
	}

	public String getLdapDirectoryAccessBudgetIndicator() {
		return ldapDirectoryAccessBudgetIndicator;
	}

	public void setLdapDirectoryAccessBudgetIndicator(String ldapDirectoryAccessBudgetIndicator) {
		this.ldapDirectoryAccessBudgetIndicator = ldapDirectoryAccessBudgetIndicator;
	}

	public String getLdapDirectoryAccessSheet() {
		return ldapDirectoryAccessSheet;
	}

	public void setLdapDirectoryAccessSheet(String ldapDirectoryAccessSheet) {
		this.ldapDirectoryAccessSheet = ldapDirectoryAccessSheet;
	}

	public String getLdapDirectoryAccessControlFlag() {
		return ldapDirectoryAccessControlFlag;
	}

	public void setLdapDirectoryAccessControlFlag(String ldapDirectoryAccessControlFlag) {
		this.ldapDirectoryAccessControlFlag = ldapDirectoryAccessControlFlag;
	}

	public String getLdapDirectoryAccessDesc() {
		return ldapDirectoryAccessDesc;
	}

	public void setLdapDirectoryAccessDesc(String ldapDirectoryAccessDesc) {
		this.ldapDirectoryAccessDesc = ldapDirectoryAccessDesc;
	}

	public String getLdapDirectoryAccessShortDesc() {
		return ldapDirectoryAccessShortDesc;
	}

	public void setLdapDirectoryAccessShortDesc(String ldapDirectoryAccessShortDesc) {
		this.ldapDirectoryAccessShortDesc = ldapDirectoryAccessShortDesc;
	}

	public String getLdapDirectoryAccessType() {
		return ldapDirectoryAccessType;
	}

	public void setLdapDirectoryAccessType(String ldapDirectoryAccessType) {
		this.ldapDirectoryAccessType = ldapDirectoryAccessType;
	}

	public String getCreationDate() {
		return creationDate;
	}

	public void setCreationDate(String creationDate) {
		this.creationDate = creationDate;
	}

	public String getModifiedDate() {
		return modifiedDate;
	}

	public void setModifiedDate(String modifiedDate) {
		this.modifiedDate = modifiedDate;
	}

	public String getEntityState() {
		return entityState;
	}

	public void setEntityState(String entityState) {
		this.entityState = entityState;
	}

}
