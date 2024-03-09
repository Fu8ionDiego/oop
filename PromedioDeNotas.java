import java.io.BufferedReader;
import java.io.IOException;
import java.io.InputStreamReader;
import java.io.PrintStream;

static BufferedReader in = new BufferedReader(new InputStreamReader(System.in));
static PrintStream out = System.out;

static int leerOpcion() throws IOException{
    out.println("Digite la opcion");
    return Integer.parseInt(in.readLine());
}

static void imprimirMensaje(String msj){
    out.println(msj);
}

static String leerTexto() throws IOException{
    return in.readLine();
}

static double calcularPromedio(double [] notas){
    double promedio = -1;
    double sumatoria = 0;

    for(int i=0; i< notas.length; i++){
        sumatoria = sumatoria + notas[i];
    }
    promedio = sumatoria/notas.length;
    return promedio;
}

static double[] solicitarNotas() throws IOException{
    //TODO: solicitar la cantidad de examenes o notas al usuario
    double notas[] = new double[3];
    for(int i = 0; i<notas.length; i++){
        imprimirMensaje("Digite la nota del examen numero " + (i+1));
        notas[i] = Integer.parseInt(leerTexto);
        ;
    }
    return notas;
}

static String definirResultado(double nota){
    if(nota<70){
        if(nota<600){
            return "El estudiate perdio el curso con una nota de " + nota;
        } else {
            return "El estudiate debe de ir ampliacion con una nota de " + nota;
        }
    } else {
        return "El estudiate aprobo el curso con una nota de " + nota;
    }
}