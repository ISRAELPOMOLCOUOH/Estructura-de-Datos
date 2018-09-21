#include <iostream>
#include <fstream>
#include <string.h>
#include <stdlib.h>
#include "personas.h"
using namespace std;

int main()
{
    ifstream archivo;
     char seg;
    char  nom[16][16];

    archivo.open("nombres.txt", ios::in);


    do{
        int i = 0;
        while(!archivo.eof()){

        archivo >>nom[i];

        i=i+1;
        }
        cout <<"======== LISTA DE NOMBRES ========\n\n";
        for(int i=0; i<=15; i++){
       cout <<nom[i]<<endl;
        }
        personas pe;
        int op;
        cout <<"\n\n1.- Ordenar los nombres ";
        cout <<"\n2.- Buscar un nombre ";
        cout <<"\ningrese el numero de opcion que desea ejecutar: ";
        cin >>op;
        if(op == 1){
            system("cls");
            cout <<"======== LISTA DE NOMBRES ORDENADOS========\n\n";
             pe.ordenarNombres(nom);
        }else{
            if(op == 2){
                system("cls");
                pe.buscarNombres(nom);
            }else{
                if(op != 1 && 2){
                    cout <<"numero invalido\n";
                }
            }
        }
    cout <<"\n\n\n";
    system("pause");
    system("cls");
    cout <<"desea realizar otra operacion s/n : ";
    cin >>seg;
    system("cls");

    }while(seg == 's');


    archivo.close();


    return 0;
}



