package yanina_savich.lesson7_interfaces_and_abstract_classes.lesson;

public class Service {
    public static Car findByModel(Car[] cars, String model) {
        for (int i = 0; i < cars.length; i++) {
            if (cars[i].model.equals(model)) {
                return cars[i];
            }
        }
        return null;
    }
}
