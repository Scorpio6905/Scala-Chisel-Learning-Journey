error id: file://<WORKSPACE>/src/main/scala/lab3/Valid_Interface.scala:
file://<WORKSPACE>/src/main/scala/lab3/Valid_Interface.scala
empty definition using pc, found symbol in pc: 
empty definition using semanticdb
empty definition using fallback
non-local guesses:
	 -chisel3.
	 -chisel3#
	 -chisel3().
	 -chisel3/util.
	 -chisel3/util#
	 -chisel3/util().
	 -scala/Predef.
	 -scala/Predef#
	 -scala/Predef().
offset: 530
uri: file://<WORKSPACE>/src/main/scala/lab3/Valid_Interface.scala
text:
```scala
package lab3
import chisel3._
import chisel3.util._

class DecoderIO extends Bundle {
    val in = Input (UInt(2.W))
    val out = Output (UInt(4.W))
}

class LM_IO_Interface_decoder_with_valid extends Bundle {
    val in = Input(UInt(2.W))
    val out = Valid(Output(UInt(4.W)))
}

class Decoder2to4 extends Module {
    val io = IO (new LM_IO_Interface_decoder_with_valid)
    io.out.bits := 0.U

    switch (io.in) {
    is ("b00".U) {
        io.out.bits := "b0001".U
        io.out.valid := true.B
       
    }
    is("b01".@@U) {
        io.out.bits := "b0010".U

    }
    is ("b10".U) {
        io.out.bits := "b0100".U
    }
    is ("b11".U) {
        io.out.bits := "b1000".U
    }
  }
}


```


#### Short summary: 

empty definition using pc, found symbol in pc: 