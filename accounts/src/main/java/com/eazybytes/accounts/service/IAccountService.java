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

    /**
     *
     * @param customerDTO
     * @return boolean indicating if the update of Account details was successful or not
     */
    boolean updateAccount(CustomerDTO customerDTO);

    /**
     *
     * @param mobileNumber
     * @return boolean indicating if the delete of Account details was successful or not
     */
    boolean deleteAccount(String mobileNumber);
}
