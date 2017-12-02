/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package exercise11;

/**
 *
 * @author austinreese
 */
  public class Foo<T,U>{
      private T fuzz;
      private U buzz;

        public Foo(T fuzz, U buzz) {
            this.fuzz = fuzz;
            this.buzz = buzz;
        }

        public T getFuzz() {
            return fuzz;
        }

        public U getBuzz() {
            return buzz;
        }

        public void setFuzz(T fuzz) {
            this.fuzz = fuzz;
        }

        public void setBuzz(U buzz) {
            this.buzz = buzz;
        }

        @Override
        public String toString() {
            return "Foo{" + "fuzz=" + fuzz + ", buzz=" + buzz + '}';
        }
      
      
  }
