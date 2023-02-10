package com.design.patterns;

/**
 * 转账业务
 *
 * @author xudeping
 * @date 2023/2/10
 */
public class Transfer implements BankBusiness {
    /**
     * 转账
     *
     * @return
     */
    @Override
    public String operate() {
        return "转账";
    }
}
