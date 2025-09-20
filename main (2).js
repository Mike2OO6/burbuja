function generarListaAleatoria() {
    let numeros = [];
    while (numeros.length < 4) {
        let num = Math.floor(Math.random() * 99) + 1;
        if (!numeros.includes(num)) {
            numeros.push(num);
        }
    }
    return numeros;
}

function bubbleSort(lista) {
    let swapped;
    do {
        swapped = false;
        for (let i = 0; i < lista.length - 1; i++) {
            if (lista[i] > lista[i + 1]) {
                [lista[i], lista[i + 1]] = [lista[i + 1], lista[i]];
                swapped = true;
            }
        }
    } while (swapped);
    return lista;
}

function iniciar() {
    let continuar = true;
    while (continuar) {
        let lista = generarListaAleatoria();
        console.log("Lista original:", lista);
        let ordenada = bubbleSort([...lista]);
        console.log("Lista ordenada:", ordenada);

        let respuesta = prompt("¿Quieres generar y ordenar otra lista? (S/N): ");
        if (!respuesta || respuesta.toLowerCase() !== "s") {
            continuar = false;
        }
    }
}

iniciar();


