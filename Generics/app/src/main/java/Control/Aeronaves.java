package Control;

import java.util.ArrayList;
import java.util.List;

/*Classe genérica
Usada para instanciar objetos de diferentes tipos
Ao invés de ficar criando várias listas de diferentes tipos, criamos uma do tipo genérico
Assim ao criarmos um objeto dessa lista, basta colocar o tipo que queremos(não pode ser primitivo)
*/
public class Aeronaves<T> {
    private List<T> listaAeronaves = new ArrayList<>();
    
    ///método que adiciona um voo na lista
    public void addVoo(T nrVoo){
        listaAeronaves.add(nrVoo);
    }
    
    ///método que informa o primeiro voo pegando a primeira aeronave da lista
    public T primeiroVoo(){
        if (listaAeronaves.isEmpty()){
            System.out.println("Lista vazia");
        }
            return listaAeronaves.get(0);
    }
    
    ///método que imprime uma lista de voos.
    public void listaVoos(){
        System.out.print("[");
        if (!listaAeronaves.isEmpty()){
            System.out.print(listaAeronaves.get(0));
        }
        
        ///usa o size no for pq ai percorre toda a lista.
        for (int i = 1; i < listaAeronaves.size() ; i++){
            System.out.print(" " + listaAeronaves.get(i));
        } System.out.print("]");
    }
    
}
