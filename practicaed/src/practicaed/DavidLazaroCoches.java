package practicaed;

public class DavidLazaroCoches {
	public String marca;
	public String modelo;
	public int cv;
	public int precio;
	
	public DavidLazaroCoches(String marca,String modelo,int cv, int precio) {
		super();
		this.marca=marca;
		this.modelo=modelo;
		this.cv=cv;
		this.precio=precio;
	}
	
	// Getter para la variable marca
    public String getMarca() {
        return marca;
    }
    
 // Setter para la variable marca
    public void setMarca(String marca) {
        this.marca = marca;
    }
    
 // Getter para la variable modelo
    public String getModelo() {
        return modelo;
    }
    
 // Setter para la variable modelo
    public void setModelo(String modelo) {
        this.modelo = modelo;
    }
    
 // Getter para la variable cv
    public int getCv() {
        return cv;
    }
    
 // Setter para la variable cv
    public void setCv(int cv) {
        this.cv = cv;
    }
    
 // Getter para la variable precio
    public int getPrecio() {
        return precio;
    }
    
 // Setter para la variable precio
    public void setPrecio(int precio) {
        this.precio = precio;
    }
}
