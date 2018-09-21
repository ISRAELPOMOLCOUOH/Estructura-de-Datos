#ifndef OPERACIONES_H
#define OPERACIONES_H


class operaciones
{
    public:
        operaciones();

        int Getnumero() { return numero; }
        void Setnumero(int val) { numero = val; }
        int Getpos() { return pos; }
        void Setpos(int val) { pos = val; }

        int lista(int conjuntoA[], int conjuntoB[]);
        void ConjuntoVacio();
        int AnadirElemento(int conjunto[]);
        int PerteneceAlConjunto(int conjunto[]);
        int RetirarElemento(int conjunto[]);
        int Union(int conjuntoA[], int conjuntoB[]);
        int Interseccion(int conjuntoA[], int conjuntoB[]);
        int Diferencia(int conjuntoA[], int conjuntoB[]);

    protected:

    private:
        int numero;
        int pos;
};

#endif // OPERACIONES_H
