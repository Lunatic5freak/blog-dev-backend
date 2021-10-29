package com.blog.server.blog.dtos;

public class UserDTO {

	private Long pkUserId;

	private String name;

	private String userName;

	private String password;

	private String email;

	private String profilePhoto;

	@Override
	public String toString() {
		return "UserDTO [pkUserId=" + pkUserId + ", name=" + name + ", userName=" + userName + ", password=" + password
				+ ", email=" + email + ", profilePhoto=" + profilePhoto + ", linkedIn=" + linkedIn + ", instagram="
				+ instagram + ", github=" + github + "]";
	}

	private String linkedIn;

	private String instagram;

	private String github;

	public Long getPkUserId() {
		return pkUserId;
	}

	public void setPkUserId(Long pkUserId) {
		this.pkUserId = pkUserId;
	}

	public String getName() {
		return name;
	}

	public void setName(String name) {
		this.name = name;
	}

	public String getUserName() {
		return userName;
	}

	public void setUserName(String userName) {
		this.userName = userName;
	}

	public String getPassword() {
		return password;
	}

	public void setPassword(String password) {
		this.password = password;
	}

	public String getEmail() {
		return email;
	}

	public void setEmail(String email) {
		this.email = email;
	}

	public String getProfilePhoto() {
		return profilePhoto;
	}

	public void setProfilePhoto(String profilePhoto) {
		this.profilePhoto = profilePhoto;
	}

	public String getLinkedIn() {
		return linkedIn;
	}

	public void setLinkedIn(String linkedIn) {
		this.linkedIn = linkedIn;
	}

	public String getInstagram() {
		return instagram;
	}

	public void setInstagram(String instagram) {
		this.instagram = instagram;
	}

	public String getGithub() {
		return github;
	}

	public void setGithub(String github) {
		this.github = github;
	}

}
