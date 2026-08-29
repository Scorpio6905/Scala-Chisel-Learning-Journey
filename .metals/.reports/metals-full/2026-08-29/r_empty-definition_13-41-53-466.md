error id: file://<WORKSPACE>/src/main/scala/lab2/Ex1.scala:`<error>`#`<error>`.
file://<WORKSPACE>/src/main/scala/lab2/Ex1.scala
empty definition using pc, found symbol in pc: 
empty definition using semanticdb
empty definition using fallback
non-local guesses:
	 -chisel3/Input.
	 -chisel3/Input#
	 -chisel3/Input().
	 -chisel3/util/Input.
	 -chisel3/util/Input#
	 -chisel3/util/Input().
	 -Input.
	 -Input#
	 -Input().
	 -scala/Predef.Input.
	 -scala/Predef.Input#
	 -scala/Predef.Input().
offset: 208
uri: file://<WORKSPACE>/src/main/scala/lab2/Ex1.scala
text:
```scala
package lab2
import chisel3._
import chisel3.util._
// Mux IO interface class
class Mux_2to1_IO extends Bundle {
        val in_A = Input(UInt(32.W))
        val in_B = Input(UInt(32.W))
        val select = @@Input(Bool())
        val out = Output(UInt(32.W))
}
// 2 to 1 Mux implementation

class Mux_2to1 extends Module {
    val io = IO (new Mux_2to1_IO)

    val select = Fill(32, io.select)
    val and_output1 = io.in_A & ~(select)
    val and_output2 = io.in_B & select
    io.out := and_output1 | and_output2
}
```


#### Short summary: 

empty definition using pc, found symbol in pc: 