class Scratch {
    public static void main(String[] args) {
        B b = new B();
        D d = new D(b);
        d.useA();
    }

    static class D{
        private A a;
        public D(A a){
            this.a = a;
        }
        public void useA(){
            //useA
        }
    }

    public interface A{
        void function();
    }

    static class B implements A{

        @Override
        public void function() {

        }
    }
}

class Singleton{
    private static Singleton INSTANCE;
    public static synchronized Singleton getInstance(){
        if(INSTANCE == null){
            return new Singleton();
        }else {
            return INSTANCE;
        }
    }
}
