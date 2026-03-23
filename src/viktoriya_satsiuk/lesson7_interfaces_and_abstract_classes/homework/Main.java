package viktoriya_satsiuk.lesson7_interfaces_and_abstract_classes.homework;

public class Main {
    public static void main(String[] args) {
        Mammal cat = new Mammal("Cat", 2, 4.5, true, true, 16);
        Bird parrot = new Bird("Parrot", 3, 0.45, 20, false, 15);
        GrassAnimal horse = new GrassAnimal("Horse", 19, 500, 165, true);
        Predator lion = new Predator("Lion", 6, 250, true, false);
        Reptile lizard = new Reptile("Lizard", 1, 0.15, false, true, "desert");

        Animal[] animals = {cat, parrot, horse, lion, lizard};

        //Результат метода по изменению веса животного
        System.out.println("Animal weight before change: " + animals[0].weight);
        changeAnimalWeight(cat, 5);
        System.out.println("Animal weight after change: " + animals[0].weight);

        //Результат метода по нахождению суммарного возраста всех животных в массиве
        System.out.println("All animals age sum: " + sumAnimalAge(animals));

        //Результат метода по нахождению животного по строке и вывод полной информации о нём
        String search = "Lizard";
        Animal animalSearchResult = animalSearch(animals, search);
        if (animalSearchResult != null) {
            System.out.println("Looking for a Lizard, result: " + animalSearchResult.getInfo());
        } else {
            System.out.println("Animal is not found");
        }

        // Результат сравнения веса двух животных
        compareAnimalWeight(parrot, lizard);

        //Результат метода на нахождению среднего веса всех животных
        System.out.println("Average animal weight: " + averageAnimalWeight(animals));

        //Результат метода по нахождению количества животных тяжелее среднего
        int animalsBiggerThanAvg = moreThanAvgAnimalWeight(animals);
        System.out.println("The amount of animals weight bigger than average: " + animalsBiggerThanAvg);

        //Результат метода по нахождению взрослых животных
        findAdultAnimals(animals);

        //Результат метода по поиску самого тяжелого животного
        Animal biggestAnimal = findHeaviestAnimal(animals);
        if (biggestAnimal != null) {
            System.out.println("The heaviest animal is: " + biggestAnimal.getInfo());
        } else {
            System.out.println("The biggest animal is not found");
        }


        //Результат метода по поиску первого подходящего животного весом больше 6кг
        Animal bigAnimal = findHeavyAnimal(animals);

        if (bigAnimal != null) {
            System.out.println("The first big animal is: " + bigAnimal.getInfo());
        } else {
            System.out.println("There are no big animals");
        }

        //Результат метода по поиску старых животных
        System.out.println("Are there old animals? " + findOldAnimals(animals));

        // Результат метода по звукам
        horse.makeSound();
        lion.makeSound();

        //Результат метода по еде
        cat.eat("mouse");
        parrot.eat("seeds");
    }

    // метод для изменения веса животного
    public static void changeAnimalWeight(Animal animal, double newAnimalWeight) {
        animal.weight = newAnimalWeight;
    }

    // метод для нахождения суммарного возраста всех животных
    public static int sumAnimalAge(Animal[] animals) {
        int sum = 0;
        for (Animal animal : animals) {
            sum += animal.age;
        }
        return sum;
    }

    // метод находит нужное животное в массиве по строке
    public static Animal animalSearch(Animal[] animals, String searchName) {
        for (Animal animal : animals) {
            if (searchName.equals(animal.name)) {
                return animal;
            }
        }
        return null;
    }

    //метод сравнивает между собой 2 животных и показывает какое больше по весу
    public static void compareAnimalWeight(Animal firstAnimal, Animal secondAnimal) {
        if (firstAnimal.weight > secondAnimal.weight) {
            System.out.println("Animal " + firstAnimal.name + " is bigger than animal " + secondAnimal.name);
        } else if (firstAnimal.weight == secondAnimal.weight) {
            System.out.println("Animals " + firstAnimal.name + " and " + secondAnimal.name + " have equal weight");
        } else {
            System.out.println("Animal " + secondAnimal.name + " is bigger than animal " + firstAnimal.name);
        }
    }

    //    Метод находит средний вес всех животных в массиве
    public static double averageAnimalWeight(Animal[] animals) {
        double sum = 0;
        for (Animal animal : animals) {
            sum += animal.weight;
        }
        return sum / animals.length;
    }

    //метод считает количество животных тяжелее среднего
    public static int moreThanAvgAnimalWeight(Animal[] animals) {
        double avg = averageAnimalWeight(animals);
        int count = 0;
        for (Animal animal : animals) {
            if (animal.weight > avg) {
                count++;
            }
        }
        return count;
    }

    //Метод выводит только взрослых животных (старше 6 лет)
    public static void findAdultAnimals(Animal[] animals) {
        int age = 6;
        for (Animal animal : animals) {
            if (animal.age >= age) {
                System.out.println("Animal " + animal.name + " is older than " + age);
            }
        }
    }

    //метод ищет самое тяжёлое животного
    public static Animal findHeaviestAnimal(Animal[] animals) {
        if (animals.length == 0) {
            return null;
        }
        Animal heaviestAnimal = animals[0];
        for (Animal animal : animals) {

            if (animal.weight > heaviestAnimal.weight) {
                heaviestAnimal = animal;
            }
        }
        return heaviestAnimal;
    }

    //Метод находит первое подходящее животное, которое больше 6 кг
    public static Animal findHeavyAnimal(Animal[] animals) {
        int comparedWeight = 6;
        for (Animal animal : animals) {
            if (animal.weight > comparedWeight) {
                return animal;
            }
        }
        return null;
    }

    // Метод проверяет есть ли старые животные (больше 6 лет)
    public static boolean findOldAnimals(Animal[] animals) {
        int oldAge = 6;
        for (Animal animal : animals) {
            if (animal.age >= oldAge) {
                return true;
            }
        }
        return false;
    }

}


