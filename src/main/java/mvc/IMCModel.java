package mvc;

public class MaiorMenorModel {

	/*public static boolean maiorDeIdade(int idade) {
		return idade >= 18;
	}*/
        
        public static float calcularImc(float peso, float altura){
            return peso/(altura*altura);
        }
           
        public static String resultado(float imc, String sexo){
                if(sexo.equals("masculino")){
                    if(imc<=20.7){
                        return "Seu IMC: Abaixo do peso";
                    }
                    else if(imc>20.7 && imc<=26.4){
                        return "Seu IMC: Peso normal";
                    }
                    else if(imc>26.4 && imc<=27.8){
                        return "Seu IMC: Leve sobrepeso";
                    }
                    else if(imc>27.8 && imc<=31.1){
                        return "Seu IMC: Acima do peso ideal";
                    }
                    else if(imc>31.1){
                        return "Seu IMC: Obeso";
                    } 
                }
                else{
                    if(imc<=19.1){
                        return "Seu IMC: Abaixo do peso";
                    }
                    else if(imc>19.1 && imc<=25.8){
                        return "Seu IMC: Peso normal";
                    }
                    else if(imc>25.8 && imc<=27.3){
                        return "Seu IMC: Leve sobrepeso";
                    }
                    else if(imc>27.3 && imc<=32.3){
                        return "Seu IMC: Acima do peso ideal";
                    }
                    else if(imc>32.3){
                        return "Seu IMC: Obeso";
                    }
                }
                return "nada";
        }
                
            
        
        
	/*public static String descricaoDaMaioridade(boolean maiorDeIdade) {
		if (maiorDeIdade) {
			return "De maior mano!";
		} else {
			return "De menor mano!";
		}
	}

	public static String descricaoDaMaioridade(int idade) {
		return descricaoDaMaioridade(maiorDeIdade(idade));
	}*/
}
