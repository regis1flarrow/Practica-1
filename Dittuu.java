public class Dittuu extends Personaje{

	public Dittuu(){
      super();
      this.representacion = "Dittuu";
	}

	@Override
	public void asignarHabilidadPersonaje(Habilidad habilidad)throws HabilidadInvalida{
       if(habilidad instanceof HabilidadDittu){
           this.habilidad = habilidad;
       }else{
           throw new HabilidadInvalida("Esta habilidad no es de Dittuu !! ");
       }
	}
	

}