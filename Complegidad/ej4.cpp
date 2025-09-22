/*vector hacerAlgo (vector &v) {
vector res ;//O[1]
for (int i = 0; i < 100; i ++) {
res . push_back (contarApariciones (v , i +1) ); //o[n]
}
return res ;//O[1]
}
int contarApariciones (vector &v , int elem ) {
int cantAp = 0;
for (int i = 0; i < v . size (); i ++) {// O[n]
if ( v [ i ] == elem ) {// O[1]
cantAp ++;
}
}
return cantAp ;// O[1]
}
*/