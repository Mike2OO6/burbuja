using System;
using System.Collections.Generic;

class Program
{
    static void Main()
    {
        var rnd = new Random();
        char opcion;

        do
        {
            var numeros = new List<int>();
            while (numeros.Count < 4)
            {
                int num = rnd.Next(1, 100);
                if (!numeros.Contains(num))
                {
                    numeros.Add(num);
                }
            }

            Console.Write("Lista original: ");
            numeros.ForEach(n => Console.Write(n + " "));
            Console.WriteLine();


            bool swapped = true;
            while (swapped)
            {
                swapped = false;
                for (int i = 0; i < numeros.Count - 1; i++)
                {
                    if (numeros[i] > numeros[i + 1])
                    {
                       
                        int temp = numeros[i];
                        numeros[i] = numeros[i + 1];
                        numeros[i + 1] = temp;
                        swapped = true;
                    }
                }
            }

            Console.Write("Lista ordenada: ");
            numeros.ForEach(n => Console.Write(n + " "));
            Console.WriteLine();

            
            Console.Write("¿Quieres generar y ordenar otra lista? (S/N): ");
            opcion = Console.ReadLine()[0];
        }
        while (char.ToLower(opcion) == 's');
    }
}

