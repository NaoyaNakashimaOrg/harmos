package com.nn.harmos.domain.util;

import java.math.BigDecimal;
import java.text.DecimalFormat;

import org.apache.commons.lang3.StringUtils;

public class CalcUtils {

    /** 小数点以下０桁のフォーマット */
    public static final DecimalFormat FORM_0 = new DecimalFormat("0");
    /** 小数点以下２桁のフォーマット */
    public static final DecimalFormat FORM_2 = new DecimalFormat("0.00");

    private static final BigDecimal HUNDRED = BigDecimal.valueOf(100);

    public static String add(String a, String b) {
        BigDecimal lhs = StringUtils.isNotEmpty(a) ? new BigDecimal(a) : BigDecimal.ZERO;
        BigDecimal rhs = StringUtils.isNotEmpty(b) ? new BigDecimal(b) : BigDecimal.ZERO;
        return lhs.add(rhs).toString();
    }

    public static String adds(String... values) {
        if (values.length == 0) {
            throw new IllegalArgumentException("引数は1つ以上指定してください。");
        }

        BigDecimal lhs = StringUtils.isNotEmpty(values[0]) ? new BigDecimal(values[0]) : BigDecimal.ZERO;

        for (int i = 1; i < values.length; i++) {
            BigDecimal rhs = StringUtils.isNotEmpty(values[i]) ? new BigDecimal(values[i]) : BigDecimal.ZERO;
            lhs = lhs.add(rhs);
        }

        return lhs.toString();
    }

    public static String subtract(String a, String b) {
        BigDecimal lhs = StringUtils.isNotEmpty(a) ? new BigDecimal(a) : BigDecimal.ZERO;
        BigDecimal rhs = StringUtils.isNotEmpty(b) ? new BigDecimal(b) : BigDecimal.ZERO;
        return lhs.subtract(rhs).toString();
    }

    public static String subtracts(String a, String... bs) {
        BigDecimal lhs = StringUtils.isNotEmpty(a) ? new BigDecimal(a) : BigDecimal.ZERO;
        for (String b : bs) {
            BigDecimal rhs = StringUtils.isNotEmpty(b) ? new BigDecimal(b) : BigDecimal.ZERO;
            lhs = lhs.subtract(rhs);
        }
        return lhs.toString();
    }

    public static String multiply(String a, String b) {
        BigDecimal lhs = StringUtils.isNotEmpty(a) ? new BigDecimal(a) : BigDecimal.ZERO;
        BigDecimal rhs = StringUtils.isNotEmpty(b) ? new BigDecimal(b) : BigDecimal.ZERO;
        return lhs.multiply(rhs).toString();
    }

    public static String multiply(String... values) {

        if (values.length == 0) {
            throw new IllegalArgumentException("引数は1つ以上指定してください。");
        }

        BigDecimal lhs = StringUtils.isNotEmpty(values[0]) ? new BigDecimal(values[0]) : BigDecimal.ZERO;

        for (int i = 1; i < values.length; i++) {
            BigDecimal rhs = StringUtils.isNotEmpty(values[i]) ? new BigDecimal(values[i]) : BigDecimal.ZERO;
            lhs = lhs.multiply(rhs);
        }

        return lhs.toString();
    }

    public static String multiplyPercentAndRound(String a, String b, int scale) {
        BigDecimal lhs = StringUtils.isNotEmpty(a) ? new BigDecimal(a) : BigDecimal.ZERO;
        BigDecimal rhs = StringUtils.isNotEmpty(b) ? new BigDecimal(b) : BigDecimal.ZERO;
        return lhs.multiply(rhs).divide(HUNDRED, scale, BigDecimal.ROUND_HALF_UP).toString();
    }

    public static String divideAndRound(String a, String b, int scale) {
        BigDecimal lhs = StringUtils.isNotEmpty(a) ? new BigDecimal(a) : BigDecimal.ZERO;
        BigDecimal rhs = StringUtils.isNotEmpty(b) ? new BigDecimal(b) : BigDecimal.ZERO;
        return lhs.divide(rhs, scale, BigDecimal.ROUND_HALF_UP).toString();
    }

    public static String round(String a, int scale) {
        BigDecimal lhs = StringUtils.isNotEmpty(a) ? new BigDecimal(a) : BigDecimal.ZERO;
        return lhs.setScale(scale, BigDecimal.ROUND_HALF_UP).toString();
    }

    public static String roundDown(String a, int scale) {
        BigDecimal lhs = StringUtils.isNotEmpty(a) ? new BigDecimal(a) : BigDecimal.ZERO;
        return lhs.setScale(scale, BigDecimal.ROUND_DOWN).toString();
    }

    public static String roundUp(String a, int scale) {
        BigDecimal lhs = StringUtils.isNotEmpty(a) ? new BigDecimal(a) : BigDecimal.ZERO;
        return lhs.setScale(scale, BigDecimal.ROUND_UP).toString();
    }

    public static int compare(String a, String b) {
        return new BigDecimal(a).compareTo(new BigDecimal(b));
    }

    public static String format(String a, DecimalFormat form) {
        String formatted = a;
        if (StringUtils.isNotEmpty(a)) {
            formatted = form.format(new BigDecimal(a));
        }
        return formatted;
    }

    /**
     * 書式化する. {@link #format(String, DecimalFormat)} との違いは,
     * 文字列が数値として不正な文字列であった場合は, 書式化せずにそのまま返す点である.
     * 
     * @param a 書式化する文字列
     * @param form フォーマット
     * @return 書式化後の文字列
     */
    public static String formatIfValid(String a, DecimalFormat form) {
        String formatted = a;
        try {
            formatted = format(a, form);
        } catch (NumberFormatException e) {
        }
        return formatted;
    }

    public static String format0(String a) {
        return format(a, FORM_0);
    }

    public static String format2(String a) {
        return format(a, FORM_2);
    }
}
