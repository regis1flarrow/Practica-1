public class Prueba{
	public static  void main(String[] args){

		Personaje megaman = new Megaman();
		Personaje kirby = new Kirby();
		Personaje dittuu = new Dittuu();

		HabilidadKirby k = () -> {System.out.println("se cumplio la habilidad de kirby");};
		HabilidadMegaman m = () -> {System.out.println("se cumplio la habilidad de megaman");};
        HabilidadDittu d = () -> {System.out.println("Se cumplio la habilidad de dittuu");};
		try{
			
			megaman.asignarHabilidadPersonaje(m);
			kirby.asignarHabilidadPersonaje(k);
			dittuu.asignarHabilidadPersonaje(d);

	     	megaman.aplicarHabilidadPersonaje();
            kirby.aplicarHabilidadPersonaje();
            dittuu.aplicarHabilidadPersonaje();
		}catch(HabilidadInvalida e){
			System.out.println(e);
		}


	}
}