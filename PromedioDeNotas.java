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