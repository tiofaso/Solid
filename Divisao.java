package src;

public class Divisao extends src.Calculadora {

    public Divisao(double num1, double num2, double resultado){
        super(num1,num2,resultado);
    }
    public double operacao(){
        resultado = num1 / num2;
        return this.resultado;
    }

}
