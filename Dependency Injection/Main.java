public class Main {
    public static void main(String[] args) {

        // car engine yapısına bağımlı ancak engine dışarda yapılı
        // car içine enjekte ediliyor

        Engine testEngine = new Engine();
        Car testCar = new Car(testEngine);
        System.out.println(testCar.engine.cylinder);

        // dışarda yapıp içeri ekleme sistemi sayesinde motor değişsede
        // aynı Car sınıfı içine eklenebilir

        StrongEngine strongEngine = new StrongEngine();
        Car strongCar = new Car(strongEngine);
        System.out.println(strongCar.engine.cylinder);

    }
}

// car sınıfı bir engine propertysine sahip
// peki ya engineden daha iyi bir şey istersek?
// neyse ki Engine sınıfını extendleyen
// yeni bir engine car tarafından kabul edilir

class Car {
    Engine engine = null;

    public Car(Engine engine) {
        this.engine = engine;
    }
}

class Engine {
    int horsePower = 200;
    int cylinder = 6;

}

class StrongEngine extends Engine {
    public StrongEngine() {
        this.horsePower = 600;
        this.cylinder = 18;

    }
}