package p2;

import java.util.ArrayList;
import java.util.List;

public class Ejecutable {
	public static void main(String[] args) {
		
		
		CuentaBancaria cb1 = new CuentaBancaria(42123451, 12000.5f,0.1f);
        cb1.ingresarSaldo(100);
        cb1.ingresarSaldo(50);
        cb1.retirar(30);
        //ponemos los dias que la cuenta lleva creada, asumimos en cada caso pues no no los indican
        cb1.actualizarSaldo(50);
        cb1.imprimirDetalle();
        CuentaBancaria cb2 = new CuentaBancaria(42123452, 14000.5f,0.12f);
        cb2.ingresarSaldo(100);
        cb2.ingresarSaldo(50);
        cb2.retirar(60);
        cb2.actualizarSaldo(20);
        cb2.imprimirDetalle();
        CuentaBancaria cb3 = new CuentaBancaria(42123453, 18000.5f,0.12f);
        cb3.ingresarSaldo(120);
        cb3.ingresarSaldo(50);
        cb3.retirar(80);
        cb3.actualizarSaldo(20);
        cb3.imprimirDetalle();
        CuentaBancaria cb4 = new CuentaBancaria(42123454, 17000.5f,0.11f);
        cb4.ingresarSaldo(100);
        cb4.ingresarSaldo(50);
        cb4.retirar(30);
        cb4.actualizarSaldo(50);
        cb4.imprimirDetalle();
        CuentaBancaria cb5 = new CuentaBancaria(42123455, 11000.5f,0.13f);
        cb5.ingresarSaldo(100);
        cb5.ingresarSaldo(50);
        cb5.retirar(30);
        cb5.actualizarSaldo(60);
        cb5.imprimirDetalle();
        CuentaBancaria cb6 = new CuentaBancaria(42123456, 15600.5f,0.14f);
        cb6.ingresarSaldo(50);
        cb6.ingresarSaldo(30);
        cb6.retirar(200);
        cb6.actualizarSaldo(80);
        cb6.imprimirDetalle();
		
		List<CuentaBancaria> lstCta = new ArrayList<>();
		lstCta.add(cb1);
		lstCta.add(cb2);
		lstCta.add(cb3);
		lstCta.add(cb4);
		lstCta.add(cb5);
		lstCta.add(cb6);
		
		int nroCta = lstCta.size();
		
		for (int i = 0; i < nroCta-1; i++) {
			for(int j=i+1;j<nroCta;j++){
                if(lstCta.get(i).equals(lstCta.get(j))){
                    System.out.println("cuentas iguales encontradas");
                    // agregandole una excepción para validar, bastaba con el mensaje anterior
                    throw new RuntimeException("Cuentas iguales");
                }
            }
		}
		float montoTotal = 0.0f;
        float mayorSaldo = -1;
        CuentaBancaria ctaMayorSaldo = null;

        for(CuentaBancaria cb: lstCta){
            montoTotal += cb.getSaldoActual();
            if(cb.getSaldoActual()>mayorSaldo){
                mayorSaldo = cb.getSaldoActual();
                ctaMayorSaldo = cb;
            }
        }

        System.out.println("Saldo promedio de las cuentas: "+montoTotal/nroCta);
        System.out.println("Cuenta con mayor saldo: DNI: ["+ctaMayorSaldo.formateaDni()+
                "], numero de cuenta: ["+ctaMayorSaldo.getNumeroCuenta()+"], saldo actual ["
                +ctaMayorSaldo.getSaldoActual()+"]");
		
		
		
		
		
		
		
		
		
		
		
		
		
		
	}
	
	
	
	
	
	
	
	

}
