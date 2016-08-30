package org.csu.coderlee.account.email;

/**
 * Created by lixiang on 16/8/30.
 */
public class AccountEmailException extends Exception {

    private static final long serialVersionUID = -4817386460334501672L;

    public AccountEmailException( String message ) {
        super( message );
    }


    // TODO: 16/8/30 super(message, throwable) 调用父类方法, 使用throwable的这个对象, 需要日后深入学习一下throwable。 
    public AccountEmailException( String message, Throwable throwable ) {
        super( message, throwable );
    }
}
