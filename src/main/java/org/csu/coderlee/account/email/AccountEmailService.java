package org.csu.coderlee.account.email;

/**
 * Created by lixiang on 16/8/30.
 */
public interface AccountEmailService {

    void sendMail(String to, String subject, String htmlText) throws AccountEmailException;

}
