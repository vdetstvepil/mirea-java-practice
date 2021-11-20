package task9;

import java.util.ArrayList;
import java.util.Collections;
import java.util.List;
import java.util.Random;

class SolarSystem {
    // Список названий планет солнечной системы.
    private ArrayList<String> solarSystem;

    // Конструктор без параметров.
    public SolarSystem() {
        solarSystem = new ArrayList<>();
    }

    // Метод возвращения немодифицируемого списка.
    public List<String> getUnmodifiableSolarSystem() {
        return Collections.unmodifiableList(solarSystem);
    }

    // Метод добавления планеты.
    public void addPlanet(String name) {
        solarSystem.add(name);
    }

    // Метод удаления планеты.
    public void removePlanet(String name) {
        solarSystem.remove(name);
    }

    // Метод изменения планеты по индексу.
    public void changePlanet(int index, String value) {
        solarSystem.set(index, value);
    }

    // Метод перемешивания планет.
    public void shufflePlanets() {
        Collections.shuffle(solarSystem);
    }

    // Метод получения случайной планеты.
    public String getRandomPlanet() {
        Random random = new Random();
        return solarSystem.get(random.nextInt(solarSystem.size()));
    }

    // Метод получения индекса планеты по ее названию.
    public int getIndexOfPlanet(String name) {
        return solarSystem.indexOf(name);
    }

    // Метод проверки наличия планеты в списке.
    public boolean planetExists(String name) {
        return solarSystem.contains(name);
    }

    // Метод преобразования списка в массив элементов.
    public String[] getSolarSystemArray() {
        return solarSystem.toArray(new String[solarSystem.size()]);
    }

    // Метод получения размера солнечной системы.
    public int getSolarSystemSize() {
        return solarSystem.size();
    }

    @Override
    public String toString() {
        StringBuilder temp = new StringBuilder();
        temp.append("Solar system: ");
        for(String planet : solarSystem){
            temp.append("[").append(planet).append("] ");
        }
        return String.valueOf(temp);
    }
}

public class Test {
    public static void main(String[] args) {
        // Инициализируем объект класса SolarSystem.
        SolarSystem system = new SolarSystem();

        // Добавляем новые планеты в систему.
        system.addPlanet("Mercury");
        system.addPlanet("Venus");
        system.addPlanet("Earth");
        system.addPlanet("Mars");
        system.addPlanet("Jupiter");
        system.addPlanet("Saturn");
        system.addPlanet("Uranus");
        system.addPlanet("Neptune");

        // Выводим список на экран.
        System.out.println(system.toString());

        // Удаляем планету.
        system.removePlanet("Earth");
        System.out.println(system.toString());

        // Добавляем планету.
        system.addPlanet("Earth");
        System.out.println(system.toString());

        // Изменяем планету.
        system.changePlanet(1, "UFO");
        System.out.println(system.toString());

        // Перемешиваем планеты.
        system.shufflePlanets();
        System.out.println(system.toString());

        // Выводим рандомную планету.
        System.out.println("Random planet -> " + system.getRandomPlanet());

        // Выводим индекса планеты.
        System.out.println("Index of UFO -> " + system.getIndexOfPlanet("UFO"));

        // Проверяем наличие планеты.
        System.out.println("Planet \"Kazuki\" exists -> " + system.planetExists("Kazuki"));
    }
}
