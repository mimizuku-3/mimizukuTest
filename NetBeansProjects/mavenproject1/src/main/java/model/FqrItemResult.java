/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package model;

import java.time.LocalDateTime;

/**
 *
 * @author mizuki
 */
public class FqrItemResult {

    private String qrCode;
    private LocalDateTime createDatetime;
    private LocalDateTime updateDatetime;
    private LocalDateTime startDatetime;

    public FqrItemResult(String qrCode, LocalDateTime createDatetime, LocalDateTime updateDatetime, LocalDateTime startDatetime) {
        this.qrCode = qrCode;
        this.createDatetime = createDatetime;
        this.updateDatetime = updateDatetime;
        this.startDatetime = startDatetime;
    }

    public FqrItemResult() {
    }

    /**
     * @return the qrCode
     */
    public String getQrCode() {
        return qrCode;
    }

    /**
     * @param qrCode the qrCode to set
     */
    public void setQrCode(String qrCode) {
        this.qrCode = qrCode;
    }

    /**
     * @return the createDatetime
     */
    public LocalDateTime getCreateDatetime() {
        return createDatetime;
    }

    /**
     * @param createDatetime the createDatetime to set
     */
    public void setCreateDatetime(LocalDateTime createDatetime) {
        this.createDatetime = createDatetime;
    }

    /**
     * @return the updateDatetime
     */
    public LocalDateTime getUpdateDatetime() {
        return updateDatetime;
    }

    /**
     * @param updateDatetime the updateDatetime to set
     */
    public void setUpdateDatetime(LocalDateTime updateDatetime) {
        this.updateDatetime = updateDatetime;
    }

    /**
     * @return the startDatetime
     */
    public LocalDateTime getStartDatetime() {
        return startDatetime;
    }

    /**
     * @param startDatetime the startDatetime to set
     */
    public void setStartDatetime(LocalDateTime startDatetime) {
        this.startDatetime = startDatetime;
    }
}
