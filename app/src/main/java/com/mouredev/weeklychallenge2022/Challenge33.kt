package com.mouredev.weeklychallenge2022

/*
 * Reto #33
 * CICLO SEXAGENARIO CHINO
 * Fecha publicación enunciado: 15/08/22
 * Fecha publicación resolución: 22/08/22
 * Dificultad: MEDIA
 *
 * Enunciado: Crea un función, que dado un año, indique el elemento y animal correspondiente
 * en el ciclo sexagenario del zodíaco chino.
 * - Información: https://www.travelchinaguide.com/intro/astrology/60year-cycle.htm
 * - El ciclo sexagenario se corresponde con la combinación de los elementos madera,
 *   fuego, tierra, metal, agua y los animales rata, buey, tigre, conejo, dragón, serpiente,
 *   caballo, oveja, mono, gallo, perro, cerdo (en este orden).
 * - Cada elemento se repite dos años seguidos.
 * - El último ciclo sexagenario comenzó en 1984 (Madera Rata).
 *
 * Información adicional:
 * - Usa el canal de nuestro Discord (https://mouredev.com/discord) "🔁reto-semanal" para preguntas, dudas o prestar ayuda a la comunidad.
 * - Tienes toda la información sobre los retos semanales en https://retosdeprogramacion.com/semanales2022.
 *
 */


year_init = 604

elementos = ('metal', 'agua', 'madera', 'fuego', 'tierra')

animales = ('mono', 'gallo', 'perro', 'cerdo', 'rata', 'buey', 'tigre', 'conejo', 'dragon', 'serpiente', 'caballo', 'oveja')

def calcularElemento(year):
    for year in range(year_init,year + 1):
        year_final = str(year)

        # Doc: https://www.thespruce.com/chinese-zodiac-sign-and-feng-shui-element-chart-1274894

        if year_final[-1] == '0' or year_final[-1] == '1':
            elemento = elementos[0]

        elif year_final[-1] == '2' or year_final[-1] == '3':
            elemento = elementos[1]

        elif year_final[-1] == '4' or year_final[-1] == '5':
            elemento = elementos[2]

        elif year_final[-1] == '6' or year_final[-1] == '7':  
            elemento = elementos[3]

        elif year_final[-1] == '8' or year_final[-1] == '9':
            elemento = elementos[4]

        else:
            print(f'No se cual es {year}')

    # Doc: https://www.travelchinaguide.com/intro/social_customs/zodiac/calculator.htm
    animal = (year % 12)

    print(f'Del de año {year} el elemento es: {elemento} y el animal: {animales[animal]}')

# test
calcularElemento(2022)
calcularElemento(1979)
calcularElemento(1977)