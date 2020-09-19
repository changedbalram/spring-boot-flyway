/**
 * 
 */
package com.balram.domain;

import java.util.List;

import javax.persistence.Entity;
import javax.persistence.GeneratedValue;
import javax.persistence.GenerationType;
import javax.persistence.Id;
import javax.persistence.OneToMany;

/**
 * @className:com.ancylabz.GirlFriend.java
 * Added By <a href="mailto:balramc@****.**">Balram</a> On Oct 25, 2019 12:19:09 PM
 * @description:
 */
@Entity
public class GirlFriend {
	
	@Id
    @GeneratedValue (strategy = GenerationType.IDENTITY)
    private Long girl_id;
	
	@OneToMany
	private List<BoyFriend> boyFriend;

    private String shortName;
    private String contactName;
    private String contactNumber;

    public Long getId() {
        return girl_id;
    }

	public String getShortName() {
		return shortName;
	}

	public void setShortName(String shortName) {
		this.shortName = shortName;
	}

	public String getContactName() {
		return contactName;
	}

	public void setContactName(String contactName) {
		this.contactName = contactName;
	}

	public String getContactNumber() {
		return contactNumber;
	}

	public void setContactNumber(String contactNumber) {
		this.contactNumber = contactNumber;
	}

	public List<BoyFriend> getBoyFriends() {
		return boyFriend;
	}

	public void setBoyFriend(List<BoyFriend> boyFriend) {
		this.boyFriend = boyFriend;
	}
	
}
