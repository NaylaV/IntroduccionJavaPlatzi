public class ifStatement {
    public static void main(String[] args) {
        boolean isBluetoothEnabled = false;
        int fileSended = 3;

        if (isBluetoothEnabled){
            //Send file
            fileSended++;
            System.out.println("Archivo enviado");
        }else {
            fileSended--;
            System.out.println("Por favor encender Bluetooth, para inciar la transmision");
        }

    }
}
