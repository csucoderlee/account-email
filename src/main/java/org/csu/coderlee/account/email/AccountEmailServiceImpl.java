package org.csu.coderlee.account.email;

import org.springframework.mail.javamail.JavaMailSender;
import org.springframework.mail.javamail.MimeMessageHelper;

import javax.mail.MessagingException;
import javax.mail.internet.MimeMessage;

/**
 * Created by lixiang on 16/8/30.
 */
public class AccountEmailServiceImpl implements AccountEmailService {

    //这两个参数的值通过springframework注入
    private JavaMailSender javaMailSender;

    private String systemEmail;


    /**
     * @Override 注解的作用
     * Indicates that a method declaration is intended to override a
     * method declaration in a supertype. If a method is annotated with
     * this annotation type compilers are required to generate an error
     * message unless at least one of the following conditions hold:
     *
     * <ul><li>
     * The method does override or implement a method declared in a
     * supertype.
     * </li><li>
     * The method has a signature that is override-equivalent to that of
     * any public method declared in {@linkplain Object}.
     * </li></ul>
     *
     * @author  Peter von der Ah&eacute;
     * @author  Joshua Bloch
     * @jls 9.6.1.4 Override
     * @since 1.5
     */

    @Override
    public void sendMail(String to, String subject, String htmlText)
            throws AccountEmailException {
        try {
            MimeMessage msg = javaMailSender.createMimeMessage();
            MimeMessageHelper msgHelper = new MimeMessageHelper(msg);

            msgHelper.setFrom(systemEmail);
            msgHelper.setTo(to);
            msgHelper.setSubject(subject);
            msgHelper.setText(htmlText, true);

            javaMailSender.send(msg);
        } catch (MessagingException e) {
            throw new AccountEmailException("Faild to send mail.", e);
        }
    }

    public JavaMailSender getJavaMailSender() {
        return javaMailSender;
    }

    public void setJavaMailSender(JavaMailSender javaMailSender) {
        this.javaMailSender = javaMailSender;
    }

    public String getSystemEmail() {
        return systemEmail;
    }

    public void setSystemEmail(String systemEmail) {
        this.systemEmail = systemEmail;
    }
}
