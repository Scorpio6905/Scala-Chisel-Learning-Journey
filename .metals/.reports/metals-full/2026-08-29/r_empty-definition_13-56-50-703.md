error id: file://<WORKSPACE>/src/main/scala/lab2/Mux5to1.scala:Lab2/`<error: <none>>`.
file://<WORKSPACE>/src/main/scala/lab2/Mux5to1.scala
empty definition using pc, found symbol in pc: 
empty definition using semanticdb
empty definition using fallback
non-local guesses:
	 -chisel3/chisel3.
	 -chisel3.
	 -scala/Predef.chisel3.
offset: 27
uri: file://<WORKSPACE>/src/main/scala/lab2/Mux5to1.scala
text:
```scala
package Lab2
import chisel3@@._

class LM_IO_Interface extends Bundle {

    val s0 = Input(Bool())
    val s1 = Input(Bool())
    val s2 = Input(Bool())
    val out = Output(UInt(32.W))
}

class Mux5to1 extends Module {
    val io = IO(new LM_IO_Interface)
    

    io.out := MuxCase(false.B, Array(
    (io.s0===0.B && io.s1===0.B && io.s2===0.B)-> 0.U,
    (io.s0===0.B && io.s1===0.B && io.s2===1.B)-> 8.U,
    (io.s0===0.B && io.s1===1.B && io.s2===0.B)-> 16.U,
    (io.s0===0.B && io.s1===1.B && io.s2===1.B)-> 24.U,
    (io.s0===1.B && io.s1===0.B && io.s2===0.B)-> 32.U
    ))

}


    
    








```


#### Short summary: 

empty definition using pc, found symbol in pc: 