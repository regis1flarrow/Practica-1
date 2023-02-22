public class Kirby extends Personaje{

	public Kirby(){
      super();
      this.representacion = "Kirby";
	}

	@Override
	public void asignarHabilidadPersonaje(Habilidad habilidad)throws HabilidadInvalida{
       if(habilidad instanceof HabilidadKirby){
           this.habilidad = habilidad;
       }else{
           throw new HabilidadInvalida("Esta habilidad no es de Kirby !! ");
       }
	}



}