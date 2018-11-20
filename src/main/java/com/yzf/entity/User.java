package com.yzf.entity;

import javax.persistence.Column;
import javax.persistence.Id;
import javax.persistence.Table;

/**
 * User - 用户类
 */
@Table(name = "user")
public class User {

    @Id
    @Column(name = "id")
    private int id;
    @Column(name = "name")// 用户id
    private String name;        // 用户名
    @Column(name = "password")
    private String password;    // 用户密码
    @Column(name = "sex")
    private int sex;            // 用户性别
    @Column(name = "email")
    private String email;       // 用户邮箱
    @Column(name = "phone")
    private String phone;       // 用户手机
    @Column(name = "admin")
    private String admin;       // 用户是否是管理员，"admin"表示是管理员，其他为普通用户

    public User() { }

    public User(int id, String name, String password, int sex, String email, String phone) {
        this.id = id;
        this.name = name;
        this.password = password;
        this.sex = sex;
        this.email = email;
        this.phone = phone;
        this.admin = "";
    }

    public int getId() {
        return id;
    }

    public void setId(int id) {
        this.id = id;
    }

    public String getName() {
        return name;
    }

    public void setName(String name) {
        this.name = name;
    }

    public String getPassword() {
        return password;
    }

    public void setPassword(String password) {
        this.password = password;
    }

    public int getSex() {
        return sex;
    }

    public void setSex(int sex) {
        this.sex = sex;
    }

    public String getEmail() {
        return email;
    }

    public void setEmail(String email) {
        this.email = email;
    }

    public String getPhone() {
        return phone;
    }

    public void setPhone(String phone) {
        this.phone = phone;
    }

    public String getAdmin() {
        return admin;
    }

    public void setAdmin(String admin) {
        this.admin = admin;
    }

    @Override
    public String toString() {
        return "User{" +
                "id=" + id +
                ", name='" + name + '\'' +
                ", password='" + password + '\'' +
                ", sex=" + sex +
                ", email='" + email + '\'' +
                ", phone='" + phone + '\'' +
                ", admin='" + admin + '\'' +
                '}';
    }

}