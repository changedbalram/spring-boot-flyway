package com.balram.repo;

import org.springframework.data.jpa.repository.JpaRepository;

import com.balram.domain.GirlFriend;

/**
 * @className:com.ancylabz.BoyFriendRepository.java
 * Added By <a href="mailto:balramc@****.**">Balram</a> On Oct 25, 2019 11:37:39 AM
 * @description:
 */
public interface GirlFriendRepository extends JpaRepository<GirlFriend, Long> {
	
}