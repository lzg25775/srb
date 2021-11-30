package wanho.core.admin.entity;

import java.math.BigDecimal;
import com.baomidou.mybatisplus.annotation.IdType;
import java.util.Date;
import com.baomidou.mybatisplus.annotation.TableId;
import com.baomidou.mybatisplus.annotation.TableLogic;
import com.baomidou.mybatisplus.annotation.TableField;
import java.io.Serializable;
import io.swagger.annotations.ApiModel;
import io.swagger.annotations.ApiModelProperty;
import lombok.Data;
import lombok.EqualsAndHashCode;

/**
 * <p>
 * 标的出借记录表
 * </p>
 *
 * @author mamp
 * @since 2021-11-30
 */
@Data
@EqualsAndHashCode(callSuper = false)
@ApiModel(value="LendItem对象", description="标的出借记录表")
public class LendItem implements Serializable {

    private static final long serialVersionUID = 1L;

    @ApiModelProperty(value = "编号")
    @TableId(value = "id", type = IdType.AUTO)
    private Long id;

    @ApiModelProperty(value = "投资编号")
    private String lendItemNo;

    @ApiModelProperty(value = "标的id")
    private Long lendId;

    @ApiModelProperty(value = "投资用户id")
    private Long investUserId;

    @ApiModelProperty(value = "投资人名称")
    private String investName;

    @ApiModelProperty(value = "投资金额")
    private BigDecimal investAmount;

    @ApiModelProperty(value = "年化利率")
    private BigDecimal lendYearRate;

    @ApiModelProperty(value = "投资时间")
    private Date investTime;

    @ApiModelProperty(value = "开始日期")
    private Date lendStartDate;

    @ApiModelProperty(value = "结束日期")
    private Date lendEndDate;

    @ApiModelProperty(value = "预期收益")
    private BigDecimal expectAmount;

    @ApiModelProperty(value = "实际收益")
    private BigDecimal realAmount;

    @ApiModelProperty(value = "状态（0：默认 1：已支付 2：已还款）")
    private Integer status;

    @ApiModelProperty(value = "创建时间")
    private Date createTime;

    @ApiModelProperty(value = "更新时间")
    private Date updateTime;

    @ApiModelProperty(value = "逻辑删除(1:已删除，0:未删除)")
    @TableField("is_deleted")
    @TableLogic
    private Boolean deleted;


}
