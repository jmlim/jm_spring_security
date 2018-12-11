package io.jmlim.demosc.component;

import io.jmlim.demosc.account.Account;
import io.jmlim.demosc.account.AccountService;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.boot.ApplicationArguments;
import org.springframework.boot.ApplicationRunner;
import org.springframework.stereotype.Component;

@Component
public class AccountRunner implements ApplicationRunner {

    @Autowired
    private AccountService accountService;

    @Override
    public void run(ApplicationArguments args) throws Exception {
        accountService.createAccount("jmlim","123456");
        //Account account = accountService.createAccount("jmlim","123456");
        //System.out.println(account.getUsername());
    }
}
