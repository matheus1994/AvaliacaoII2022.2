package aval20222.q1;

import model.Obra;
//o pacote aval20222.q1 significa que é a resposta da primeira questão.

public interface Conversor {
   public String converte(Obra obra);
   public Conversor clone();
}

//Essa é a primeira questão do trabalho, nós utilizamos o padrão prototype, onde temos a interface Conversor, onde as classes concretas ConversorJSON e ConversorXML implementam a interface Conversor. 
