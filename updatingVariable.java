public class updatingVariable {
    public static void main(String[] args) {
        int salary=2000;

        //bono $200
        salary = salary +200;
        System.out.println("Suma del salario con bono: "+ salary);

        //pension: $50 descuento
        salary += 50;
        System.out.println("Suma del salario, mas el descuento: " + salary);

        //2 horas extra $30 c/u
        //Cupon comida $45
        salary += (30*2) +45;
        System.out.println("La suma del salario, mas las dos horas extras y el descuento: " + salary);
        
        //Actualizando cadena de textos
        String empleeName = "Rubio Lescano";
        empleeName += " Loloco";
        System.out.println(empleeName);

        empleeName= "Jiju" + empleeName;
        System.out.println("Tu nombre completo es: " + empleeName);
    }
}
