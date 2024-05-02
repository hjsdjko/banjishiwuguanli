package com.entity.vo;

import com.entity.JiangchengEntity;
import com.baomidou.mybatisplus.annotations.TableField;
import com.baomidou.mybatisplus.annotations.TableName;
import com.fasterxml.jackson.annotation.JsonFormat;
import java.util.Date;
import org.springframework.format.annotation.DateTimeFormat;

import java.io.Serializable;

/**
 * 奖惩
 * 手机端接口返回实体辅助类
 * （主要作用去除一些不必要的字段）
 */
@TableName("jiangcheng")
public class JiangchengVO implements Serializable {
    private static final long serialVersionUID = 1L;


    /**
     * 主键
     */

    @TableField(value = "id")
    private Integer id;


    /**
     * 学生
     */

    @TableField(value = "xuesheng_id")
    private Integer xueshengId;


    /**
     * 奖惩标题
     */

    @TableField(value = "jiangcheng_name")
    private String jiangchengName;


    /**
     * 奖惩类型
     */

    @TableField(value = "jiangcheng_types")
    private Integer jiangchengTypes;


    /**
     * 二级类型
     */

    @TableField(value = "jiangcheng_erji_types")
    private Integer jiangchengErjiTypes;


    /**
     * 文件
     */

    @TableField(value = "jiangcheng_file")
    private String jiangchengFile;


    /**
     * 详情
     */

    @TableField(value = "jiangcheng_content")
    private String jiangchengContent;


    /**
     * 奖惩日期
     */
    @JsonFormat(locale="zh", timezone="GMT+8", pattern="yyyy-MM-dd HH:mm:ss")
	@DateTimeFormat

    @TableField(value = "jiangcheng_time")
    private Date jiangchengTime;


    /**
     * 添加时间
     */
    @JsonFormat(locale="zh", timezone="GMT+8", pattern="yyyy-MM-dd HH:mm:ss")
	@DateTimeFormat

    @TableField(value = "insert_time")
    private Date insertTime;


    /**
     * 创建时间
     */
    @JsonFormat(locale="zh", timezone="GMT+8", pattern="yyyy-MM-dd HH:mm:ss")
	@DateTimeFormat

    @TableField(value = "create_time")
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
	 * 设置：奖惩标题
	 */
    public String getJiangchengName() {
        return jiangchengName;
    }


    /**
	 * 获取：奖惩标题
	 */

    public void setJiangchengName(String jiangchengName) {
        this.jiangchengName = jiangchengName;
    }
    /**
	 * 设置：奖惩类型
	 */
    public Integer getJiangchengTypes() {
        return jiangchengTypes;
    }


    /**
	 * 获取：奖惩类型
	 */

    public void setJiangchengTypes(Integer jiangchengTypes) {
        this.jiangchengTypes = jiangchengTypes;
    }
    /**
	 * 设置：二级类型
	 */
    public Integer getJiangchengErjiTypes() {
        return jiangchengErjiTypes;
    }


    /**
	 * 获取：二级类型
	 */

    public void setJiangchengErjiTypes(Integer jiangchengErjiTypes) {
        this.jiangchengErjiTypes = jiangchengErjiTypes;
    }
    /**
	 * 设置：文件
	 */
    public String getJiangchengFile() {
        return jiangchengFile;
    }


    /**
	 * 获取：文件
	 */

    public void setJiangchengFile(String jiangchengFile) {
        this.jiangchengFile = jiangchengFile;
    }
    /**
	 * 设置：详情
	 */
    public String getJiangchengContent() {
        return jiangchengContent;
    }


    /**
	 * 获取：详情
	 */

    public void setJiangchengContent(String jiangchengContent) {
        this.jiangchengContent = jiangchengContent;
    }
    /**
	 * 设置：奖惩日期
	 */
    public Date getJiangchengTime() {
        return jiangchengTime;
    }


    /**
	 * 获取：奖惩日期
	 */

    public void setJiangchengTime(Date jiangchengTime) {
        this.jiangchengTime = jiangchengTime;
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

}
