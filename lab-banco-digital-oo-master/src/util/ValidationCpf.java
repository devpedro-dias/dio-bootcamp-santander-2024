package util;

public class ValidationCpf{

    public boolean isCPF(String cpf){

        String number = removeCaracteresEspeciais(cpf);

        if (number.equals("00000000000") || number.equals("11111111111") || 
        number.equals("22222222222") || number.equals("33333333333") || number.equals("44444444444") || 
        number.equals("55555555555") || number.equals("66666666666") || number.equals("77777777777") || 
        number.equals("88888888888") || number.equals("99999999999") || (number.length() != 11)){
            return false;        
        }

        if(number.length() != 11){
            return false;
        }

      return true;
    }


    private String removeCaracteresEspeciais(String doc) {
		if (doc.contains(".")) {
			doc = doc.replace(".", "");
		}
		if (doc.contains("-")) {
			doc = doc.replace("-", "");
		}
		if (doc.contains("/")) {
			doc = doc.replace("/", "");
		}
		return doc;
	}

}