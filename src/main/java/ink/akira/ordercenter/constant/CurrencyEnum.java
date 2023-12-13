package ink.akira.ordercenter.constant;

public enum CurrencyEnum {
    RMB("RMB", "人民币"),
    INTEGRAL("INTEGRAL", "积分"),
    ;
    private final String code;
    private final String desc;

    CurrencyEnum(String code, String desc) {
        this.code = code;
        this.desc = desc;
    }
}
