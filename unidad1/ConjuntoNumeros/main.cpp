#include <iostream>
#include <stdlib.h>
#include <string>
#include <operaciones.h>
#include <iomanip>
using namespace std;

int main()
{
        int num = 10;
    int conjuntoA[num];
    int conjuntoB[num];
    cout <<"====== CONJUNTO DE NUMEROS ======\n\n";

    cout << "nota: solamente pude ingresar 10 nuumeros mayores a 0"<< endl;

    cout << "\n\ningrese los numeros para el conjunto A\n"<< endl;
    for(int i=0; i<num; i++){
        cin >> conjuntoA[i];
        cout << "\n";
    }
    system("cls");
    cout << "\ningrese loa numeros para el conjunto B\n"<< endl;
    for(int j=0; j<num; j++){
        cin >> conjuntoB[j];
        cout << "\n";
    }

    char a;
do{
    system("cls");

    operaciones oper;


    oper.lista(conjuntoA, conjuntoB);
    system("pause");
    system("cls");
    int op;
    cout << "\nLISTA DE OPERACIONES DE LOS CONJUNTOS\n"<< endl;
    cout << "\n1. UNION \n"<< endl;
    cout << "2. INTERSECCION \n"<< endl;
    cout << "3. DIFERNCIA SIMETRICA \n"<< endl;
    cout << "4. PERTENECE NUMERO \n"<< endl;
    cout << "5. RETIRAR NUMERO \n"<< endl;
    cout << "6. AÑADIR NUMERO \n"<< endl;
    cout << "7. CONJUNTO VACIO \n"<< endl;
    cout <<"\n\nIngrese el numero que desea ejecutar.......";
    cin >> op;
    switch(op){

    case 1:
        system("cls");
            cout << "\n1. UNION \n"<< endl;
            cout << "\nLA UNION ES\n"<< endl;
            oper.Union(conjuntoA, conjuntoB);
    break;
    case 2:
        system("cls");
            cout << "\n2. INTERSECCIÓN \n"<< endl;
            cout << "\nLA INTERSECCIÓN ES\n"<< endl;
            oper.Interseccion(conjuntoA, conjuntoB);
    break;
    case 3:
        system("cls");
        cout << "\n3. DIFERNCIA \n"<< endl;

        oper.Diferencia(conjuntoA, conjuntoB);
    break;
    case 4:
        system("cls");
        int c;
        cout << "\n4. PERTENECE NUMERO \n"<< endl;
        cout << "\n1. CONJUNTO A \n"<< endl;
        cout << "\n2. CONJUNTO B \n"<< endl;
        cin >> c;
        if(c==1){
            int a;
            cout << "\NUMERO QUE QUIERE BUCAR \n"<< endl;
            cin >> a;
            oper.Setnumero(a);
            oper.PerteneceAlConjunto(conjuntoA);
        }else{
            int b;
            cout << "\NUMERO QUE QUIERE BUCAR \n"<< endl;
            cin >> b;
            oper.Setnumero(b);
            oper.PerteneceAlConjunto(conjuntoB);
        }
    break;
    case 5:
        system("cls");

        cout << "\n5. RETIRAR NUMERO \n"<< endl;
        cout << "\n1. CONJUNTO A \n"<< endl;
        cout << "\n2. CONJUNTO B \n"<< endl;
        cin >> c;
        if(c==1){
            int a;
            cout << "\nINTRODUZCA EL NUMERO A RETIRAR \n"<< endl;
            cin >> a;
            oper.Setnumero(a);
            oper.RetirarElemento(conjuntoA);
        }else{
            int x;
            cout << "\nINTRODUZCA EL NUMERO A RETIRAR \n"<< endl;
            cin >> x;
            oper.Setnumero(x);
            oper.RetirarElemento(conjuntoB);
            }
            break;
    case 6:
        system("cls");

        cout << "6. AÑADIR NUMERO \n"<< endl;
        cout << "\n1. CONJUNTO A \n"<< endl;
        cout << "\n2. CONJUNTO B \n"<< endl;
        cin >> c;
        if(c==1){
            int a,z;
            cout << "\nINTRODUZCA EL NUMERO A ANADIR \n"<< endl;
            cin >> a;
            oper.Setnumero(a);
            cout << "\nINTRODUZCA LA POSICIÓN EN LA QUE LO DESEA \n"<< endl;
            cin >> z;
            oper.Setpos(z);
            oper.AnadirElemento(conjuntoA);
        }else{
            int a,z;
            cout << "\nINTRODUZCA EL NUMERO A ANADIR \n"<< endl;
            cin >> a;
            oper.Setnumero(a);
            cout << "\nINTRODUZCA LA POSICIÓN EN LA QUE LO DESEA \n"<< endl;
            cin >> z;
            oper.Setpos(z);
            oper.AnadirElemento(conjuntoB);
            }
            break;
    case 7:
        system("cls");

        cout << "7. CONJUNTO VACIO \n"<< endl;
        oper.ConjuntoVacio();
        break;
    }
    cout << "\n\n Desea realizar otra peracion (S/N)"<< endl;
    cin>> a;
    }while(a=='S'||a=='s');

    return 0;
}
