package Control;

import java.util.ArrayList;
import java.util.List;

/*Classe gen�rica
Usada para instanciar objetos de diferentes tipos
Ao inv�s de ficar criando v�rias listas de diferentes tipos, criamos uma do tipo gen�rico
Assim ao criarmos um objeto dessa lista, basta colocar o tipo que queremos(n�o pode ser primitivo)
*/
public class Aeronaves<T> {
    private List<T> listaAeronaves = new ArrayList<>();
    
    ///m�todo que adiciona um voo na lista
    public void addVoo(T nrVoo){
        listaAeronaves.add(nrVoo);
    }
    
    ///m�todo que informa o primeiro voo pegando a primeira aeronave da lista
    public T primeiroVoo(){
        if (listaAeronaves.isEmpty()){
            System.out.println("Lista vazia");
        }
            return listaAeronaves.get(0);
    }
    
    ///m�todo que imprime uma lista de voos.
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
