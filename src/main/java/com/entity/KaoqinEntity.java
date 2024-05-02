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
 * 考勤
 *
 * @author 
 * @email
 */
@TableName("kaoqin")
public class KaoqinEntity<T> implements Serializable {
    private static final long serialVersionUID = 1L;


	public KaoqinEntity() {

	}

	public KaoqinEntity(T t) {
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
     * 考勤类型
     */
    @TableField(value = "kaoqin_types")

    private Integer kaoqinTypes;


    /**
     * 备注
     */
    @TableField(value = "kaoqin_content")

    private String kaoqinContent;


    /**
     * 考勤日期
     */
    @JsonFormat(locale="zh", timezone="GMT+8", pattern="yyyy-MM-dd")
	@DateTimeFormat
    @TableField(value = "kaoqin_time")

    private Date kaoqinTime;


    /**
     * 添加时间
     */
    @JsonFormat(locale="zh", timezone="GMT+8", pattern="yyyy-MM-dd HH:mm:ss")
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
	 * 设置：考勤类型
	 */
    public Integer getKaoqinTypes() {
        return kaoqinTypes;
    }


    /**
	 * 获取：考勤类型
	 */

    public void setKaoqinTypes(Integer kaoqinTypes) {
        this.kaoqinTypes = kaoqinTypes;
    }
    /**
	 * 设置：备注
	 */
    public String getKaoqinContent() {
        return kaoqinContent;
    }


    /**
	 * 获取：备注
	 */

    public void setKaoqinContent(String kaoqinContent) {
        this.kaoqinContent = kaoqinContent;
    }
    /**
	 * 设置：考勤日期
	 */
    public Date getKaoqinTime() {
        return kaoqinTime;
    }


    /**
	 * 获取：考勤日期
	 */

    public void setKaoqinTime(Date kaoqinTime) {
        this.kaoqinTime = kaoqinTime;
    }
    /**
	 * 设置：添加时间
	 */
    public Date getInsertTime() {
        return insertTime;
    }


    /**
	 * 获取：添加时间
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
        return "Kaoqin{" +
            "id=" + id +
            ", xueshengId=" + xueshengId +
            ", kaoqinTypes=" + kaoqinTypes +
            ", kaoqinContent=" + kaoqinContent +
            ", kaoqinTime=" + kaoqinTime +
            ", insertTime=" + insertTime +
            ", createTime=" + createTime +
        "}";
    }
}
