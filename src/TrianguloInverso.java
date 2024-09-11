
public class TrianguloInverso {

	public static void main(String[] args) {
		int star=6;
		for (int i=star; i>0; i--) {   //inicializador; condicion; incremental; => identifica que el numero de filas sera desde 1 a 6
			for(int star2 = 0; star2<i; star2++) {
				System.out.print("*");//imprimir la cantidad de asteriscos por fila-- sin salto de linea()
			}//for
			System.out.println(); //aqui imprime el salto de linea despues de los asteriscos o estrellas

	}//for1

}//main
}//class TrianguloInverso
