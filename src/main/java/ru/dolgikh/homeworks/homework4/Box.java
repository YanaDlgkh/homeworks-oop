package ru.dolgikh.homeworks.homework4;

public class Box {

    private final int length;
    private final int width;
    private final int height;
    private String color;

//    По умолчанию один предмет

    private String item;

//    По умолчанию коробку будет закрыта

    private boolean isOpenBox = false;


    public Box(int length, int width, int height, String color) {
        this.length = length;
        this.width = width;
        this.height = height;
        this.color = color;
    }

    //     Изменить размер коробки после создания нельзя - не добавлены сеттеры и добавлен final

    public int getLength() {
        return length;
    }


    public int getWidth() {
        return width;
    }


    public int getHeight() {
        return height;
    }


    public String getColor() {
        return color;
    }

//     Коробку можно перекрашивать

    public void setColor(String color) {
        this.color = color;
    }

    // Коробку можно открывать и закрывать

    public boolean open() {
        isOpenBox = true;
        System.out.println("Коробка открыта!");
        return true;
    }


    public boolean close() {
        isOpenBox = false;
        System.out.println("Коробка закрыта!");
        return false;
    }

//    У коробки должен быть метод, печатающий информацию о ней в консоль

    public void info() {
        System.out.println("Размер коробки: " + length + "х" + width + "х" + height + "\n" +
                "Цвет коробки : " + color);
    }

    // В коробку можно складывать предмет (если в ней нет предмета), только при условии что коробка открыта
    public void fold(String item) {
        if (isOpenBox && this.item == null) {
            this.item = item;
            System.out.println("В коробку добавлен предмет: " + item);
        } else System.out.println("Вы не можете положить в коробку " + item + ", так как она закрыта");


    }
//     Можно выкидывать предмет (только если он есть), только при условии что коробка открыта

    public void discard(String item) {
        if (isOpenBox && this.item == item) {
            this.item = null;
            System.out.println("Из коробки выкинули предмет: " + item);
        } else if (!isOpenBox) {
            System.out.println("Коробка вообще-то закрыта!!!!");
        } else System.out.println("В коробке ничего нет ");


    }

}
