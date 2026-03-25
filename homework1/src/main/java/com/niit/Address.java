package com.niit;

/**
 * Address 类 - 包含城市信息的简单类
 */
public class Address {
    private String city;

    // 默认构造函数
    public Address() {
    }

    // 带参数的构造函数
    public Address(String city) {
        this.city = city;
    }

    // Setter 方法（用于依赖注入）
    public void setCity(String city) {
        this.city = city;
    }

    // Getter 方法
    public String getCity() {
        return city;
    }

    @Override
    public String toString() {
        return "Address{city='" + city + "'}";
    }
}
