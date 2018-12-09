package homework.model;

//﻿Создать три странички
//первая с формой для ввода имени пользователя
//вторая с формой для добавления товара в корзину название и цена
//третья - отображение текущей корзины
//переход на вторую после ввода имени
//переход на третью ссылкой "перейти в корзину" на второй
//На третей видны имя пользователя и добавленные товары
//механизм сохранения товаров с помощью сессии

public class Product {
    private String product;
    private double price;

    public String getProduct() {
        return product;
    }

    public void setProduct(String product) {
        this.product = product;
    }

    public double getPrice() {
        return price;
    }

    public void setPrice(double price) {
        this.price = price;
    }

    @Override
    public String toString() {
        return "Product{" + "product='" + product + '\'' + ", price=" + price + '}';
    }
}