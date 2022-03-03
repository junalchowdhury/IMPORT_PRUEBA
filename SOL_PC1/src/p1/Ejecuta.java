package p1;

import java.util.ArrayList;
import java.util.List;

public class Ejecuta {
	public static void main(String[] args) {
		List<Empleado> lst = new ArrayList<>();
		
		ingresarDataPrefijada(lst);
		
		int nroEmp= lst.size();
        for(int i=0; i<nroEmp-1;i++){
            for(int j=i+1;j<nroEmp;j++){
                if(lst.get(i).equals(lst.get(j))){
                    System.out.println("empleados iguales encontradas");
                    // agregandole una excepción para validar, bastaba con el mensaje anterior
                    throw new RuntimeException("Empleados iguales");
                }
            }
        }

        for(Empleado e : lst){
            e.visualizaTodo();
        }
		
		
	}
	
	public static void ingresarDataPrefijada(List<Empleado> lst){
        //TODO: En caso no se quiera implementar la lectura por teclado
        Empleado e1 = new Empleado("Nestor", "Audante","44444444",1230.00f,20f,5,Empleado.TIPO_IR, EstadoCivil.SOLTERO, 0);
        Empleado e2 = new Empleado("Juan", "Rivadeneyra","44444411",2230.00f,20f,8,Empleado.TIPO_IR, EstadoCivil.CASADO, 2);
        Empleado e3 = new Empleado("Jorge", "Lopez","44444422",1250.00f,20f,10,Empleado.TIPO_IR, EstadoCivil.SOLTERO, 0);
        Empleado e4 = new Empleado("Rainer", "Torres","44444433",3230.00f,20f,6,Empleado.TIPO_IR, EstadoCivil.CASADO, 3);
        //Empleado e5 = new Empleado("Juan", "Apolaya","44444444",3230.00f,20f,6,Empleado.TIPO_IR, EstadoCivil.CASADO, 3);

        lst.add(e1);
        lst.add(e2);
        lst.add(e3);
        lst.add(e4);
        //lst.add(e5);
    }
	
	
	
	
	
	
	
	
	

}
