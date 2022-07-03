package com.example.designpattern.dependency.dependency;

/**
 * 类之间的关系-依赖（dependency）
 */
public class CarFactory {
    // Car作为返回值
    public Car create() {
        return new Car();
    }

    // Car作为方法入参数
    public void changeBrand(Car car) {
        car.setBrand("BWM");
    }

    public String getCarDefaultBrand() {
        // Car作为局部变量
        Car car = new Car();
        return car.getBrand();
    }

    public void printCarTag() {
        // 调用Car的静态方法
        System.out.println(Car.getTag());
    }
}
