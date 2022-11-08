

        class QClass{

            String name = "Zehra";

            int age= 7;

            int weight = 30;



            QClass () { }



            QClass(String name, int age) {

                this.name =name;

                this.age =age;

            }



            QClass(String name){

                this.name =name;

            }



            public static void main(String[] args) {

                QClass person1 = new QClass("A");
                System.out.println("person1 = " + person1);
                denem();

            }

            private static void denem() {
            }


        }
