package com.entity;

import com.baomidou.mybatisplus.annotations.TableId;
import com.baomidou.mybatisplus.annotations.TableName;
import javax.validation.constraints.NotBlank;
import javax.validation.constraints.NotEmpty;
import javax.validation.constraints.NotNull;

import com.fasterxml.jackson.annotation.JsonIgnoreProperties;
import java.lang.reflect.InvocationTargetException;

import java.io.Serializable;
import java.util.Date;
import java.util.List;

import org.springframework.format.annotation.DateTimeFormat;
import com.fasterxml.jackson.annotation.JsonFormat;
import org.apache.commons.beanutils.BeanUtils;
import com.baomidou.mybatisplus.annotations.TableField;
import com.baomidou.mybatisplus.enums.FieldFill;
import com.baomidou.mybatisplus.enums.IdType;

/**
 * 请假
 *
 * @author 
 * @email
 */
@TableName("qingjia")
public class QingjiaEntity<T> implements Serializable {
    private static final long serialVersionUID = 1L;


	public QingjiaEntity() {

	}

	public QingjiaEntity(T t) {
		try {
			BeanUtils.copyProperties(this, t);
		} catch (IllegalAccessException | InvocationTargetException e) {
			// TODO Auto-generated catch block
			e.printStackTrace();
		}
	}


    /**
     * 主键
     */
    @TableId(type = IdType.AUTO)
    @TableField(value = "id")

    private Integer id;


    /**
     * 学生
     */
    @TableField(value = "xuesheng_id")

    private Integer xueshengId;


    /**
     * 请假标题
     */
    @TableField(value = "qingjia_name")

    private String qingjiaName;


    /**
     * 请假类型
     */
    @TableField(value = "qingjia_types")

    private Integer qingjiaTypes;


    /**
     * 请假详情
     */
    @TableField(value = "qingjia_content")

    private String qingjiaContent;


    /**
     * 请假开始日期
     */
    @JsonFormat(locale="zh", timezone="GMT+8", pattern="yyyy-MM-dd")
	@DateTimeFormat
    @TableField(value = "qingjia_kaishi_time")

    private Date qingjiaKaishiTime;


    /**
     * 请假结束日期
     */
    @JsonFormat(locale="zh", timezone="GMT+8", pattern="yyyy-MM-dd")
	@DateTimeFormat
    @TableField(value = "qingjia_jieshu_time")

    private Date qingjiaJieshuTime;


    /**
     * 审核结果
     */
    @TableField(value = "qingjia_yesno_types")

    private Integer qingjiaYesnoTypes;


    /**
     * 审核意见
     */
    @TableField(value = "qingjia_yesno_text")

    private String qingjiaYesnoText;


    /**
     * 请假时间
     */
    @JsonFormat(locale="zh", timezone="GMT+8", pattern="yyyy-MM-dd")
	@DateTimeFormat
    @TableField(value = "insert_time",fill = FieldFill.INSERT)

    private Date insertTime;


    /**
     * 创建时间
     */
    @JsonFormat(locale="zh", timezone="GMT+8", pattern="yyyy-MM-dd HH:mm:ss")
	@DateTimeFormat
    @TableField(value = "create_time",fill = FieldFill.INSERT)

    private Date createTime;


    /**
	 * 设置：主键
	 */
    public Integer getId() {
        return id;
    }


    /**
	 * 获取：主键
	 */

    public void setId(Integer id) {
        this.id = id;
    }
    /**
	 * 设置：学生
	 */
    public Integer getXueshengId() {
        return xueshengId;
    }


    /**
	 * 获取：学生
	 */

    public void setXueshengId(Integer xueshengId) {
        this.xueshengId = xueshengId;
    }
    /**
	 * 设置：请假标题
	 */
    public String getQingjiaName() {
        return qingjiaName;
    }


    /**
	 * 获取：请假标题
	 */

    public void setQingjiaName(String qingjiaName) {
        this.qingjiaName = qingjiaName;
    }
    /**
	 * 设置：请假类型
	 */
    public Integer getQingjiaTypes() {
        return qingjiaTypes;
    }


    /**
	 * 获取：请假类型
	 */

    public void setQingjiaTypes(Integer qingjiaTypes) {
        this.qingjiaTypes = qingjiaTypes;
    }
    /**
	 * 设置：请假详情
	 */
    public String getQingjiaContent() {
        return qingjiaContent;
    }


    /**
	 * 获取：请假详情
	 */

    public void setQingjiaContent(String qingjiaContent) {
        this.qingjiaContent = qingjiaContent;
    }
    /**
	 * 设置：请假开始日期
	 */
    public Date getQingjiaKaishiTime() {
        return qingjiaKaishiTime;
    }


    /**
	 * 获取：请假开始日期
	 */

    public void setQingjiaKaishiTime(Date qingjiaKaishiTime) {
        this.qingjiaKaishiTime = qingjiaKaishiTime;
    }
    /**
	 * 设置：请假结束日期
	 */
    public Date getQingjiaJieshuTime() {
        return qingjiaJieshuTime;
    }


    /**
	 * 获取：请假结束日期
	 */

    public void setQingjiaJieshuTime(Date qingjiaJieshuTime) {
        this.qingjiaJieshuTime = qingjiaJieshuTime;
    }
    /**
	 * 设置：审核结果
	 */
    public Integer getQingjiaYesnoTypes() {
        return qingjiaYesnoTypes;
    }


    /**
	 * 获取：审核结果
	 */

    public void setQingjiaYesnoTypes(Integer qingjiaYesnoTypes) {
        this.qingjiaYesnoTypes = qingjiaYesnoTypes;
    }
    /**
	 * 设置：审核意见
	 */
    public String getQingjiaYesnoText() {
        return qingjiaYesnoText;
    }


    /**
	 * 获取：审核意见
	 */

    public void setQingjiaYesnoText(String qingjiaYesnoText) {
        this.qingjiaYesnoText = qingjiaYesnoText;
    }
    /**
	 * 设置：请假时间
	 */
    public Date getInsertTime() {
        return insertTime;
    }


    /**
	 * 获取：请假时间
	 */

    public void setInsertTime(Date insertTime) {
        this.insertTime = insertTime;
    }
    /**
	 * 设置：创建时间
	 */
    public Date getCreateTime() {
        return createTime;
    }


    /**
	 * 获取：创建时间
	 */

    public void setCreateTime(Date createTime) {
        this.createTime = createTime;
    }

    @Override
    public String toString() {
        return "Qingjia{" +
            "id=" + id +
            ", xueshengId=" + xueshengId +
            ", qingjiaName=" + qingjiaName +
            ", qingjiaTypes=" + qingjiaTypes +
            ", qingjiaContent=" + qingjiaContent +
            ", qingjiaKaishiTime=" + qingjiaKaishiTime +
            ", qingjiaJieshuTime=" + qingjiaJieshuTime +
            ", qingjiaYesnoTypes=" + qingjiaYesnoTypes +
            ", qingjiaYesnoText=" + qingjiaYesnoText +
            ", insertTime=" + insertTime +
            ", createTime=" + createTime +
        "}";
    }
}
