package module25packageJava0;

public class Foo4 {
  public void foo0() {
    final Runnable anything = () -> System.out.println("anything");
    new module25packageJava0.Foo3().foo3();
  }

  public void foo1() {
    final Runnable anything = () -> System.out.println("anything");
    foo0();
  }

  public void foo2() {
    final Runnable anything = () -> System.out.println("anything");
    foo1();
  }

  public void foo3() {
    final Runnable anything = () -> System.out.println("anything");
    foo2();
  }
}
