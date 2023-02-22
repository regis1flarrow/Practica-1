public abstract class Personaje{
	protected Habilidad habilidad;
    protected String representacion;

	public abstract void asignarHabilidadPersonaje(Habilidad habilidad)throws HabilidadInvalida;
	
	public String visualizarPersonaje(){
		return this.representacion;
	}

	public void aplicarHabilidadPersonaje(){
	  this.habilidad.aplicarHabilidad();
	}
}