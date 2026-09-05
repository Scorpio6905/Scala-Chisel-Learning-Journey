error id: file://<WORKSPACE>/src/main/scala/regfile/regfile.scala:`<error>`#`<error>`.
file://<WORKSPACE>/src/main/scala/regfile/regfile.scala
empty definition using pc, found symbol in pc: 
empty definition using semanticdb
empty definition using fallback
non-local guesses:
	 -chisel3/when.
	 -chisel3/when#
	 -chisel3/when().
	 -when.
	 -when#
	 -when().
	 -scala/Predef.when.
	 -scala/Predef.when#
	 -scala/Predef.when().
offset: 635
uri: file://<WORKSPACE>/src/main/scala/regfile/regfile.scala
text:
```scala
package regfile

import chisel3._

trait Config {
    val XLEN = 32
 
}

class RegFileIO extends Bundle with Config{
    val raddr1 = Input(UInt(5.W))
    val raddr2 = Input(UInt(5.W))
    val rdata1 = Output(UInt(XLEN.W))
    val rdata2 = Output(UInt(XLEN.W))
    val wen =  Input(Bool())
    val waddr = Input(UInt(5.W))
    val wdata = Input(UInt(XLEN.W))
}

class RegFile extends Module with Config{

    val io = IO ( new RegFileIO )
    val regs = Reg (Vec(32 , UInt(XLEN.W)))
    regs(8) = 80.U
    io.rdata1 := Mux((io.raddr1.orR ) , regs(io.raddr1) , 0.U )
    io.rdata2 := Mux((io.raddr2.orR ) , regs(io.raddr2) , 0.U )
    w@@hen (io.wen & io.waddr.orR) {
        regs (io.waddr) := io.wdata   
    }
}

```


#### Short summary: 

empty definition using pc, found symbol in pc: 