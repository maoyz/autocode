package cn.com.autohome.mall.erp.soa.po;

import java.io.Serializable;
import java.util.Date;

/**
 * 
 * @author fangli@autohome.com.cn
 * 
 */
public class BaseEntity<T> implements Cloneable, Serializable {

    /**
     * 
     */
    private static final long serialVersionUID = 1L;
    private T id;
    private Date createdTime;
    private Long createdBy;
    private Date updateTime;
    private Long updateBy;
    private Integer yn;

    public T getId() {
        return id;
    }

    public void setId(T id) {
        this.id = id;
    }

    public Date getCreatedTime() {
        return createdTime;
    }

    public void setCreatedTime(Date createdTime) {
        this.createdTime = createdTime;
    }

    public Long getCreatedBy() {
        return createdBy;
    }

    public void setCreatedBy(Long createdBy) {
        this.createdBy = createdBy;
    }

    public Date getUpdateTime() {
        return updateTime;
    }

    public void setUpdateTime(Date updateTime) {
        this.updateTime = updateTime;
    }

    public Long getUpdateBy() {
        return updateBy;
    }

    public void setUpdateBy(Long updateBy) {
        this.updateBy = updateBy;
    }

    public Integer getYn() {
        return yn;
    }

    public void setYn(Integer yn) {
        this.yn = yn;
    }
}
