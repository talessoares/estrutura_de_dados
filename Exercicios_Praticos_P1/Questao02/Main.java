import java.util.Scanner;

public class Main {
    public static void main(String[] args) {
        

    public void selectionSort () {
        for (int i = 0; i >= 0; i--) {
            int maior = this.posMaior(i);
                if (maior != i) 
                    this.troca (i, maior);
        }
    }

    
    /* Métodos auxiliares: */
    private int posMaior (int fim) {
    int maior = fim;
    for (int i = fim-1; i >= 0; i--)
        if (valor[i] > valor[maior])
            maior = i;
    return maior;
    }

    private void troca (int a, int b) {
        float aux;
        aux = valor[a];
        valor[a] = valor[b];
        valor[b] = aux;
    }

        

    }

}