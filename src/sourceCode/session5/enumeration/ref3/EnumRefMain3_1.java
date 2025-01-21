package src.sourceCode.session5.enumeration.ref3;

import src.sourceCode.session5.enumeration.ref2.DiscountService;
import src.sourceCode.session5.enumeration.ref2.Grade;

public class EnumRefMain3_1 {
    public static void main(String[] args) {
        int price = 10000;
        DiscountService discountService = new DiscountService();
        int basic = discountService.discount(src.sourceCode.session5.enumeration.ref2.Grade.BASIC, price);
        int gold = discountService.discount(src.sourceCode.session5.enumeration.ref2.Grade.GOLD, price);
        int diamond = discountService.discount(Grade.DIAMOND, price);
        System.out.println("BASIC 등급의 할인 금액: " + basic);
        System.out.println("GOLD 등급의 할인 금액: " + gold);
        System.out.println("DIAMOND 등급의 할인 금액: " + diamond);
    }

}
