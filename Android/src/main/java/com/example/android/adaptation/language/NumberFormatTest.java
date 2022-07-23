package com.example.android.adaptation.language;

import java.text.NumberFormat;
import java.util.Locale;

public class NumberFormatTest {
    public static void main(String[] args) {
        // 获取数字格式化实例 获取实例时都可以设置Locale设置特定的国家或地区，或者随系统变化（实际一般随系统变化）
        NumberFormat numberFormat = NumberFormat.getInstance(Locale.getDefault());
        // 设置保留的最大的小数位数
        numberFormat.setMaximumFractionDigits(1);
        System.out.println("数字格式化: " + numberFormat.format(123.456));

        // 获取整数格式化实例
        NumberFormat integerInstance = NumberFormat.getIntegerInstance();
        System.out.println("整数格式化: " + integerInstance.format(123.456));

        // 获取百分数格式化实例
        NumberFormat percentInstance = NumberFormat.getPercentInstance();
        // 设置保留的最小的小数位数
        percentInstance.setMinimumFractionDigits(4);
        System.out.println("百分数格式化: " + percentInstance.format(0.12345));

        // 获取货币格式化实例
        NumberFormat currencyInstance = NumberFormat.getCurrencyInstance(Locale.CHINA);
        currencyInstance.setMinimumFractionDigits(4);
        System.out.println("货币格式化: " + currencyInstance.format(123.456));
    }
}
