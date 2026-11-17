// Supongamos que tenemos:
List<String> lista = new ArrayList<>(); // ["Ana", "Bruno", "Carlos"]
Set<String> conjunto = new HashSet<>(); // ["Rojo", "Verde"]

// =========================================================================
// 1. ITERATOR (Sirve para List y Set — SOLO va hacia ADELANTE)
// =========================================================================
Iterator<String> it = conjunto.iterator(); // También sirve lista.iterator()

while (it.hasNext()){
    
    String elem = it.next();   // Avanza: "Rojo" -> "Verde"
    // it.remove();            // Permite borrar de forma segura

}
// No tiene hasPrevious() ni previous(). Una vez que llega al final, terminó.

// =========================================================================
// 2. LISTITERATOR (SOLO para List — Va hacia ADELANTE y hacia ATRÁS)
// =========================================================================

// A) Arrancando desde el principio (posición 0) -> va hacia ADELANTE:
ListIterator<String> listIt = lista.listIterator();

while(listIt.hasNext()){
    
    String elem = listIt.next(); // Avanza: "Ana" -> "Bruno" -> "Carlos"
    
}

// Como el cursor ya quedó al final, ahora puede pegar la vuelta hacia ATRÁS:
while (listIt.hasPrevious()){
    
    String elem = listIt.previous(); // Retrocede: "Carlos" -> "Bruno" -> "Ana"
    
}

// B) Arrancando directamente desde el final -> va directo hacia ATRÁS:
ListIterator<String> itReversa = lista.listIterator(lista.size());

while(itReversa.hasPrevious()){
    
    String elem = itReversa.previous(); // Retrocede: "Carlos" -> "Bruno" -> "Ana"
    
}

/*-----------------------------------------------------------------------------*/

/*
En resumen para la hoja del parcial:
    - Iterator: coleccion.iterator() => funciona en List y Set, solo avanza (hasNext() / next())
    - ListIterator: lista.listIterator() => funciona solo en List, avanza y retrocede (hasPrevious() / previous())
*/