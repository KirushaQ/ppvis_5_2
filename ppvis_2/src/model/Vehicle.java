package model;

import data.Types;

public class Vehicle {
    private int number;
    private int price;
    private Types type;

        public Vehicle(Types type){
            this.type = type;
        }

         public Vehicle(Types type, int number, int price){
            this.type = type;
            this.number = number;
            this.price = price;
    }

        public void set_number(int x){
            this.number = x;
        }

        public void set_price(int x){
            this.price = x;
        }

        public int get_number(){
            return number;
        }

        public int get_price(){
            return price;
        }

        public Types get_type(){
            return type;
        }
}
