package net.interition.sparqlycode.pmdtestsuite;

/**
 * 
 * @author Adam Nogradi, Interition Ltd.
 *
 */
public class FieldDeclarationsShouldBeAtStartOfClass {
        public int thisIsDeclaredAtTheCorrectPlace = 0;
        // Comment out all fields declared after this point to make the test fail.
        private void doStuff () {

        }

        private String thisShouldBeDeclaredAtTheTop;

        public void doOtherStuff () {

        }
        public int thisIsntCorrectEither;

       private class InnerClass {
         public void innerClassMethod () {}
         private int innerClassInt;
       }
       private String stringAfterInnerClass;
}
