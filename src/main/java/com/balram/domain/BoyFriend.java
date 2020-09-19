package com.balram.domain;

import javax.persistence.Entity;
import javax.persistence.GeneratedValue;
import javax.persistence.GenerationType;
import javax.persistence.Id;
import javax.persistence.JoinColumn;
import javax.persistence.ManyToOne;

@Entity
public class BoyFriend{
	
    @Id
    @GeneratedValue (strategy = GenerationType.IDENTITY)
    private Long boy_id;

    private String shortName;
    
    @ManyToOne
    @JoinColumn(name="girl_id")
    private GirlFriend girlFriend;

    public Long getId() {
        return boy_id;
    }

	public String getShortName() {
		return shortName;
	}

	public void setShortName(String shortName) {
		this.shortName = shortName;
	}

	public GirlFriend getGirlFriends() {
		return girlFriend;
	}

	public void setGirlFriend(GirlFriend girlFriend) {
		this.girlFriend = girlFriend;
	}
	
	
}
