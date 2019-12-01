package com.sys.pojo;

import java.io.Serializable;
import java.util.Arrays;
import java.util.Date;
/***
 * @time	2019-09-06 10:58:47
 * @author	fei.wenxiang
 * @Description	数据库对应user
 * @version	0.0.0
 */
public class UserInfoPO implements Serializable {
    private Integer testUserUid;

    private String testUserUname;

    private String testUserPwd;

    private Date lastLoginTime;

    private byte[] file;

    private static final long serialVersionUID = 1L;

    public Integer getTestUserUid() {
        return testUserUid;
    }

    public void setTestUserUid(Integer testUserUid) {
        this.testUserUid = testUserUid;
    }

    public String getTestUserUname() {
        return testUserUname;
    }

    public void setTestUserUname(String testUserUname) {
        this.testUserUname = testUserUname == null ? null : testUserUname.trim();
    }

    public String getTestUserPwd() {
        return testUserPwd;
    }

    public void setTestUserPwd(String testUserPwd) {
        this.testUserPwd = testUserPwd == null ? null : testUserPwd.trim();
    }

    public Date getLastLoginTime() {
        return lastLoginTime;
    }

    public void setLastLoginTime(Date lastLoginTime) {
        this.lastLoginTime = lastLoginTime;
    }

    public byte[] getFile() {
        return file;
    }

    public void setFile(byte[] file) {
        this.file = file;
    }

    @Override
    public boolean equals(Object that) {
        if (this == that) {
            return true;
        }
        if (that == null) {
            return false;
        }
        if (getClass() != that.getClass()) {
            return false;
        }
        UserInfoPO other = (UserInfoPO) that;
        return (this.getTestUserUid() == null ? other.getTestUserUid() == null : this.getTestUserUid().equals(other.getTestUserUid()))
            && (this.getTestUserUname() == null ? other.getTestUserUname() == null : this.getTestUserUname().equals(other.getTestUserUname()))
            && (this.getTestUserPwd() == null ? other.getTestUserPwd() == null : this.getTestUserPwd().equals(other.getTestUserPwd()))
            && (this.getLastLoginTime() == null ? other.getLastLoginTime() == null : this.getLastLoginTime().equals(other.getLastLoginTime()))
            && (Arrays.equals(this.getFile(), other.getFile()));
    }

    @Override
    public int hashCode() {
        final int prime = 31;
        int result = 1;
        result = prime * result + ((getTestUserUid() == null) ? 0 : getTestUserUid().hashCode());
        result = prime * result + ((getTestUserUname() == null) ? 0 : getTestUserUname().hashCode());
        result = prime * result + ((getTestUserPwd() == null) ? 0 : getTestUserPwd().hashCode());
        result = prime * result + ((getLastLoginTime() == null) ? 0 : getLastLoginTime().hashCode());
        result = prime * result + (Arrays.hashCode(getFile()));
        return result;
    }
}