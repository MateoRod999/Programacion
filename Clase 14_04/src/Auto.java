public class Auto{
        private String make; //fabricante
        private String model; //modelo
        private int anio;   //año del auto
        private double kilometraje;  //kilometros que tiene el auto

        //metodo constructor
        public Auto (String make, String model, int anio, double kilometraje) {
            this.make = make;
            this.model = model;
            this.anio = anio;
            this.kilometraje = kilometraje;
        }
        public void mostrarInfo(){
            System.out.println("Fabricante:" +make+ " Modelo:" +model+ " Año:" +anio+ " Kilometros:"+kilometraje);
        }
}
