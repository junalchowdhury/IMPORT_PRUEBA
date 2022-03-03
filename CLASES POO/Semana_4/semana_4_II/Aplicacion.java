/**
 * 
 */
package semana_4_II;

/**
 * @author JUNAL
 *
 */
public class Aplicacion {
	
	class Junal{
		private String data;
		private String nombre;
		
		

		public String getData() {
			return data;
		}

		public void setData(String data) {
			this.data = data;
		}

		public String getNombre() {
			return nombre;
		}

		public void setNombre(String nombre) {
			this.nombre = nombre;
		}
		
	}
	
	
	public static void main(String[] args) {
		Aplicacion app = new Aplicacion();
		Junal junal = app.new Junal();
		Junal junal1 = new Aplicacion().new Junal();
		junal.setData("21");
		System.out.println(junal.getData());
	}
	
	
	
	
	

}
