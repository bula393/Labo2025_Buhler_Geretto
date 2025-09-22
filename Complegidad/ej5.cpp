int sumarPotenciaHasta (int n) {
int res = 0;
int i = 1; 
while
( i < n ) {// o[log n]
res = res + i;// o[1]
 i = i * 2;// o[1]
}
return res;
}// o[log n]

