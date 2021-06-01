public class Data {
    int dia;
    int mes;
    int ano;

    Data(){
        dia = 1;
        mes = 1;
        ano = 1;
    }
    Data(int ano){
        dia = 1;
        mes = 1;
        this.ano = ano;
    }
    Data(int dia, int mes,int ano){
        this.dia = dia;
        this.mes = mes;
        this.ano = ano;
    }
    String formatarData(){
        return ""+this.dia+"-"+this.mes+"-"+this.ano;
    }
}
