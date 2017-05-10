from Stack import Stack
def evaluar_expresion(lista):
    p = Stack()
    for elemento in lista:
        x=elemento
        p.push(x)
        a1=p.pop()
        print a1
def main():
    lista=[]
    expression=raw_input("ingrese la expresion a evaluar: ")
    elementos=expression.split(' ')
    print elementos
    for elemento in elementos:
        if elemento=='+':
            lista=expression.split('+')
            lista.append('+')
        elif elemento=='-':
            lista=expression.split('-')
        elif elemento=='*':
            lista=expression.split('*')
        elif elemento=='/':
            lista=expression.split('/')
        elif elemento=='%':
            lista=expression.split('%')
    print lista
    print evaluar_expresion(lista)
