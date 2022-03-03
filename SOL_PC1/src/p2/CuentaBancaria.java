package p2;

import java.util.HashMap;
import java.util.Map;
import java.util.Objects;

public class CuentaBancaria {
	
	private long numeroCuenta;
	private long dni;
	private float saldoActual;
	private float interesAnual;
	private static long ultimoNroCuenta=100001;
	
	
	public CuentaBancaria() {
		super();
	}
	public CuentaBancaria(long dni, float saldoActual, float interesAnual) {
		super();
		this.dni = dni;
		this.saldoActual = saldoActual;
		this.interesAnual = interesAnual;
	}
	
	
	public void  actualizarSaldo(int nroDias) {
		float intDiario = this.interesAnual/360;
		this.saldoActual+=intDiario*nroDias;
	}
	
	public void ingresarSaldo(double monto) {
		this.saldoActual+=monto;
	}
	
	public void retirar(double monto) {
		if(this.saldoActual>0) {
			this.saldoActual-=monto;
		}
		else {
			System.out.println("Sin saldo");
			throw new RuntimeException("Sin saldo");
		}
	}
	
	
	
	
	

	
	@Override
	public String toString() {
		return "CuentaBancaria [numeroCuenta=" + numeroCuenta + ", dni=" + dni + ", saldoActual=" + saldoActual
				+ ", interesAnual=" + interesAnual + "]";
	}
	
	public void imprimirDetalle() {
		System.out.println(this);
	}
	
	public String formateaDni() {
		return this.dni+"-";
	}
	
	
	public char calcularLetra() {
		Map<Integer, Character> hm = new HashMap<>();
		hm.put(0, 'T');
		hm.put(1,'R');
        hm.put(2,'W');
        hm.put(3,'A');
        hm.put(4,'G');
        hm.put(5,'M');
        hm.put(6,'Y');
        hm.put(7,'F');
        hm.put(8,'P');
        hm.put(9,'D');
        hm.put(10,'X');
        hm.put(11,'B');
        hm.put(12,'N');
        hm.put(13,'J');
        hm.put(14,'Z');
        hm.put(15,'S');
        hm.put(16,'Q');
        hm.put(17,'V');
        hm.put(18,'H');
        hm.put(19,'L');
        hm.put(20,'C');
        hm.put(21,'K');
        hm.put(22,'E');
        int resto = (int) (this.dni%23);
		return hm.get(resto);
	}
	
	
	
	@Override
	public int hashCode() {
		return Objects.hash(dni, numeroCuenta);
	}
	@Override
	public boolean equals(Object obj) {
		if (this == obj)
			return true;
		if (obj == null)
			return false;
		if (getClass() != obj.getClass())
			return false;
		CuentaBancaria other = (CuentaBancaria) obj;
		return dni == other.dni && numeroCuenta == other.numeroCuenta;
	}
	
	
	
	public long getNumeroCuenta() {
		return numeroCuenta;
	}
	public void setNumeroCuenta(long numeroCuenta) {
		this.numeroCuenta = numeroCuenta;
	}
	public long getDni() {
		return dni;
	}
	public void setDni(long dni) {
		this.dni = dni;
	}
	public float getSaldoActual() {
		return saldoActual;
	}
	public void setSaldoActual(float saldoActual) {
		this.saldoActual = saldoActual;
	}
	public float getInteresAnual() {
		return interesAnual;
	}
	public void setInteresAnual(float interesAnual) {
		this.interesAnual = interesAnual;
	}
	public static long getUltimoNroCuenta() {
		return ultimoNroCuenta;
	}
	public static void setUltimoNroCuenta(long ultimoNroCuenta) {
		CuentaBancaria.ultimoNroCuenta = ultimoNroCuenta;
	}
}









