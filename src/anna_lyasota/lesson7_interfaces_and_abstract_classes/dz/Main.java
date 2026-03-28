package anna_lyasota.lesson7_interfaces_and_abstract_classes.dz;

public class Main {
    public static void main(String[] args) {

        Mammal animal0 = new Mammal("wolf", 10, 50.0);
        Reptile animal1 = new Reptile("crocodile",5,20.5);
        Bird animal2 = new Bird("pigeon",1,3.4);
        Predator animal3 = new Predator("tiger",15,40.0);
        GrassAnimal animal4 = new GrassAnimal("cow",4,60.0);

        Animal[] animals = new Animal[5];
        animals[0] = animal0;
        animals[1] = animal1;
        animals[2] = animal2;
        animals[3] = animal3;
        animals[4] = animal4;

//Задание 1: Изменить вес у одного животного
// (метод принимает животное и новый вес и меянет его)
        Main main = new Main();
        main.changeWeight(animals[0], 55.0);
        System.out.println("Обновленный вес: " + animals[0].name + " " + animals[0].weight);

//Задание 2: Сумма возраста всех животных
        int animalsAge = main.sumAge(animals);
        System.out.println("Сумма возраста всех животных: " + animalsAge);

//Задание 3: метод принимает searchName и массив животных,
// и по указанному параметру находит животное
        String searchName = "tiger";
        main.searchNameAnimal(animals,searchName);

//Задание 4: метод принимает 2 животных и выводит какое из них больше
        main.comparison(animals[0], animals[1]);

//Задание 5: найти средний вес всех животных
        double animalsAverageWeight = main.averageWeight(animals);
        System.out.println("Средний вес всех животных: " + animalsAverageWeight);

//Задание 6: Посчитать животных тяжелее среднего
        main.countHeavyAnimals(animals, animalsAverageWeight);

//Задание 7: Вывести только взрослых животных. (старше 6 лет)
        main.showAdultAnimals(animals);

//Задание 8: Поиск самого тяжёлого животного
        main.mostHeavyAnimal(animals);

//Задание 9: Найти первое подходящее животное, которое больше 6 кг
        main.firstAnimalMoreThan6kg(animals);

//Задание 10: Проверить есть ли старые животные (больше 6 лет и вернуть true или false)
        boolean hasOldAnimals = main.oldAnimals(animals);
        System.out.println("Есть ли старые животные? " + hasOldAnimals);
    }


    //Задание 1:
    public void changeWeight(Animal animal, double newWeight) {
        animal.weight = newWeight;
    }

    //Задание 2:
    public int sumAge(Animal[] animals) {
        int sum = 0;
        for (int i = 0; i < animals.length; i++) {
            sum += animals[i].age;
        }
        return sum;
    }

    //Задание 3:
    private void searchNameAnimal(Animal[] animals, String searchName) {
        boolean b = false;
        for (int i = 0; i < animals.length; i++) {
            if (animals[i].name.equals(searchName)) {
                System.out.println("Животное найдено: " + animals[i]);
                b = true;
                break;
            }
        }
    }

    //Задание 4:
    private void comparison(Animal a1, Animal a2) {
        if (a1.weight > a2.weight) {
            System.out.println(a1.name + " больше по весу, чем " + a2.name);
        } else if (a2.weight > a1.weight) {
            System.out.println(a2.name + " больше по весу, чем " + a1.name);
        } else {
            System.out.println("Животные равны по весу: " + a1.name + "и" + a2.name);
        }
    }

    //Задание 5:
    public double averageWeight(Animal[] animals) {
        double sum5 = 0;
        for (int i = 0; i < animals.length; i++) {
            sum5 += animals[i].weight;
        }
        return  sum5/animals.length;
    }

    //Задание 6:
    private void countHeavyAnimals(Animal[] animals, double averageWeight) {
        int count = 0;
        for (int i = 0; i < animals.length; i++) {
            if (animals[i].weight > averageWeight) {
                count++;
            }
        }
        System.out.println("Количество животных тяжелее среднего: " + count);
    }

    //Задание 7:
    private void showAdultAnimals(Animal[] animals) {
        System.out.println("Животные старше 6 лет:");
        for (int i = 0; i < animals.length; i++) {
            if (animals[i].age > 6) {
                System.out.println(animals[i].name);
            }
        }
    }

    //Задание 8:
    private void mostHeavyAnimal(Animal[] animals) {
        Animal heaviest = animals[0];
        for (int i = 1; i < animals.length; i++) {
            if (animals[i].weight > heaviest.weight) {
                heaviest = animals[i];
            }
        }
        System.out.println("Самое тяжелое животное: " + heaviest.name);
    }

    //Задание 9:
    private void firstAnimalMoreThan6kg (Animal[] animals){
        for (int i = 0; i < animals.length; i++) {
            if (animals[i].weight > 6) {
                System.out.println("Животное, вес которого больше 6 кг: " + animals[i].name);
                break;
            }
        }
    }


    //Задание 10:
    private boolean oldAnimals (Animal[] animals){
        boolean a;
        for (int i = 0; i < animals.length; i++) {
            if (animals[i].age > 6) {
                return true; // нашли — сразу выходим
            }
        }
        return false;
        }
    }
