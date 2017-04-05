L='ABCDEFGHIJKLMNOPQRSTUVWXYZ'
X='middle-Outz'.upper()
C=2
Texto_cifrado=''

for letra in X:
    if letra == "-":
        Texto_cifrado += "-"
    else:
        Operacion=L.find(letra)+C
        Modulada=int(Operacion)%26
        Texto_cifrado= Texto_cifrado+str(L[Modulada])

print Texto_cifrado
