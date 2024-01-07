package college.mybatisapplication.entity;

import com.baomidou.mybatisplus.annotation.TableName;
import lombok.Data;
import lombok.EqualsAndHashCode;

import java.io.Serializable;
import java.math.BigDecimal;
import java.time.LocalDate;
import java.time.LocalDateTime;

/**
 * <p>
 * 日生产工单
 * </p>
 *
 * @author xuxianbei
 * @since 2023-12-23
 */
@Data
@EqualsAndHashCode(callSuper = false)
@TableName("j_umpp_order_daily")
public class JUmppOrderDaily implements Serializable {

    private static final long serialVersionUID = 1L;

    /**
     * 主键
     */
    private Long id;

    /**
     * 日生产工单号
     */
    private String code;

    /**
     * 月订单id
     */
    private Long orderMonthId;

    /**
     * 物料id
     */
    private Long materialId;

    /**
     * bomid
     */
    private Long bomId;

    /**
     * 工艺路线id
     */
    private Long processRouteId;

    /**
     * 工作中心id
     */
    private Long workCenterId;

    /**
     * 计划数量
     */
    private BigDecimal planQuantity;

    /**
     * 计划开始日期
     */
    private LocalDate planStartDate;

    /**
     * 计划结束日期
     */
    private LocalDate planEndDate;

    /**
     * 发布状态（0:未发布；1：已发布）
     */
    private Integer releaseStatus;

    /**
     * 备注
     */
    private String note;

    /**
     * 创建人
     */
    private Long createBy;

    /**
     * 更新人
     */
    private Long updateBy;

    /**
     * 创建时间
     */
    private LocalDateTime createTime;

    /**
     * 修改时间
     */
    private LocalDateTime updateTime;

    /**
     * 删除标识
     */
    private Integer delFlag;

    /**
     * 租户ID
     */
    private Long tenantId;

    /**
     * 订单预计交付天数
     */
    private BigDecimal orderEstimatedDeliveryTime;

    /**
     * 订单预计交付天数
     */
    private BigDecimal saleOrderTime;

    /**
     * 是否查单:0不插单   1插单   必填  默认：不插单
     */
    private Boolean orderInsertStatus;

    /**
     * 非必填 0-原料不足，1-原料充足，  默认1-原料充足
     */
    private Integer materialStatus;

    /**
     * 非必填   0.01-99.99   默认1.33
     */
    private BigDecimal targetCpk;

    /**
     * 目标合格率
     */
    private BigDecimal qualificationRate;

    /**
     * 是否激活（0：否；1：是）
     */
    private Integer activeFlag;

    /**
     * 类型（1：返修日工单；0：生产日工单）
     */
    private Integer type;

    /**
     * 生产状态（0：未开始；1：进行中，2：已暂停；3：已完成）
     */
    private Integer produceStatus;

    /**
     * 暂停原因
     */
    private String pauseReason;


}
