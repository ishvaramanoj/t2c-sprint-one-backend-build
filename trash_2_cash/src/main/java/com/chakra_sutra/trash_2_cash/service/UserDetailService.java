package com.chakra_sutra.trash_2_cash.service;


import com.chakra_sutra.trash_2_cash.dto.UserDetailDTO;


public interface UserDetailService {

    public String saveUserDetails(UserDetailDTO userDetailDTO);


    public String findUserByNumber(int telephone);



}
