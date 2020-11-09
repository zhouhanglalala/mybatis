package jdbc;

import lombok.Data;

import java.time.LocalDateTime;

@Data
public class OrderInfo {
    private Long id;
    private Long user_id;
    private Long sub_clazz_number;
    private Long clazz_number;
    private Long course_number;
    private Integer purchased_minutes;
    private Integer follow_order;
    private Integer order_status;
    private Long order_number;
    private LocalDateTime time_expire;
    private String purchase_info_id;
    private LocalDateTime paid_time;
    private Integer pay_channel;
    private LocalDateTime create_time;
    private Long original_price;
    private Integer spike_price_id;
    private Integer voucher_price;
    private Integer user_voucher_id;
    private Long manual_price;
    private Long price;
    private Long refund_price;
    private LocalDateTime refund_time;
    private Integer order_type;
    private Long parent_order_number;
    private LocalDateTime update_time;
    private Long user_address_id;
    private Long pay_number;
    private Long coupon_price;
    private Long activity_number;
    private Long course_original_price;
    private Long course_price;
    private Integer activity_type;
    private String activity_ext_info;
    private Long activity_price;
}
