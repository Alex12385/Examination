import ToyShop.ToyShop;
import ToyTypes.Toy;

public class Main {
    public static void main(String[] args) {
        // Создаем экземпляр класса ToyShop
        ToyShop toyShop = new ToyShop();

        // Добавляем игрушки в магазин
        toyShop.put("1 Конструктор 10");
        toyShop.put("2 Робот 15");
        toyShop.put("3 Кукла 12");

        // Вызываем метод getToyById() 10 раз
        for (int i = 0; i < 10; i++) {
            int wonToyId = toyShop.getToyId();
            Toy wonToy = toyShop.getToyById(wonToyId);
            if (wonToy != null) {
                System.out.println("Выпавшая игрушка: " + wonToy.getName() + " (id: " + wonToy.getId() + ", вес: " + wonToy.getWeight() + ")");
            } else {
                System.out.println("Игрушки закончились");
            }
        }

        // Сохраняем результаты в файл
        toyShop.saveResultToFile("result.txt");
    }
}