package roma_kinev.lesson7_interfaces_and_abstract_classes.dz;

public class Main {
    public static void main(String[] args) {

      Animal ani1 = new GrassAnimal("Корова", 8, 350, "трава");
      Animal ani2 = new Predator("Волк", 5, 100, 4);
      Animal ani3 = new Reptile("Кобра", 1, 2,6, 27.2);
      Animal ani4 = new Bird("Воробей", 1, 0.3, "Семки", 0.2);
      Animal ani5 = new Mammal("Тигр", 7, 110, 10, 9);

      Animal[] animals = {ani1, ani2, ani3, ani4, ani5};

      //Задание 1, заменить вес у одного животного
        changeWeight(ani1, 450);
      //Задание 2, суммарный вес
        sumWeight(animals);
      //Задание 3, поиск по имени
        Animal found = searchName(animals,"Тигр");
        if (found != null){
            System.out.println("Найдено животное " + found.getInfo());
        } else {
            System.out.println("Животное не найдено");
        }
      //Задание 4, сравнить вес 2 животных
        compare2Animals(ani2,ani5);
      //Задание 5, средний вес всех животных
        averageWeight(animals);
      //Задание 6,Количество животных тяжелее среднего веса
        weightMoreThenAverage(animals);
      //Задание 7. Животные старше 6 лет
        oldAnimals(animals);
      //Задание 8, самое тяжелое животноре
        theHeaviestAnimals(animals);
      //Задание 9, певое животное старше 6 лет
        ferstOldAnimals(animals);
      //Задание 10, есть ли животные старше 6 лет
        System.out.println(haveOldAnimals(animals));
    }

    public static void changeWeight(Animal animal, double newWeight){
        animal.weight = newWeight;
        System.out.println("Вес животного " + animal.name + " изменен на " + newWeight);
    }

    public static void sumWeight(Animal[] animals){
        double sum = 0;
        for (Animal a : animals){
          sum = sum + a.weight;
        }
        System.out.println("Суммарный вес = " + sum);
    }

    public static Animal searchName(Animal[] animals, String searchName){
        for (Animal a : animals){
            if (a.name.equals(searchName)){
                return a;
            }
        }
        return null;
    }

    public static void compare2Animals(Animal animal1, Animal animal2){
        if (animal1.weight > animal2.weight){
            System.out.println("Между " + animal1.name + " и " + animal2.name +  " Вес больше у " + animal1.name);
        }else {
            System.out.println("Между " + animal1.name + " и " + animal2.name +  " Вес больше у " + animal2.name);
        }
    }

    public static void averageWeight(Animal[] animals){
        double average = 0;
        for (Animal a : animals){
            average = (average + a.weight) / animals.length;
        }
        System.out.println("Средний вес всех животных = " + average);
    }

    public static void weightMoreThenAverage(Animal[] animals){
        double average = 0;
        int count = 0;
        for (Animal a : animals){
            average = (average + a.weight) / animals.length;
            if (a.weight > average){
                count++;
            }
        }
        System.out.println("Количество животных тяжелее среднего веса = " + count);
    }

    public static void oldAnimals (Animal[] animals){
        for (Animal a : animals){
            if (a.age > 6 ){
                System.out.println("Животное старше 6 лет: " + a.name + " ему " +  a.age + " лет");
            }
        }
    }

    public static void theHeaviestAnimals(Animal[] animals){
        double heaviest = 0;
        String animalsName = null;
        for (Animal a : animals){
            if (a.weight > heaviest){
                heaviest = a.weight;
                animalsName = a.name;
            }
        }
        System.out.println("Самый тяжелый " + animalsName + " с весом " + heaviest);
    }

    public static void ferstOldAnimals (Animal[] animals){
        for (Animal a : animals){
            if (a.age > 6 ){
                System.out.println("Первое животное в списке старше 6 лет: " + a.name + " ему " +  a.age + " лет");
                break;
            }
        }
    }

    public static boolean haveOldAnimals(Animal[] animals){
        boolean result = false;
        for (Animal a : animals){
            if (a.age > 6){
                result = true;
            }else {
                result = false;
            }
        }
        return result;
    }
}
