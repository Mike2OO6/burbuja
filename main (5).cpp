#include <iostream>
#include <vector>
#include <cstdlib>   
#include <ctime>     
using namespace std;

int main() {
    char opcion;
    srand(time(0));

    do {
        
        vector<int> numeros;
        while (numeros.size() < 4) {
            int num = rand() % 99 + 1; // Entre 1 y 99
            bool repetido = false;
            for (int n : numeros) {
                if (n == num) {
                    repetido = true;
                    break;
                }
            }
            if (!repetido) {
                numeros.push_back(num);
            }
        }

        cout << "Lista original: ";
        for (int n : numeros) {
            cout << n << " ";
        }
        cout << endl;

        
        bool swapped = true;
        while (swapped) {
            swapped = false;
            for (size_t i = 0; i < numeros.size() - 1; ++i) {
                if (numeros[i] > numeros[i + 1]) {
                    swap(numeros[i], numeros[i + 1]);
                    swapped = true;
                }
            }
        }

        cout << "Lista ordenada: ";
        for (int n : numeros) {
            cout << n << " ";
        }
        cout << endl;

        cout << "¿Quieres generar y ordenar otra lista? (S/N): ";
        cin >> opcion;

    } while (tolower(opcion) == 's');

    return 0;
}
