error id: file://<WORKSPACE>/src/main/scala/regfile/ControlDecode.scala:
file://<WORKSPACE>/src/main/scala/regfile/ControlDecode.scala
empty definition using pc, found symbol in pc: 
empty definition using semanticdb
empty definition using fallback
non-local guesses:
	 -chisel3/load.
	 -chisel3/load#
	 -chisel3/load().
	 -chisel3/util/load.
	 -chisel3/util/load#
	 -chisel3/util/load().
	 -load.
	 -load#
	 -load().
	 -scala/Predef.load.
	 -scala/Predef.load#
	 -scala/Predef.load().
offset: 888
uri: file://<WORKSPACE>/src/main/scala/regfile/ControlDecode.scala
text:
```scala
import chisel3._
import chisel3.util._


class ControlDecode extends Module {
    val io = IO(new Bundle {

        val Rformat = Input(Bool())
        val load = Input(Bool())
        val Store = Input(Bool())
        val Branch = Input(Bool())
        val Itype = Input(Bool())
        val JALR = Input(Bool())
        val JAL = Input(Bool())
        val Lui = Input(Bool())

        val MemWrite = Output(Bool())
        val BranchOut = Output(Bool())
        val MemRead = Output(Bool())
        val RegWrite = Output(Bool())
        val MemtoReg = Output(Bool())
        val ALUOP = Output(UInt(3.W))
        val operandAsel = Output(UInt(2.W))
        val operandBsel = Output(Bool())
        val extend_sel = Output(UInt(2.W))
        val next_PC_sel = Output(UInt(2.W))    
  })

  io.ALUOP := 8.U
  when(Rformat === 1.B){
    io.RegWrite := 1
    io.ALUOP := 0.Unit
  }.elsewhen(@@load === 1.B){
    io.MemRead := 1.B
    
  }


}
```


#### Short summary: 

empty definition using pc, found symbol in pc: 