package com.design.patterns;

/**
 * 存钱业务
 *
 * @author xudeping
 * @date 2023/2/10
 */
public class Save implements BankBusiness {
    @Override
    public String operate() {
        return "存钱";
    }
}
