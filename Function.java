public class Function{
    public static void main(String[] args) {
        double y = 3;


        //area de un circulo
        //pi * r2
        circuleArea(y);

        //area de una esfera
        //4*PI*r2
        sphereArea(y);

        //volumen de una esfera
        //(4/3)*PI*r3
        sphereVolumen(y);

        //Pasar PESOS A DOLARES
        System.out.println("Pesos a dolares: " + coverToDolar(200,"ARG"));

    }

    public static double circuleArea(double r){
        return Math.PI * Math.pow(r,2);
    }

    public static double sphereArea(double r){
        return 4 * Math.PI * Math.pow(r,2);
    }

    public static double sphereVolumen(double r){
        double v = (4 / 3) * Math.PI * Math.pow(r, 3);
        return v;
    }

    /**
     * Descrippcion: esta funcion que especificando su moneda convierte pesos a dolares
     *
     * @param quantify Cantidad de dinero
     * @param currency Tipo de Moneda: Solo acepta MXN o ARG
     * @return quantity Devuelve la cantidad actualizada en dolares
     * */
    public static double coverToDolar(double quantify, String currency ){
        switch (currency){
            case "MXN":
                quantify = quantify * 0.052;
                break;
            case "ARG":
                quantify = quantify * 0.0045;
                break;
        }
        return quantify;
    }
}

