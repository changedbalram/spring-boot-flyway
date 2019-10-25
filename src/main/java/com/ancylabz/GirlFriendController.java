/**
 * 
 */
package com.ancylabz;

import java.util.List;

import org.springframework.web.bind.annotation.GetMapping;
import org.springframework.web.bind.annotation.PathVariable;
import org.springframework.web.bind.annotation.RestController;

/**
 * @className:com.ancylabz.GirlFriendController.java
 * Added By <a href="mailto:balramc@****.**">Balram</a> On Oct 25, 2019 12:26:54 PM
 * @description:
 */

@RestController
public class GirlFriendController {
	
	private GirlFriendRepository repo;
	
	@GetMapping(path = "/{id}/contacts/")
    public List<BoyFriend> getBoyFriends(@PathVariable("id") Long id) {
        return repo.findOne(id).getBoyFriends();
    }

}
