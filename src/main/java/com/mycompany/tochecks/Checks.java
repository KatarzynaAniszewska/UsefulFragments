/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package com.mycompany.tochecks;

import java.time.LocalDate;
import java.time.format.DateTimeFormatter;

/**
 *
 * @author Katarzyna
 */
public class Checks {
  public static void main(String[] args) {
      String date = "31/11/2016";
      DateTimeFormatter formatter = DateTimeFormatter.ofPattern("d/MM/yyyy");
      LocalDate local = LocalDate.parse(date,formatter);
      System.out.println(local);
  }
    
}
