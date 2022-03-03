package p1;

import java.util.Objects;

enum EstadoCivil {
    SOLTERO,
    CASADO
}


public class Empleado {
	
	public static final float TIPO_IR= 20;
	
	
	
	private String nombre;
	private String apellido;
	private String dni;
	private float sueldobase;
	private float pagohoraextra;
	private int horaextrames;
	private float tipoIR;
	private EstadoCivil estadoCivil;
	private int nHijos;
	
	public Empleado(String dni){
		this.dni = dni;
	}
	
	public Empleado(){
	}

	public Empleado(String nombre, String apellido, String dni, float sueldobase, float pagohoraextra, int horaextrames,
			float porcentajeIR, EstadoCivil estadoCivil, int nHijos) {
		this.nombre = nombre;
		this.apellido = apellido;
		this.dni = dni;
		this.sueldobase = sueldobase;
		this.pagohoraextra = pagohoraextra;
		this.horaextrames = horaextrames;
		this.tipoIR = tipoIR;
		this.estadoCivil = estadoCivil;
		this.nHijos = nHijos;
	}

	public String getNombre() {
		return nombre;
	}

	public void setNombre(String nombre) {
		this.nombre = nombre;
	}

	public String getApellido() {
		return apellido;
	}

	public void setApellido(String apellido) {
		this.apellido = apellido;
	}

	public String getDni() {
		return dni;
	}

	public void setDni(String dni) {
		this.dni = dni;
	}

	public float getSueldobase() {
		return sueldobase;
	}

	public void setSueldobase(float sueldobase) {
		this.sueldobase = sueldobase;
	}

	public float getPagohoraextra() {
		return pagohoraextra;
	}

	public void setPagohoraextra(float pagohoraextra) {
		this.pagohoraextra = pagohoraextra;
	}

	public int getHoraextrames() {
		return horaextrames;
	}

	public void setHoraextrames(int horaextrames) {
		this.horaextrames = horaextrames;
	}

	public float getPorcentajeIR() {
		return tipoIR;
	}

	public void setPorcentajeIR(float tipoIR) {
		this.tipoIR = tipoIR;
	}

	public EstadoCivil getEstadoCivil() {
		return estadoCivil;
	}

	public void setEstadoCivil(EstadoCivil estadoCivil) {
		this.estadoCivil = estadoCivil;
	}

	public int getnHijos() {
		return nHijos;
	}

	public void setnHijos(int nHijos) {
		this.nHijos = nHijos;
	}
	
	
	
	public float retenciones(){
        float pjeRetenc = this.tipoIR;
        if(estadoCivil.CASADO.equals(estadoCivil)){
            pjeRetenc -=2;
        }

        if(this.nHijos>0){
            pjeRetenc -=1;
        }
        return this.sueldoBruto()*(pjeRetenc/100);
    }
	
	
	
	
	public float montoHorasExtras() {
		return pagohoraextra*horaextrames;
	}
	public float sueldoBruto() {
		return this.sueldobase+montoHorasExtras();
	}
	public float sueldoNeto() {
		return sueldoBruto()-retenciones();
	}
	
	
	public String visualizaEmpleado() {
		return this.toString();
	}

	
	public void visualizaTodo() {
		 String dato= visualizaEmpleado() +" Sueldobase=" + sueldobase
				+ ", Monto horas extra = " + montoHorasExtras() + ", Suelo bruto" + sueldoBruto() + ", retencion de impuesto a la renta="
				+ retenciones() + ", Sueldo neto= " + sueldoNeto() + "]";
		 System.out.println(dato);
	}

	@Override
	public boolean equals(Object o) {
		// TODO Auto-generated method stub
		if (this == o) return true;
        if (o == null || getClass() != o.getClass()) return false;
        Empleado empleado = (Empleado) o;
		return Objects.equals(dni, empleado.dni);
	}

	@Override
	public int hashCode() {
		// TODO Auto-generated method stub
		return Objects.hashCode(dni);
	}

	@Override
	public String toString() {
		return "Empleado [nombre=" + nombre + ", apellido=" + apellido + ", dni=" + dni + ", estadoCivil=" + estadoCivil
				+ ", nHijos=" + nHijos + "]";
	}

	
	
	
	
	
	
	
	
	

}
