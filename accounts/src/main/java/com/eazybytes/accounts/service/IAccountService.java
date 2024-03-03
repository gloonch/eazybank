package com.eazybytes.accounts.service;

import com.eazybytes.accounts.dto.CustomerDTO;

public interface IAccountService {

    /**
     *
     * @param customerDTO
     */
    void createAccount(CustomerDTO customerDTO);

    /**
     *
     * @param mobileNumber - Input mobile number
     * @return Account Details based on a given mobile number
     */
    CustomerDTO fetchAccount(String mobileNumber);

    boolean updateAccount(CustomerDTO customerDTO);

}
