error id: file://<WORKSPACE>/src/main/scala/lab3/Encoderswitch.scala:`<error>`#`<error>`.
file://<WORKSPACE>/src/main/scala/lab3/Encoderswitch.scala
empty definition using pc, found symbol in pc: 
empty definition using semanticdb
empty definition using fallback
non-local guesses:
	 -chisel/UInt.
	 -chisel/UInt#
	 -chisel/UInt().
	 -UInt.
	 -UInt#
	 -UInt().
	 -scala/Predef.UInt.
	 -scala/Predef.UInt#
	 -scala/Predef.UInt().
offset: 102
uri: file://<WORKSPACE>/src/main/scala/lab3/Encoderswitch.scala
text:
```scala
import chisel._

class EncoderIO extends Bundle {
    val in = Input(UInt(4.W))
    val out = Output(U@@Int(2.W))
}

class Encoderswitch extends Module {
    val io = IO(new DecoderIO)
    io.out := 0.U
    switch (io.in) {
    is ("b0000".U) {
        io.out := "b01".U
    }
    is ("b0010".U) {
        io.out := "b01".U
    
    }
    is ("b0100".U) {
       io.out := "b10".U
    }
    is ("b1000".U) {
        io.out := "b11".U
    }
 }
}
```


#### Short summary: 

empty definition using pc, found symbol in pc: 