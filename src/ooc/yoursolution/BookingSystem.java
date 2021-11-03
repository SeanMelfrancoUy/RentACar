/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package ooc.yoursolution;

import java.io.BufferedReader;
import java.io.IOException;

/**
 *
 * @author seanuy
 */
public class BookingSystem implements BookingSystemInterface {

    @Override
    public RentACarInterface setupRentACar(BufferedReader in) throws IOException {
         
           RentACarInterface RentACar = new RentACar();
           
           String NumberOfCars = in.readLine();
           String Make = "";
           
           while(NumberOfCars != null) {
               
               Make = in.readLine();
               
               Car cars = new Car();
               RentACar.getNumberOfCars();
               RentACar.getName();
               
               NumberOfCars = in.readLine();
               
           }
           
           
    
    

