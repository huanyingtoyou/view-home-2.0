package com.lihy.view.sharding.commom;

/**
 * @author 迎
 * @date 2019/5/24
 */
public class OrderRequest {

    private Integer userId;

    private String status;

    public Integer getUserId() {
        return userId;
    }

    public void setUserId(Integer userId) {
        this.userId = userId;
    }

    public String getStatus() {
        return status;
    }

    public void setStatus(String status) {
        this.status = status;
    }
}
