error id: file://<WORKSPACE>/src/main/scala/Gates/Mux4to1.scala:
file://<WORKSPACE>/src/main/scala/Gates/Mux4to1.scala
empty definition using pc, found symbol in pc: 
empty definition using semanticdb
empty definition using fallback
non-local guesses:
	 -chisel3/chisel3.
	 -chisel3.
	 -scala/Predef.chisel3.
offset: 21
uri: file://<WORKSPACE>/src/main/scala/Gates/Mux4to1.scala
text:
```scala
package Gates
import @@chisel3._
import javax.swing.UIManager.LookAndFeelInfo


class Mux4to1 extends Module {
    val io = IO(new Bundle{

            val a = Input(Bool())
            val b = Input(Bool())
            val c = Input(Bool())
            val d = Input(Bool())
            val s1 = Input(Bool())
            val s2 = Input(Bool()) 
            val out = Output(Bool())
    
    })

    val mux1 = Module(new Mux2to1)
    val mux2 = Module(new Mux2to1)
    val mux3 = Module(new Mux2to1)

    mux1.io.a := io.a
    mux1.io.b := io.b
    mux1.io.s1 := io.s1

    mux2.io.a := io.c
    mux2.io.b := io.d
    mux2.io.s1 := io.s1

    mux3.io.a := mux1.io.out
    mux3.io.b := mux2.io.out    
    mux3.io.s1 := io.s2

    io.out := mux3.io.out


}       
```


#### Short summary: 

empty definition using pc, found symbol in pc: 