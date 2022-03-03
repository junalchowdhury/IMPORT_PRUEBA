package Semana_2;

public class Proceso {
	private Venta[] ventas;
	
	public static void main(String[] args) {
		Proceso p = new Proceso();
		p.ventas = new Venta[2];
		
		Producto[] productos1 = new Producto[2];
		
		
		productos1[0] = new Producto();
		productos1[0].setCodigo(11);
		productos1[0].setNombre("pro11");
		productos1[0].setPrecio_unit(9);
		
		
		Producto pro12 = new Producto();
		pro12.setCodigo(12);
		pro12.setNombre("pro12");
		pro12.setPrecio_unit(10);
		productos1[1]=pro12;
		
		
		p.ventas[0]=new Venta();
		p.ventas[0].setProductos(productos1);
		
		
		
		Producto[] productos2 = new Producto[2];
		
		productos2[0] = new Producto();
		productos2[0].setCodigo(21);
		productos2[0].setNombre("pro21");
		productos2[0].setPrecio_unit(3);
		
		
		Producto pro22 = new Producto();
		pro22.setCodigo(22);
		pro22.setNombre("pro22");
		pro22.setPrecio_unit(4);
		productos2[1]=pro22;
		
		p.ventas[1] = new Venta();
		p.ventas[1].setProductos(productos2);
		
		double res=p.sumar_ventas();
		
		System.out.println(res);
		
	}
	
	public double sumar_ventas() {
		double suma=0D;
		
		for (int i = 0; i < this.ventas.length; i++) {
			for (int j = 0; j < this.ventas[i].getProductos().length; j++) {
				suma += this.ventas[i].getProductos()[j].getPrecio_unit();
			}
		}
		
		
		
		return suma;
		
	}
	
	
	

}
