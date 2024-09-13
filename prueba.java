public class prueba {

    public static void main(String[] args) {
        Manosmn manosmn = new Manosmn(10, 100);
        Piernasmn piernasmn = new Piernasmn(35, 3.6);
        Torsomn torsomn = new Torsomn("hierro", 350);
        Cabezamn cabezamn = new Cabezamn("optico", 1080);

        Robotmn robotmn = new Robotmn(manosmn, piernasmn, torsomn, cabezamn);
        robotmn.operarmn();

        Outfitmn cascomn = new Cascomn("titanio", 1.8);
        Outfitmn armaduramn = new Armaduramn("ligera", 100);

        cascomn.aplicarmn(robotmn);
        armaduramn.aplicarmn(robotmn);
    }

    // Clase Manosmn
    public static class Manosmn {
        private int dedosmn;
        private int fuerzamn;

        public Manosmn(int dedosmn, int fuerzamn) {
            this.dedosmn = dedosmn;
            this.fuerzamn = fuerzamn;
        }

        public void agarrarmn() {
            System.out.println("Agarrando con " + dedosmn + " dedos con una fuerza de " + fuerzamn + ".");
        }

        public int getDedosmn() {
            return dedosmn;
        }

        public void setDedos(int dedosmn) {
            this.dedosmn = dedosmn;
        }

        public int getFuerzamn() {
            return fuerzamn;
        }

        public void setFuerzamn(int fuerzamn) {
            this.fuerzamn = fuerzamn;
        }
    }

    // Clase Piernasmn
    public static class Piernasmn {
        private int velocidadmn;
        private double largomn;

        public Piernasmn(int velocidadmn, double largomn) {
            this.velocidadmn = velocidadmn;
            this.largomn = largomn;
        }

        public void caminarmn() {
            System.out.println("Caminando a " + velocidadmn + " km/h con una longitud de " + largomn + " metros.");
        }

        public int getVelocidadmn() {
            return velocidadmn;
        }

        public void setVelocidadmn(int velocidadmn) {
            this.velocidadmn = velocidadmn;
        }

        public double getLongitudmn() {
            return largomn;
        }

        public void setLongitudmn(double largomn) {
            this.largomn = largomn;
        }
    }

    // Clase Torsomn
    public static class Torsomn {
        private String materialmn;
        private int capacidadCargamn;

        public Torsomn(String materialmn, int capacidadCargamn) {
            this.materialmn = materialmn;
            this.capacidadCargamn = capacidadCargamn;
        }

        public void mostrarInfo() {
            System.out.println(
                    "Torso hecho de " + materialmn + " con capacidad de carga de " + capacidadCargamn + " kg.");
        }

        public String getMaterialmn() {
            return materialmn;
        }

        public void setMaterialmn(String materialmn) {
            this.materialmn = materialmn;
        }

        public int getCapacidadCargamn() {
            return capacidadCargamn;
        }

        public void setCapacidadCargamn(int capacidadCargamn) {
            this.capacidadCargamn = capacidadCargamn;
        }
    }

    // Clase Cabezamn
    public static class Cabezamn {
        private String ojosmn;
        private int resolucionmn;

        public Cabezamn(String ojosmn, int resolucionmn) {
            this.ojosmn = ojosmn;
            this.resolucionmn = resolucionmn;
        }

        public void reconocer() {
            System.out.println(
                    "Reconociendo con sensor tipo " + ojosmn + " y resolución de " + resolucionmn + " píxeles.");
        }

        public String getojosmn() {
            return ojosmn;
        }

        public void setojosmn(String ojosmn) {
            this.ojosmn = ojosmn;
        }

        public int getResolucionmn() {
            return resolucionmn;
        }

        public void setResolucionmn(int resolucionmn) {
            this.resolucionmn = resolucionmn;
        }
    }

    // Clase Outfitmn
    public static abstract class Outfitmn {
        public abstract void aplicarmn(Robotmn robotmn);
    }

    // Clase Cascomn
    public static class Cascomn extends Outfitmn {
        private String materialmn;
        private double pesomn;

        public Cascomn(String materialmn, double pesomn) {
            this.materialmn = materialmn;
            this.pesomn = pesomn;
        }

        public void aplicarmn(Robotmn robotmn) {
            System.out.println("Aplicando casco hecho de " + materialmn + " y con un peso de " + pesomn + " kg.");
        }

        public String getMaterialmn() {
            return materialmn;
        }

        public void setMaterialmn(String materialmn) {
            this.materialmn = materialmn;
        }

        public double getPesomn() {
            return pesomn;
        }

        public void setPesomn(double pesomn) {
            this.pesomn = pesomn;
        }
    }

    // Clase Armaduramn
    public static class Armaduramn extends Outfitmn {
        private String tipomn;
        private int resistenciamn;

        public Armaduramn(String tipomn, int resistenciamn) {
            this.tipomn = tipomn;
            this.resistenciamn = resistenciamn;
        }

        public void aplicarmn(Robotmn robotmn) {
            System.out.println("Aplicando armadura de tipo " + tipomn + " con resistencia de " + resistenciamn + ".");
        }

        public String getTipomn() {
            return tipomn;
        }

        public void setTipomn(String tipomn) {
            this.tipomn = tipomn;
        }

        public int getResistenciamn() {
            return resistenciamn;
        }

        public void setResistenciamn(int resistenciamn) {
            this.resistenciamn = resistenciamn;
        }
    }

    // Clase Robotmn
    public static class Robotmn {
        private Manosmn manosmn;
        private Piernasmn piernasmn;
        private Torsomn torsomn;
        private Cabezamn cabezamn;

        public Robotmn(Manosmn manosmn, Piernasmn piernasmn, Torsomn torsomn, Cabezamn cabezamn) {
            this.manosmn = manosmn;
            this.piernasmn = piernasmn;
            this.torsomn = torsomn;
            this.cabezamn = cabezamn;
        }

        public void operarmn() {
            manosmn.agarrarmn();
            piernasmn.caminarmn();
            torsomn.mostrarInfo();
            cabezamn.reconocer();
        }

        // Getters y Setters
        public Manosmn getManosmn() {
            return manosmn;
        }

        public void setManosmn(Manosmn manosmn) {
            this.manosmn = manosmn;
        }

        public Piernasmn getPiernasmn() {
            return piernasmn;
        }

        public void setPiernasmn(Piernasmn piernasmn) {
            this.piernasmn = piernasmn;
        }

        public Torsomn getTorsomn() {
            return torsomn;
        }

        public void setTorsomn(Torsomn torsomn) {
            this.torsomn = torsomn;
        }

        public Cabezamn getCabezamn() {
            return cabezamn;
        }

        public void setCabezamn(Cabezamn cabezamn) {
            this.cabezamn = cabezamn;
        }
    }

}
