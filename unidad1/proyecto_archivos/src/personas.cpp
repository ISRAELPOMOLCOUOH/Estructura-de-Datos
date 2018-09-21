#include "personas.h"
#include <string.h>
#include <iostream>
#include <stdlib.h>
using namespace std;
personas::personas()
{
    //ctor
}


void personas::ordenarNombres(char nom[16][16]){
    int i,j;
    char aux[16];
    for(i =0; i<16; i++){
        for(j=0; j<15; j++){
            if(strcmp(nom[j],nom[j+1]) >0){//el strcmp sirve para comparar, en este caso esta comparando si la palabra 1 es mayor a la palabra que le sigue
                strcpy(aux,nom[j]);//el strcpy sirve para igualar caracteres es lo mismo que escribir aux=nom[j]
                strcpy(nom[j] , nom[j+1]);
                strcpy(nom[j+1] , aux);

            }
        }
    }
    for(i=0; i<16; i++){
        cout <<nom[i]<<endl;
    }
}


void personas::buscarNombres(char nom[16][16]){
    string buscar;
    bool algo ='f';
    cout <<"\nIntroduzca el nombre de la persona que desea buscar: ";
    cin >>buscar;
    for(int i=0; i<16; i++){
        if(buscar==nom[i]){
            cout <<"el nombre "<<nom[i]<<" si se encuentra en la lista en la posicion  "<<i+1;
            algo = 'v';
        }
    }

    if(algo!= 'v'){
       cout <<"no existe";
    }

}
