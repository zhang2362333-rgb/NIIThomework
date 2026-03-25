package com.niit;

/**
 * Student 类 - 包含姓名和地址信息
 */
public class Student {
    private String name;
    private Address address;

    // 默认构造函数
    public Student() {
    }

    // 带参数的构造函数
    public Student(String name, Address address) {
        this.name = name;
        this.address = address;
    }

    // Setter 方法（用于依赖注入）
    public void setName(String name) {
        this.name = name;
    }

    public void setAddress(Address address) {
        this.address = address;
    }

    // Getter 方法
    public String getName() {
        return name;
    }

    public Address getAddress() {
        return address;
    }

    @Override
    public String toString() {
        return "Student{name='" + name + "', address=" + address + "}";
    }
}
