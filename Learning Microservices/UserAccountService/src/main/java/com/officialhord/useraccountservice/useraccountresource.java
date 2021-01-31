package com.officialhord.useraccountservice;

import org.springframework.web.bind.annotation.PathVariable;
import org.springframework.web.bind.annotation.RequestMapping;
import org.springframework.web.bind.annotation.RestController;

@RestController
@RequestMapping("/useraccounts")
public class useraccountresource {

@RequestMapping("/{accountnumber}")
public UserAccounts getAccounts(@PathVariable("accountnumber") Integer accountnumber){

        return new UserAccounts(809896122, "samola1", "Samuel Olamide");
    }
}
