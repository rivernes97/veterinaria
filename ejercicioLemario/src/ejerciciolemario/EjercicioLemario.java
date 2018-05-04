/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package ejerciciolemario;

import java.io.BufferedReader;
import java.io.File;
import java.io.FileNotFoundException;
import java.io.FileReader;
import java.io.IOException;
import java.util.Scanner;
import java.util.logging.Level;
import java.util.logging.Logger;


public class EjercicioLemario {

    public void cargaFicheroLemario() {
        File fichero = new File("src/ejercicioLemario/lemario-20101017.txt");
        try {
            FileReader fr = new FileReader(fichero);
            BufferedReader br = new BufferedReader(fr);
            String linea;

            java.util.Scanner scanner = new Scanner(System.in);

            System.out.println("introduce Palabra");
            String pasa = scanner.next();

            while ((linea = br.readLine()) != null) {
              if(linea.indexOf(pasa) !=-1){
                   System.out.println("se encontro la palabra " + linea);
                  
              }

            }
        } catch (FileNotFoundException ex) {
            Logger.getLogger(EjercicioLemario.class.getName()).log(Level.SEVERE, null, ex);
        } catch (IOException ex) {
            Logger.getLogger(EjercicioLemario.class.getName()).log(Level.SEVERE, null, ex);
        }

    }

    public static void main(String[] args) {
        // TODO code application logic here
       new EjercicioLemario().cargaFicheroLemario();

    }
}