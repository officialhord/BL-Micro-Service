package com.offcialhord.accountdetailsservice;


import org.springframework.web.bind.annotation.PathVariable;
import org.springframework.web.bind.annotation.RequestMapping;
import org.springframework.web.bind.annotation.RestController;

@RestController
@RequestMapping("/accountdetails")
public class accountdetailsresource {

    @RequestMapping("/{accountId}")
    public Account getAccountInfo(@PathVariable("accountId") String accountId){
return new Account("Basic Savers",809896122, 100000, 20300);

    }
}
