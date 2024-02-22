package com.chakra_sutra.trash_2_cash.controller;

import com.chakra_sutra.trash_2_cash.dto.UserDetailDTO;
import com.chakra_sutra.trash_2_cash.service.UserDetailService;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.web.bind.annotation.*;

@RestController
@RequestMapping("chakra_sutra/trash_2_cash")
@CrossOrigin
public class UserDetailController {

    @Autowired
    private UserDetailService userDetailService;

    @PostMapping("/save_user")
    public String saveUserDetails(@RequestBody UserDetailDTO userDetailDTO){
    userDetailService.saveUserDetails(userDetailDTO);
    return "user information saved successfully";
}





}
