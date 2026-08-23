error id: file://<WORKSPACE>/src/main/scala/Gates/Mux2to1.scala:
file://<WORKSPACE>/src/main/scala/Gates/Mux2to1.scala
empty definition using pc, found symbol in pc: 
empty definition using semanticdb
empty definition using fallback
non-local guesses:
	 -chisel3/Bool.
	 -chisel3/Bool#
	 -chisel3/Bool().
	 -Bool.
	 -Bool#
	 -Bool().
	 -scala/Predef.Bool.
	 -scala/Predef.Bool#
	 -scala/Predef.Bool().
offset: 275
uri: file://<WORKSPACE>/src/main/scala/Gates/Mux2to1.scala
text:
```scala
package Gates
import chisel3._
import javax.swing.UIManager.LookAndFeelInfo


class Mux2to1 extends Module {
    val io = IO(new Bundle{

            val a = Input(Bool())
            val b = Input(Bool())
            val s1 = Input(Bool()) 
            val out = Output(Bool@@())
    
    })

    val and_output1 = io.a & ~(io.s1)
    val and_output2 = io.b & io.s1
    io.out := and_output1 || and_output2
    
    }

```


#### Short summary: 

empty definition using pc, found symbol in pc: 