package ink.akira.ordercenter.entity;

import ink.akira.ordercenter.constant.OrderStatusEnum;

import java.time.LocalDateTime;

public class Order {
    // order_id, user_id, create_time, update_time, expire_time, order_status
    private Long orderId;
    private Long userId;
    private LocalDateTime createTime;
    private LocalDateTime updateTime;
    private LocalDateTime expireTime;
    private OrderStatusEnum orderStatus;
    private Long orderPrice;
    private Long orderOriginalPrice;
    private String orderPriceCurrency;
}
