package com.chakra_sutra.trash_2_cash.service.impl;



import com.chakra_sutra.trash_2_cash.dto.UserDetailDTO;
import com.chakra_sutra.trash_2_cash.dto.UserNumberDTO;
import com.chakra_sutra.trash_2_cash.entity.UserDetails;
import com.chakra_sutra.trash_2_cash.repository.UserDetailRepository;
import com.chakra_sutra.trash_2_cash.service.UserDetailService;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Service;

import java.util.Random;

@Service
public class UserDetailServiceIMPL implements UserDetailService {

    private String variableOne;

    public String getVariableOne() {
        return variableOne;
    }

    public void setVariableOne(String variableOne) {
        this.variableOne = variableOne;
    }
    public boolean compareVariables(String variableTwo){
        return variableOne.equals(variableTwo);
//        if (variableOne==variableTwo){
//            return true;
//        }else{
//            return false;
//        }
    }

    @Autowired
    private UserDetailRepository userDetailRepository;

    @Override
    public String saveUserDetails(UserDetailDTO userDetailDTO) {
        UserDetails userDetails = new UserDetails(
                userDetailDTO.getName(),
                userDetailDTO.getEmail(),
                userDetailDTO.getTelephone(),
                userDetailDTO.getImageLink()
        );
        userDetailRepository.save(userDetails);
        return "User Information Saved Successfully";
    }

    @Override
    public String findUserByNumber(int telephone) {
    if (userDetailRepository.existsById(telephone)){
        UserDetails userDetails = userDetailRepository.getReferenceById(telephone);
        Random random = new Random();
        int variableOne = 1000 + random.nextInt(9000);
//        int variableOne = 100_000 + random.nextInt(900_00);
        return String.valueOf(variableOne);
    }else{
        throw new RuntimeException("User not found");
    }

    }




}
