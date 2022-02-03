package collection;

/*
3) определить класс Автомобиль. Он определяется следующими полями - марка машины (строка) и цена (целое число).
Пользователь вводит с консоли данные про автомобили. Создать с этими параметрами автомобиль и положить в коллекцию.
Применяем условие из предыдущей задачи про слово «стоп». Дальше как обычно - выводим на экран все автомобили
 */
public class Auto {
    private String name;
    private int price;

    public String getName() {
        return name;
    }

    public void setName(String name) {
        this.name = name;
    }

    public int getPrice() {
        return price;
    }

    public void setPrice(int price) {
        this.price = price;
    }

    public Auto(String name, int price) {
        this.name = name;
        this.price = price;
    }

    public Auto() {
    }
}
