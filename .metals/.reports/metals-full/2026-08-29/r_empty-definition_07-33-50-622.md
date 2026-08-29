error id: file://<WORKSPACE>/src/main/scala/lab2/Ex2.scala:`<error>`#`<error>`.
file://<WORKSPACE>/src/main/scala/lab2/Ex2.scala
empty definition using pc, found symbol in pc: 
empty definition using semanticdb
empty definition using fallback
non-local guesses:
	 -chisel3/Output.
	 -chisel3/Output#
	 -chisel3/Output().
	 -chisel3/util/Output.
	 -chisel3/util/Output#
	 -chisel3/util/Output().
	 -Output.
	 -Output#
	 -Output().
	 -scala/Predef.Output.
	 -scala/Predef.Output#
	 -scala/Predef.Output().
offset: 422
uri: file://<WORKSPACE>/src/main/scala/lab2/Ex2.scala
text:
```scala
package lab2
import chisel3._
import chisel3.util._


class Ex2 extends Module {
    val io = IO(new Bundle{
        val in0 = Input(Bool())
        val in1 = Input(Bool())
        val in2 = Input(Bool())
        val in3 = Input(Bool())
        val in4 = Input(Bool())
        val in5 = Input(Bool())
        val in6 = Input(Bool())
        val in7 = Input(Bool())
        val sel2 = Input(UInt(3.W))
        val out = Out@@put(Bool())
    })
    io.out := MuxLookup(io.sel2 , false.B, Array(
    (0.U)-> io.in0,
    (1.U)-> io.in1,
    (2.U)-> io.in2,
    (3.U)-> io.in3,
    (4.U)-> io.in4,
    (5.U)-> io.in5,
    (6.U)-> io.in6,
    (7.U)-> io.in7)
)
}




```


#### Short summary: 

empty definition using pc, found symbol in pc: 