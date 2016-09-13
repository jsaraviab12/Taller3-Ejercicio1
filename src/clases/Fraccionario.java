/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package clases;

/**
 *
 * @author Jesus
 */
public class Fraccionario {
  private int numerador;
  private int denominador;
  
  public Fraccionario(int numerador, int denominador)throws DenominadorCeroException{
  this.numerador=numerador;
  this.denominador=denominador;
  if (denominador==0) {
        throw new DenominadorCeroException();
        }
  }
  

    public int getNumerador() {
        return numerador;
    }

    public int getDenominador() {
        return denominador;
    }

    public void setNumerador(int numerador) {
        this.numerador = numerador;
    }

    public void setDenominador(int denominador) {
        this.denominador = denominador;
    }
    public Fraccionario sumar(Fraccionario f2)throws DenominadorCeroException{
       Fraccionario f;
        int num,den;
        
        num = (this.getNumerador() * f2.getDenominador()) + (this.getDenominador () * f2.getNumerador ());
        den = this.getDenominador() * f2.getDenominador ();
        f = new Fraccionario(num,den);
        return f;  
    }
    public Fraccionario restar(Fraccionario f2)throws DenominadorCeroException{
       Fraccionario f;
        int num,den;
        
        num = this.getNumerador() * f2.getDenominador () - this.getDenominador () * f2.getNumerador();
        den = this.getDenominador () * f2.getDenominador ();
        f = new Fraccionario(num,den);
        return f;  
  
    }
    public Fraccionario multiplicar(Fraccionario f2)throws DenominadorCeroException{
      Fraccionario f;
       int num,den;
        num = this.getNumerador() * f2.getNumerador();
       den = this.getDenominador () * f2.getDenominador ();
        f = new Fraccionario(num,den);
       return f;
    }
    public Fraccionario dividir(Fraccionario f2)throws DenominadorCeroException{
     Fraccionario f;
     int num, den;
     num = this.getNumerador() * f2.getDenominador () ;
     den = this.getDenominador () * f2.getNumerador() ;
     f = new Fraccionario(num,den);
     return f;
    }
     
    


}
