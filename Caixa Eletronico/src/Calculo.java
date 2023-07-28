public class Calculo {
        private int num1;
        private int notade100 = 0;
        private int notade50 = 0;
        private int notade20 = 0;
        private int notade10 = 0;
        private int notade5 = 0;
        private int notade2 = 0;
        private int notade1 = 0;

        public Calculo(int a) {
                this.num1 = a;
                this.notade100 = this.num1/100;
                int resto = this.num1 % 100;

                if (resto != 0) {
                        this.notade50 = resto / 50;
                        resto = resto % 50;
                }
                if (resto != 0) {
                        this.notade20 = resto / 20;
                        resto = resto % 20;
                }
                if (resto != 0) {
                        this.notade10 = resto / 10;
                        resto = resto % 10;
                }
                if (resto != 0) {
                        this.notade5 = resto / 5;
                        resto = resto % 5;
                }
                if (resto != 0) {
                        this.notade2 = resto / 2;
                        resto = resto % 2;
                }
                if (resto != 0) {
                        this.notade1 = resto / 1;
                        resto = resto % 1;
                }
        }

        public int getNotade100() {
                return notade100;
        }

        public int getNotade50() {
                return notade50;
        }

        public int getNotade20() {
                return notade20;
        }

        public int getNotade10() {
                return notade10;
        }

        public int getNotade5() {
                return notade5;
        }

        public int getNotade2() {
                return notade2;
        }

        public int getNotade1() {
                return notade1;
        }
}