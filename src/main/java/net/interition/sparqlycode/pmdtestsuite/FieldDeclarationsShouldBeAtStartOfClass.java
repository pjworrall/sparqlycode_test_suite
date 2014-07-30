package net.interition.sparqlycode.pmdtestsuite;

public class FieldDeclarationsShouldBeAtStartOfClass {
        public int thisIsDeclaredAtTheCorrectPlace = 0;

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
