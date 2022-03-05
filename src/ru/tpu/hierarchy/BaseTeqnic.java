package ru.tpu.hierarchy;/*
 * @author timtims
 * @date 19.02.2022
 */


public class BaseTeqnic {

    public class Gabarit {
        private Integer hihg;
        private Integer length;
        private Integer shirina;

        public Gabarit(Integer hihg, Integer length, Integer shirina) {
            this.hihg = hihg;
            this.length = length;
            this.shirina = shirina;
        }

        public Integer getHihg() {
            return hihg;
        }

        public void setHihg(Integer hihg) {
            this.hihg = hihg;
        }

        public Integer getLength() {
            return length;
        }

        public void setLength(Integer length) {
            this.length = length;
        }

        public Integer getShirina() {
            return shirina;
        }

        public void setShirina(Integer shirina) {
            this.shirina = shirina;
        }
    }


    private Integer power;

    private Integer weight;

    private Gabarit gabarit;

    private Double price;

    private String manufacter;

    private String description;

    public BaseTeqnic(Integer power, Integer weight, Gabarit gabarit, Double price, String manufacter, String description) {
        this.power = power;
        this.weight = weight;
        this.gabarit = gabarit;
        this.price = price;
        this.manufacter = manufacter;
        this.description = description;
    }

    public Integer getPower() {
        return power;
    }

    public void setPower(Integer power) {
        this.power = power;
    }

    public Integer getWeight() {
        return weight;
    }

    public void setWeight(Integer weight) {
        this.weight = weight;
    }

    public Gabarit getGabarit() {
        return gabarit;
    }

    public void setGabarit(Gabarit gabarit) {
        this.gabarit = gabarit;
    }

    public Double getPrice() {
        return price;
    }

    public void setPrice(Double price) {
        this.price = price;
    }

    public String getManufacter() {
        return manufacter;
    }

    public void setManufacter(String manufacter) {
        this.manufacter = manufacter;
    }

    public String getDescription() {
        return description;
    }

    public void setDescription(String description) {
        this.description = description;
    }
}
