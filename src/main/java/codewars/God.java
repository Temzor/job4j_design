package codewars;

public class God {
    public static Human[] create() {
        Man man = new Man();
        Woman woman = new Woman();
        return new Human[]{man, woman};
    }
}

class Woman extends Human {

}
