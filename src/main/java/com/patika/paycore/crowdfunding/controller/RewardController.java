package com.patika.paycore.crowdfunding.controller;

import com.patika.paycore.crowdfunding.model.entity.Reward;
import com.patika.paycore.crowdfunding.service.RewardService;
import lombok.RequiredArgsConstructor;
import org.springframework.web.bind.annotation.*;

import java.util.ArrayList;
import java.util.List;

@RequiredArgsConstructor
@RestController
@RequestMapping("/reward")
public class RewardController {

    /*private List<Reward> rewards = new ArrayList<>();

    {
        rewards.add(new Reward("Book and Custom T-Shirt", "Get a signed paperback copy of the book, plus a custom T-Shirt featuring a book character of your choice!", 50.0, "May 2022"));
        rewards.add(new Reward("Book and Custom Audio Reading", "Get a signed paperback copy of the book, plus a custom audio (MP3 file) reading with your child's name!", 30.0, "May 2022"));
    }
*/

    private final RewardService rewardService;

    @GetMapping(path = "/all")
    public List<Reward> getAllRewards() {
        return rewardService.getAllRewards();
    }

    @PostMapping(path = "/add")
    public boolean addReward(@RequestBody Reward reward) {
        rewardService.createReward(reward);
        return true;
    }


}
