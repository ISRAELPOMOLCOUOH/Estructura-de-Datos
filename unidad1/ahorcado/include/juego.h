#ifndef JUEGO_H
#define JUEGO_H
#include <cstdlib>
#include <vector>
#include <time.h>
#include <iostream>
#include <string>
using namespace std;

class juego
{
    public:
        juego();

        void principal();

        void mostrar();//orientar a objetos
        void ingresar(char x);//orientar a objetos;
        void inicializar();
        string obtener_palabra_aleatoria();

    protected:

    private:
};

#endif // JUEGO_H
