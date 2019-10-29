package com.ancylabz;

import java.util.List;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.web.bind.annotation.GetMapping;
import org.springframework.web.bind.annotation.RestController;

/**
 * @className:com.ancylabz.BoyFriendController.java
 * Added By <a href="mailto:balramc@****.**">Balram</a> On Oct 25, 2019 11:30:07 AM
 * @description:
 */
@RestController
public class BoyFriendController {

    @Autowired private BoyFriendRepository boyFriendRepository;

    /**
     * <h1> It will print all boyfriends list </h1>
     * Added by Balram Cheryala on Oct 25, 2019 11:30:18 AM
     */
    @GetMapping(path="/boyFriend")
    public List<BoyFriend> getAllBoyFriends() {
        return boyFriendRepository.findAll();
    }
}