def promedioNotasDMP():
  print("Calculat Promedio final")
  #Datos de entrada
  examen1=float(input("Ingrese examen 1:"))
  examen2=float(input("Ingrese examen 2:"))
  examen3=float(input("Ingrese examen 3:"))
  #Proceso
  promedioFin=(examen1*0.25)+(examen2*0.25)+(examen3*0.50)
  #Datos de Salida
  print(f"Su promedio final es: {round(promedioFin,2)}")

promedioNotasDMP()