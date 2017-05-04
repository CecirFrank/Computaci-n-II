import math
class Point:
    def __init__(self,x,y):
        self.move(x,y)
    def move(self,x,y):
        self.x=x
        self.y=y
    def reset(self):
        self.move(0,0)
    def calculate_distance(self,otherPoint):
        distancia=math.sqrt(pow(otherPoint.x-self.x,2)+
        pow(otherPoint.y-self.y,2))
        print distancia
arr_p1=[[2,5],[5,3],[32,66]]
arr_p2=[[14,2],[45,5],[32,33]]
for i in range(len(arr_p1)):
    p1=Point(arr_p1[i][0],arr_p1[i][1])
    p2=Point(arr_p2[i][0],arr_p2[i][1])
    print "Distancia:"
    print p1.calculate_distance(p2)
    print "Punto 1:"
    print (p1.x,p1.y)
    print "Punto 2:"
    print (p2.x,p2.y)
    print " "
