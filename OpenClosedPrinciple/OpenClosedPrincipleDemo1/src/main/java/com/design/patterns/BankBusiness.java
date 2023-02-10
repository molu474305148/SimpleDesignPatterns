package com.design.patterns;

/**
 * 银行业务
 *
 * @author xudeping
 * @date 2023/2/10
 */
public class BankBusiness {

    /**
     * 业务判断
     *
     * @param type
     */
    public static String operate(int type) {
        if (type == 1) {
            return save();
        } else if (type == 2) {
            return take();
        } else if (type == 3) {
            return transfer();
        }
        return null;
    }

    /**
     * 存钱
     */
    public static String save() {
        return ("存钱");
    }

    /**
     * 取钱
     */
    public static String take() {
        return ("取钱");
    }

    /**
     * 转账
     */
    public static String transfer() {
        return ("转账");
    }
}
