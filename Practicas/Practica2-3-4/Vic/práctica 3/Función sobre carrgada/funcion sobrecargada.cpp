#include <iostream>
using namespace std;
int volumen(int);
double volumen(double,int);
long volumen(long,int,int);
int main(){
	int n;
	cout <<"Ingrese el valor s\n";
	cin >> n;
	cout << "El volumen del cubo es: "<< volumen(n) << "\n";
	cout << "El volumen del prisma es: "<< volumen(2.5,8) << "\n" ;
	cout << "El volumen del prisma es: "<< volumen(100,75,15) << "\n" ;
return 0;
}

int volumen(int s){
	return(s*s*s);
}

double volumen(double r, int h){
	return(3.14519*r*r*h);
}

long volumen(long l, int b,int h){
	return(l*b*h);
}

