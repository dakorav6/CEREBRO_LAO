from django.http import HttpResponse

from django.template import loader

import datetime
def saludo (request,nombre,apellido):
     plantilla=loader.get_template('hola.html') #cargamos la plantilla 
     contexto={'nombre_persona':nombre , 'apellido':apellido , 'list_games':['dark soul','valorant', 'wow','pokemon']   } #creamos el diccionario de contexto 
     return HttpResponse(plantilla.render(contexto))

def fechaActual(request):
    fecha_actual=datetime.datetime.now()
    documento= f'La fecha y hora actual es {fecha_actual}'
    return HttpResponse (documento)

def calculaEdad(request, agno):
    parametro=int(agno)-2025+29   
    documento=f'Tu edad actual es:{parametro}'
    return HttpResponse(documento)