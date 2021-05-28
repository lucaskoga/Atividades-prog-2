public class Lampada{
  boolean acesa;

  void acender(){
    acesa = true;
  }

  	void apagar(){
    acesa = false;

  }

  void mostrarEstado(){
    	if(acesa == true){
        System.out.println("acesa");
      }
      else if(acesa == false){
        System.out.println("apagada");
      }
  }
}
