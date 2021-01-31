package com.officialhord.accountservice;

import com.officialhord.accountservice.resources.Accounts;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.web.bind.annotation.PathVariable;
import org.springframework.web.bind.annotation.RequestMapping;
import org.springframework.web.bind.annotation.RestController;
import org.springframework.web.client.RestTemplate;

import java.util.Arrays;
import java.util.List;
import java.util.stream.Collectors;
import com.officialhord.accountservice.resources.*;

@RestController
@RequestMapping("/accounts")
public class AccountServiceResource {

    @Autowired
    private RestTemplate restTemplate;

    @RequestMapping("/{userId}")
    public List<Accounts> getAccounts(@PathVariable("userId") String userId) {

        //  Account accounts =  restTemplate.getForObject("http://localhost:8081/accountdetails/test", Account.class);

        List<Accountdetails> accountdetails = Arrays.asList(
                new Accountdetails("Basic Savers", 809896122, 100000, 20300)

        );

        return accountdetails.stream().map(account -> {

            UserAccounts accounts = restTemplate.getForObject("http://localhost:8082/useraccounts/" + account.getAccountNumber(), UserAccounts.class);

            return new Accounts(account.getAccountName(), account.getAccountNumber(), account.getAccountBalance(), accounts.getUserName(), accounts.getUserId());

        })
                .collect(Collectors.toList());

//    return Collections.singletonList(
//            new Accounts("Basic Savers", "Level 01")
//    );

    }
}
