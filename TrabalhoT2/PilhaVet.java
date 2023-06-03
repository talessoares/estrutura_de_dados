public class PilhaVet implements IPilha {

    private Object[] pilha;
    private int numElem;

    public PilhaVet(int tamanhoVetor) {
        this.pilha = new Object[tamanhoVetor];
        this.numElem = 0;
    }

    public boolean push(Object info) { // empilha
        if (this.numElem == pilha.length) {
            System.out.println("Pilha cheia!");
            return false;
        }
        this.pilha[this.numElem] = info;
        this.numElem++;
        return true;
    }

    public Object pop(){ //desempilha
        Object o = null;
        if(this.isEmpty()){
            System.out.println("Pilha vazia!");
            return null;
        }
        o = this.pilha[numElem - 1];
        this.pilha[numElem - 1] = null;
        this.numElem--;
        return o;
    }

    public boolean isEmpty(){
        return (this.numElem == 0);
    }

    public int size(){
        return this.numElem;
    }   

    public Object top(){
        if(this.isEmpty()){
            System.out.println("Pilha vazia!");
            return null;
        }
        return this.pilha[numElem - 1];
    }


    public boolean palindromo(String palavra) {
        int tamanho = palavra.length();

        for (int i = 0; i < palavra.length(); i++){
            this.push(palavra.charAt(i));
        }

        for (int i = 0; i < tamanho / 2; i++) {
            if (palavra.charAt(i) != palavra.charAt(tamanho - 1 - i)) {
                return false;
            }
        }
        return true;
    }
    
    
    

    public void estadoPilha() {
    if (isEmpty()) {
        System.out.println("Pilha vazia!");
        return;
    }

    System.out.println("Estado da pilha:");
    for (int i = numElem - 1; i >= 0; i--) {
        System.out.println(pilha[i].toString());
    }
}

    


}
