package com.blog.server.blog.entities;

import javax.persistence.Column;
import javax.persistence.Entity;
import javax.persistence.Id;
import javax.persistence.Table;

@Entity
@Table(name = "user")
public class User {

	@Id
	@Column(name = "username")
	private String userName;

	@Column(name = "name")
	private String name;

	@Override
	public String toString() {
		return "User [ name=" + name + ", userName=" + userName + ", password=" + password + "," + ", profilePhoto="
				+ profilePhoto + ", linkedIn=" + linkedIn + ", instagram=" + instagram + ", github=" + github + "]";
	}

	@Column(name = "password")
	private String password;

	@Column(name = "profile_photo")
	private String profilePhoto;

	@Column(name = "linkedIn")
	private String linkedIn;

	@Column(name = "instagram")
	private String instagram;

	@Column(name = "github")
	private String github;

	@Column(name = "enabled")
	private int enabled;

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

	public int getEnabled() {
		return enabled;
	}

	public void setEnabled(int enabled) {
		this.enabled = enabled;
	}

}
