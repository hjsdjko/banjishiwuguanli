package com.entity.model;

import com.entity.JiangchengEntity;

import com.baomidou.mybatisplus.annotations.TableName;
import com.fasterxml.jackson.annotation.JsonFormat;
import java.util.Date;
import org.springframework.format.annotation.DateTimeFormat;
import java.io.Serializable;


/**
 * 奖惩
 * 接收传参的实体类
 *（实际开发中配合移动端接口开发手动去掉些没用的字段， 后端一般用entity就够用了）
 * 取自ModelAndView 的model名称
 */
public class JiangchengModel implements Serializable {
    private static final long serialVersionUID = 1L;




    /**
     * 主键
     */
    private Integer id;


    /**
     * 学生
     */
    private Integer xueshengId;


    /**
     * 奖惩标题
     */
    private String jiangchengName;


    /**
     * 奖惩类型
     */
    private Integer jiangchengTypes;


    /**
     * 二级类型
     */
    private Integer jiangchengErjiTypes;


    /**
     * 文件
     */
    private String jiangchengFile;


    /**
     * 详情
     */
    private String jiangchengContent;


    /**
     * 奖惩日期
     */
    @JsonFormat(locale="zh", timezone="GMT+8", pattern="yyyy-MM-dd HH:mm:ss")
	@DateTimeFormat
    private Date jiangchengTime;


    /**
     * 添加时间
     */
    @JsonFormat(locale="zh", timezone="GMT+8", pattern="yyyy-MM-dd HH:mm:ss")
	@DateTimeFormat
    private Date insertTime;


    /**
     * 创建时间
     */
    @JsonFormat(locale="zh", timezone="GMT+8", pattern="yyyy-MM-dd HH:mm:ss")
	@DateTimeFormat
    private Date createTime;


    /**
	 * 获取：主键
	 */
    public Integer getId() {
        return id;
    }


    /**
	 * 设置：主键
	 */
    public void setId(Integer id) {
        this.id = id;
    }
    /**
	 * 获取：学生
	 */
    public Integer getXueshengId() {
        return xueshengId;
    }


    /**
	 * 设置：学生
	 */
    public void setXueshengId(Integer xueshengId) {
        this.xueshengId = xueshengId;
    }
    /**
	 * 获取：奖惩标题
	 */
    public String getJiangchengName() {
        return jiangchengName;
    }


    /**
	 * 设置：奖惩标题
	 */
    public void setJiangchengName(String jiangchengName) {
        this.jiangchengName = jiangchengName;
    }
    /**
	 * 获取：奖惩类型
	 */
    public Integer getJiangchengTypes() {
        return jiangchengTypes;
    }


    /**
	 * 设置：奖惩类型
	 */
    public void setJiangchengTypes(Integer jiangchengTypes) {
        this.jiangchengTypes = jiangchengTypes;
    }
    /**
	 * 获取：二级类型
	 */
    public Integer getJiangchengErjiTypes() {
        return jiangchengErjiTypes;
    }


    /**
	 * 设置：二级类型
	 */
    public void setJiangchengErjiTypes(Integer jiangchengErjiTypes) {
        this.jiangchengErjiTypes = jiangchengErjiTypes;
    }
    /**
	 * 获取：文件
	 */
    public String getJiangchengFile() {
        return jiangchengFile;
    }


    /**
	 * 设置：文件
	 */
    public void setJiangchengFile(String jiangchengFile) {
        this.jiangchengFile = jiangchengFile;
    }
    /**
	 * 获取：详情
	 */
    public String getJiangchengContent() {
        return jiangchengContent;
    }


    /**
	 * 设置：详情
	 */
    public void setJiangchengContent(String jiangchengContent) {
        this.jiangchengContent = jiangchengContent;
    }
    /**
	 * 获取：奖惩日期
	 */
    public Date getJiangchengTime() {
        return jiangchengTime;
    }


    /**
	 * 设置：奖惩日期
	 */
    public void setJiangchengTime(Date jiangchengTime) {
        this.jiangchengTime = jiangchengTime;
    }
    /**
	 * 获取：添加时间
	 */
    public Date getInsertTime() {
        return insertTime;
    }


    /**
	 * 设置：添加时间
	 */
    public void setInsertTime(Date insertTime) {
        this.insertTime = insertTime;
    }
    /**
	 * 获取：创建时间
	 */
    public Date getCreateTime() {
        return createTime;
    }


    /**
	 * 设置：创建时间
	 */
    public void setCreateTime(Date createTime) {
        this.createTime = createTime;
    }

    }
