package com.company;

public class Builder {

    private Pizzas _pizza;

    public Pizzas build(){
        return this._pizza;
    }

    public Builder() {
        _pizza = new Pizzas();
    }

    //metodos
    public Builder setMasa(int masa){
        _pizza.setMasa(String.valueOf(masa));
        return this;
    }

    public Builder setRelleno(boolean relleno){
        _pizza.setRelleno(relleno);
        return this;
    }


}
