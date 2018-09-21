#include "juego.h"
#include <iostream>
#include <string>
#include <cstdlib>
#include <vector>
#include <time.h>
#include <iomanip>
using namespace std;
juego::juego()
{
    //ctor
}


string palabra_original;
string palabra_mostrar;
int vidas;


void juego::principal(){

    inicializar();
    mostrar();
    while(vidas>0 && palabra_mostrar!=palabra_original){
        char x;
        cin>>x;
        system("cls");
        cout <<"============== JUEGO DEL AHORCADO ==========";
        ingresar(x);
        mostrar();
    }//fin while

   //INICIA IF 1, LÍNEA 26
    if(vidas>0){
        cout << "\n\n\nFELICIDADES GANASTE EL JUEGO !!!!"<<endl;
    }else{
        cout << "\n\n\nHAS PERDIDO, la palabra era: "<<palabra_original<<endl;
    }
    // TERMINA IF 1,LÍNEA 32


}




void juego::mostrar(){

    cout << endl<<endl;
    cout << "Vidas: "<<vidas<<endl;
    cout <<"\n\nque palabra es: \n\n";
    cout << setw(40)<<palabra_mostrar<<endl;
    cout <<"\n\nIngrese una letra ";
}




void juego::ingresar(char x){
    bool perdividas=true;

    for(int i=0; i<palabra_original.length(); i++){
        if(x==palabra_original[i]){
            perdividas=false;
            palabra_mostrar[i]=x;
        }
    }

    if(perdividas) vidas--;
}



void juego::inicializar(){
        vidas = 6;
        palabra_original=obtener_palabra_aleatoria();

    /*inicia for*/
        for(int i=0; i<palabra_original.length() ; i++){
        if(palabra_original[i]>='A' && palabra_original[i]<='Z'){
            palabra_original[i]+=32;
        }
    }

    //inicia segundo for
    for (int j=0; j<palabra_original.length() ; j++){
        if(palabra_original[j]>='a' && palabra_original[j]<='z'){

            palabra_mostrar+='*';
        }else{
            palabra_mostrar+=palabra_original[j];
        }
    }
}



string juego::obtener_palabra_aleatoria(){
  int dato;

    vector<string>palabras;
    palabras.push_back("programacion");
    palabras.push_back("monitor");
    palabras.push_back("murcielago");
    palabras.push_back("otorrinolaringologo");
    palabras.push_back("electricidad");

    srand(time(NULL));
    dato = 0 + rand()%(5);

    return palabras[dato];
}
