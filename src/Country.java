
public class Country {
    private String name;
    private int square;
    private int population;
    private String capitalName;
    private int capitalPopulation;

    public Country(String name, int square, int population) {
        setName(name);
        setSquare(square);
        setPopulation(population);
    }
    
    public Country(String name, int square, int population, 
            String capitalName, int capitalPopulation) {
        this(name, square, population);
        setCapital(capitalName, capitalPopulation);
    }
    
    public String getName() {
        return name;
    }

    public void setName(String name) {
        if(name == null)
            throw new IllegalArgumentException("Country name can't be null.");
        this.name = name;
    }

    public int getSquare() {
        return square;
    }

    public void setSquare(int square) {
        if(square <= 0)
            throw new IllegalArgumentException("Country square must be greater than zero.");
        this.square = square;
    }

    public int getPopulation() {
        return population;
    }

    public void setPopulation(int population) {
        if(population <= 0)
            throw new IllegalArgumentException("Country population must be greater than zero.");
        this.population = population;
    }
    
    public float getPopulationDensity() {
        return ((float)population) / square;
    }

    public String getCapitalName() {
        return capitalName;
    }

    public int getCapitalPopulation() {
        return capitalPopulation;
    }

    public void setCapital(String capitalName, int capitalPopulation) {
        if(capitalName != null) {
            if(capitalPopulation <= 0)
                throw new IllegalArgumentException("Capital population must be greater than zero.");
        } else {
            capitalPopulation = 0;
        }
        this.capitalName = capitalName;
        this.capitalPopulation = capitalPopulation;
    }
    
    public void print() {
        System.out.println(name + "; square=" + square + "; population=" + population
            + "; population density=" + getPopulationDensity());
        if(capitalName != null)
            System.out.println("The capital is " + capitalName
                + " with population " + capitalPopulation);
        System.out.println();
    }
    
    public static void printAll(Country[] countries) {
        for(Country c: countries)
            c.print();
    }
}
