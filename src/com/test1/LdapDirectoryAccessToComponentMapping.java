package com.test1;

public class LdapDirectoryAccessToComponentMapping {
	private Integer coreUser;
	private Integer ldapDirectoryAccessId;
	private Integer principal;
	private String sessionManager;
	private Integer orgUnitCode;
	private boolean objectClassIndicator;
	private boolean isActive;
	private String cnComponent;
	private String snComponent;
	private String uid;
	private String userPassword;
	private String creationDate;
	private String modifiedDate;
	private String entityState;

	public LdapDirectoryAccessToComponentMapping() {

	}

	public LdapDirectoryAccessToComponentMapping(Integer coreUser, Integer ldapDirectoryAccessId, Integer principal,
			String sessionManager, Integer orgUnitCode, boolean objectClassIndicator, boolean isActive,
			String cnComponent, String snComponent, String uid, String userPassword, String creationDate,
			String modifiedDate, String entityState) {
		super();
		this.coreUser = coreUser;
		this.ldapDirectoryAccessId = ldapDirectoryAccessId;
		this.principal = principal;
		this.sessionManager = sessionManager;
		this.orgUnitCode = orgUnitCode;
		this.objectClassIndicator = objectClassIndicator;
		this.isActive = isActive;
		this.cnComponent = cnComponent;
		this.snComponent = snComponent;
		this.uid = uid;
		this.userPassword = userPassword;
		this.creationDate = creationDate;
		this.modifiedDate = modifiedDate;
		this.entityState = entityState;
	}

	public Integer getCoreUser() {
		return coreUser;
	}

	public void setCoreUser(Integer coreUser) {
		this.coreUser = coreUser;
	}

	public Integer getLdapDirectoryAccessId() {
		return ldapDirectoryAccessId;
	}

	public void setLdapDirectoryAccessId(Integer ldapDirectoryAccessId) {
		this.ldapDirectoryAccessId = ldapDirectoryAccessId;
	}

	public Integer getPrincipal() {
		return principal;
	}

	public void setPrincipal(Integer principal) {
		this.principal = principal;
	}

	public String getSessionManager() {
		return sessionManager;
	}

	public void setSessionManager(String sessionManager) {
		this.sessionManager = sessionManager;
	}

	public Integer getOrgUnitCode() {
		return orgUnitCode;
	}

	public void setOrgUnitCode(Integer orgUnitCode) {
		this.orgUnitCode = orgUnitCode;
	}

	public boolean isObjectClassIndicator() {
		return objectClassIndicator;
	}

	public void setObjectClassIndicator(boolean objectClassIndicator) {
		this.objectClassIndicator = objectClassIndicator;
	}

	public boolean isActive() {
		return isActive;
	}

	public void setActive(boolean isActive) {
		this.isActive = isActive;
	}

	public String getCnComponent() {
		return cnComponent;
	}

	public void setCnComponent(String cnComponent) {
		this.cnComponent = cnComponent;
	}

	public String getSnComponent() {
		return snComponent;
	}

	public void setSnComponent(String snComponent) {
		this.snComponent = snComponent;
	}

	public String getUid() {
		return uid;
	}

	public void setUid(String uid) {
		this.uid = uid;
	}

	public String getUserPassword() {
		return userPassword;
	}

	public void setUserPassword(String userPassword) {
		this.userPassword = userPassword;
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
