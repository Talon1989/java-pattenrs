package pattern.builder;

public class Nation {

    private String name;
    private Long population;
    private Long gdp;
    private Long area;
    private String description;

    private Nation(Builder builder) {
        this.name = builder.name;
        this.population = builder.population;
        this.gdp = builder.gdp;
        this.area = builder.area;
        this.description = builder.description;
    }

    public static class Builder{

        private String name;
        private Long population = null;
        private Long gdp = null;
        private Long area = null;
        private String description = null;

        public Builder(String name) {
            this.name = name;
        }

        public Builder population(Long population){
            this.population = population;
            return this;
        }

        public Builder gdp(Long gdp){
            this.gdp = gdp;
            return this;
        }

        public Builder area(Long area){
            this.area = area;
            return this;
        }

        public Builder description(String name){
            this.name = name;
            return this;
        }

        public Nation build(){
            return new Nation(this);
        }

    }

    public String getName() {
        return name;
    }

    public void setName(String name) {
        this.name = name;
    }

    public Long getPoputation() {
        return population;
    }

    public void setPopulation(Long population) {
        this.population = population;
    }

    public Long getGdp() {
        return gdp;
    }

    public void setGdp(Long gdp) {
        this.gdp = gdp;
    }

    public Long getArea() {
        return area;
    }

    public void setArea(Long area) {
        this.area = area;
    }

    public String getDescription() {
        return description;
    }

    public void setDescription(String description) {
        this.description = description;
    }

    @Override
    public String toString() {
        return "Nation{" +
                "name='" + name + '\'' +
                ", population=" + population +
                ", gdp=" + gdp +
                ", area=" + area +
                ", description='" + description + '\'' +
                '}';
    }
}
