public class Megaman extends Personaje{

	public Megaman(){
      super();
      this.representacion = "Megaman";
	}

	@Override
	public void asignarHabilidadPersonaje(Habilidad habilidad)throws HabilidadInvalida{
       if(habilidad instanceof HabilidadMegaman){
           this.habilidad = habilidad;
       }else{
           throw new HabilidadInvalida("Esta habilidad no es de Megaman !! ");
       }
	}
	

}