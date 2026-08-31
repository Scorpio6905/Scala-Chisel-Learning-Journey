error id: file://<WORKSPACE>/src/main/scala/lab3/Valid_Interface.scala:out.
file://<WORKSPACE>/src/main/scala/lab3/Valid_Interface.scala
empty definition using pc, found symbol in pc: 
empty definition using semanticdb
empty definition using fallback
non-local guesses:
	 -chisel3/io/out.
	 -chisel3/io/out#
	 -chisel3/io/out().
	 -chisel3/util/io/out.
	 -chisel3/util/io/out#
	 -chisel3/util/io/out().
	 -io/out.
	 -io/out#
	 -io/out().
	 -scala/Predef.io.out.
	 -scala/Predef.io.out#
	 -scala/Predef.io.out().
offset: 253
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
class Decoder2to4 extends Module {
    val io = IO ( new LM_IO_Interface_decoder_with_valid )
    io.@@out := 0.U
    switch (io.in) {
    is ("b00".U) {
        io.out := "b0001".U
    }
    is("b01".U) {
        io.out := "b0010".U

    }
    is ("b10".U) {
        io.out := "b0100".U
    }
    is ("b11".U) {
        io.out := "b1000".U
    }
  }
}

class LM_IO_Interface_decoder_with_valid extends Bundle {
    val in = Input(UInt(2.W))
    val out = Valid(Output(UInt(4.W)))
}

class decoder_with_valid extends Module {
    val io = IO (new LM_IO_Interface_decoder_with_valid)
    val decio = Flipped(IO(new DecoderIO))


    decoder_with_valid <> decio

    io.out := decio.out


    


} 
```


#### Short summary: 

empty definition using pc, found symbol in pc: 