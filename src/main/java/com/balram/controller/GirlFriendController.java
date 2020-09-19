/**
 * 
 */
package com.balram.controller;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.web.bind.annotation.RestController;

import com.balram.repo.GirlFriendRepository;

/**
 * @className:com.ancylabz.GirlFriendController.java
 * Added By <a href="mailto:balramc@****.**">Balram</a> On Oct 25, 2019 12:26:54 PM
 * @description:
 */

@RestController
public class GirlFriendController {
	
	@Autowired private GirlFriendRepository repo;
	

}
