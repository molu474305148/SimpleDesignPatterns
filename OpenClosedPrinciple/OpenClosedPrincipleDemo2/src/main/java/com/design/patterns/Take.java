package com.design.patterns;

/**
 * 取钱业务
 *
 * @author xudeping
 * @date 2023/2/10
 */
public class Take implements BankBusiness {
    @Override
    public String operate() {
        return "取钱";
    }
}
