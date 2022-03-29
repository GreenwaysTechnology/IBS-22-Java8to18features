package com.ibs.javafeatures.nestedclassprivate;

import java.lang.reflect.Method;

//calling private method of outerclass from the inner class via reflection is possible now

class Outer {

    public void outerPublic() throws Exception {
        Inner inner = new Inner();
        inner.innerPublicReflection(new Outer());
    }

    private void outerPrivate() {
        System.out.println("private methods");
    }

    class Inner {

        public void innerPublicReflection(Outer ob) throws Exception {
            System.out.println("ref");
            Method method = ob.getClass().getDeclaredMethod("outerPrivate");
            method.invoke(ob);
        }
    }
}
public class NestMain {
    public static void main(String[] args) throws Exception {
        Outer outer = new Outer();
        outer.outerPublic();
    }
}