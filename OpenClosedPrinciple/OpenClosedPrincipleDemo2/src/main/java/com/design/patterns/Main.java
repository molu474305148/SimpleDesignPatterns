package com.design.patterns;

/**
 * @author xudeping
 * @date ${DATE}
 */
public class Main {
    public static void main(String[] args) {
        BankBusiness b = new Save();
        System.out.println(b.operate());

        System.out.println("************");

        BankBusiness b1 = new CertificatesDeposit();
        System.out.println(b1.operate());

    }
}