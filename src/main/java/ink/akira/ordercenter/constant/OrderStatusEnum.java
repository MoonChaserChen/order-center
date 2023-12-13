package ink.akira.ordercenter.constant;

public enum OrderStatusEnum {
    WAIT_PAY("WAIT_PAY", "待支付"),
    PAID("PAID", "已支付"),
    CLOSED("CLOSED", "订单关闭"),
    REFUND("REFUND", "已退款"),
    PARTIAL_REFUND("PARTIAL_REFUND", "已部分退款"),
    ;
    private final String code;
    private final String desc;

    OrderStatusEnum(String code, String desc) {
        this.code = code;
        this.desc = desc;
    }

    public String getCode() {
        return code;
    }

    public String getDesc() {
        return desc;
    }
}
