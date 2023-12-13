# 基于DDD构建订单中心
基于DDD构建订单中心

## OrderStatusEnum状态机
```plantuml
hide empty description
[*] --> WAIT_PAY :创建订单
WAIT_PAY -> PAID :支付
WAIT_PAY --> CLOSED :超时关闭&主动关闭
PAID --> PARTIAL_REFUND :部分退款
PAID --> REFUND :退款
PARTIAL_REFUND --> REFUND :退款
```
> 也可以考虑加入“退款中”状态： PARTIAL_REFUNDING、REFUNDING，“发货”相关状态。