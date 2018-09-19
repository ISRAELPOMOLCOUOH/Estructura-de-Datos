#include <iostream>
#include "natural.h"
using namespace std;
#include <stdlib.h>
int main()
{

    int numeros[5];

    cout <<"ingrese de 1 a 5 numeros que sean mayores a 0\n";
    for(int i=0; i<=4; i++){
    cin >>numeros[i];
        if (numeros[i]<0)
        {
            cout<<"el numero que ingresaste debe ser Mayor a cero "<<endl;
            i--;
        }
    }
    system("cls");
    natural nat;
    cout <<"\n==== ANTECESORES ====\n";
    nat.antecesor(numeros);
    cout<<"\n==== SUCESOR ====\n";
    nat.sucesor(numeros);
    cout<<"\n==== SUMA ====\n";
    cout <<"la suma es: "<<nat.suma(numeros);
    cout <<"\n===MENOR===\n";
    cout <<"\nel numero menor es: "<<nat.menor(numeros);

    return 0;
}
