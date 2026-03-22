package yanina_savich.lesson7_interfaces_and_abstract_classes.lesson;

    public class Car {

        String model;
        int year;
        int speed;
        int carCost;

        public Car(String model, int year, int speed) {
            this.model = model;
            this.year = year;
            this.speed = speed;
        }

        public String toString() {
            return model + " (" + year + "), speed = " + speed;
        }

        public void increaseCostForSpeed() {
            if (this.speed > 100) {
                carCost += 150;
            }
        }
    }
